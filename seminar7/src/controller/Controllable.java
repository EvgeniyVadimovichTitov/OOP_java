package controller;

import model.Note;

import java.util.List;

public interface Controllable {
    void create(Note note);
    Note read (String id) throws  Exception;
    List<Note> readAll();
    void update(String id, Note newNote) throws Exception;
    void delete(String id) throws Exception;
}
