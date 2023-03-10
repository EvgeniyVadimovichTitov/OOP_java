package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Note {
    private String idNote = "";
    private String head;
    private String text;
    private String data;
    public Note(String head, String text) {
        this.head = head;
        this.text = text;
    }

    public Note(String idNote, String data, String head, String text) {
        this(head, text);
        this.idNote = idNote;
        this.data = data;
    }

    public String getIdNote() {
        return idNote;
    }

    public void setIdNote(String idNote) {
        this.idNote = idNote;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    //for limit text field when output is 7 words
    private String redactForShowText() {
        StringBuilder res = new StringBuilder();
        String[] buff = this.text.split(" ");
        int i = 0;
        while (i < buff.length) {
            res.append(buff[i] + " ");
            i++;
            if (i % 7 == 0) {res.append("\n");}
        }
        return res.toString();
    }

    @Override
    public String toString() {
        return String.format("\nNote № %s; data - %s; head - %s:\n%s\n", this.idNote, this.data, this.head, redactForShowText());
    }
}