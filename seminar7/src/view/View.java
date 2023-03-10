package view;

import logger.ContrLogger;
import model.Note;

import java.util.List;
import java.util.Scanner;

public class View {
    private final ContrLogger controllerWithLog;

    public View(ContrLogger controller) {
        this.controllerWithLog = controller;
    }

    public void buttonClick(){
        Commands com;
        Commands[] coms = Commands.values();
        System.out.println("List of available commands: ");
        for (Commands i:coms) {
            System.out.println(i);
        }
        while (true){
            String command = sin("Input command:\n");
            try {
                com = Commands.valueOf(command.toUpperCase());
                if(com == Commands.EXIT) return;
                switch (com){
                    case CREATE -> createNote();
                    case READ -> readNote();
                    case UPDATE -> updateNote();
                    case LIST -> readAllNotes();
                    case DEL -> delNote();
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());;
            }
        }

    }

    private void readNote() throws Exception {
        String id = sin("Input id note for read: ");
        System.out.println(controllerWithLog.read(id));
    }
    private void createNote(){
        controllerWithLog.create(inputNote());
        System.out.println("Completed create...");
    }
    private void updateNote() throws Exception {
        controllerWithLog.update(sin("Input id note for found to update: "), inputNote());
        System.out.println("Completed update...");
    }
    private void readAllNotes(){
        List<Note> notes = controllerWithLog.readAll();
        if(notes.size()>0){
            System.out.println(notes);
        }else {
            System.out.println("Notebook is empty");
        }
    }
    private void delNote() throws Exception {
        controllerWithLog.delete(sin("Input id note for delete: "));
        System.out.println("Completed delete...");
    }
    private Note inputNote(){
        return new Note(sin("Input head: "),sin("Input text: "));
    }
    private String sin(String message){
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
