package logger;

import controller.Controllable;
import model.Note;

import java.util.List;

public class ContrLogger implements Controllable {
    private Loggable log;
    private Controllable controller;
    public ContrLogger(Loggable log, Controllable controller) {
        this.log = log;
        this.controller = controller;
        log.log("Notebook is running");
    }

    @Override
    public void create(Note note) {
        controller.create(note);
        log.log(String.format("Creating note with id - %s, head - %s", note.getIdNote(), note.getHead()));
    }

    @Override
    public Note read(String id) throws Exception {
        Note note = controller.read(id);
        log.log(String.format("Reading note with id - %s, head - %s", note.getIdNote(), note.getHead()));
        return note;
    }

    @Override
    public List<Note> readAll() {
        log.log("Reading all notes in notebook");
        return controller.readAll();
    }

    @Override
    public void update(String id, Note newNote) throws Exception {
        controller.update(id,newNote);
        log.log("Updating note id - " + id);
    }

    @Override
    public void delete(String id) throws Exception {
        controller.delete(id);
        log.log("Deleting note id - "+id);
    }
}
