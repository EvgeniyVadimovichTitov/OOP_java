package model;

import java.util.List;

public interface Repository {
    void createNewNote(Note note);
    void saveNotes(List<Note> notes);
    List<Note> getAllNotes();
}
