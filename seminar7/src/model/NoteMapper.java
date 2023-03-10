package model;

public class NoteMapper implements NoteMapply{
    @Override
    public String map(Note note) {
        return String.format("%s;%s;%s;%s", note.getIdNote(),note.getData(), note.getHead(),note.getText());
    }

    @Override
    public Note map(String line) {
        String[] buff = line.split(";");
        return new Note(buff[0],buff[1],buff[2],buff[3]);
    }
}
