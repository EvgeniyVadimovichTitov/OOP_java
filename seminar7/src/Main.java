import controller.Controller;
import logger.ContrLogger;
import logger.FileLogger;
import model.*;
import view.View;

public class Main {
    public static void main(String[] args) {
        String fileName = "Notebook.csv";
        String fileLog = "log.txt";
        View view = new View(new ContrLogger(new FileLogger(fileLog),new Controller(new RepositoryFile(new NoteMapper(),
                new FileOperationlmpl(fileName)))));
        view.buttonClick();
    }
}