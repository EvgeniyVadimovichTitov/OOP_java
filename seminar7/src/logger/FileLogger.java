package logger;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileLogger implements Loggable{

    private String fileLogName;
    public FileLogger(String fileLogName) {
        this.fileLogName = fileLogName;
        try (FileWriter fw = new FileWriter(fileLogName, true)){
            fw.flush();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    @Override
    public void log(String arg) {
        LocalDateTime data = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss");
        try (FileWriter fw = new FileWriter(fileLogName, true)){
            fw.write(String.format("%s: %s;\n", dtf.format(data),arg));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
