package controller;

import model.Note;
import model.Repository;

import java.util.List;

public class Controller implements Controllable{
    private final Repository rep;

    public Controller(Repository rep) {
        this.rep = rep;
    }
    @Override
    public void create(Note note){
        rep.createNewNote(note);
    }
    @Override
    public Note read(String id) throws Exception{
        return searchNote(rep.getAllNotes(), id);
    }
    @Override
    public List<Note> readAll(){
        return rep.getAllNotes();
    }
    @Override
    public void update(String id, Note newNote) throws Exception{
        List<Note> notes = rep.getAllNotes();
        Note note = searchNote(notes, id);
        note.setHead(newNote.getHead());
        note.setText(newNote.getText());
        rep.saveNotes(notes);
    }
    @Override
    public void delete(String id) throws Exception{
        List<Note> notes = rep.getAllNotes();
        Note note = searchNote(notes,id);
        notes.remove(note);
        rep.saveNotes(notes);
    }
    private Note searchNote(List<Note> notes, String id) throws Exception {
        for (Note i:notes) {
            if (i.getIdNote().equals(id)){
                return i;
            }
        }
        throw new Exception("Note not found");
    }
}
