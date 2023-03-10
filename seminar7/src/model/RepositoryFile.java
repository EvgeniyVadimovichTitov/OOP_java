package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class RepositoryFile implements Repository{
    private NoteMapply mapper;
    private FileOperation fileOperation;

    public RepositoryFile(NoteMapply mapper, FileOperation fileOperation) {
        this.mapper = mapper;
        this.fileOperation = fileOperation;
    }
    @Override
    public List<Note> getAllNotes() {
        List<String> lines = fileOperation.readAllLines();
        List<Note> notes = new ArrayList<>();
        for (String line:lines) {
            notes.add(mapper.map(line));
        }
        return notes;
    }

    @Override
    public void createNewNote(Note note) {
        List<Note> notes = getAllNotes();
        LocalDateTime data = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss");
        int max = 0;
        for (Note i:notes) {
            int id = Integer.parseInt(i.getIdNote());
            if (max < id) {
                max = id;
            }
        }
        note.setData(dtf.format(data));
        note.setIdNote(String.format("%d",++max));
        notes.add(note);
        saveNotes(notes);
    }

    @Override
    public void saveNotes(List<Note> notes) {
        List<String> lines = new ArrayList<>();
        for (Note i:notes) {
            lines.add(mapper.map(i));
        }
        fileOperation.saveAllLines(lines);
    }

}
