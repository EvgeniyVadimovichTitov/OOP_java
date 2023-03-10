package model;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileOperationlmpl implements FileOperation{

    private String fileName;
    public FileOperationlmpl(String fileName) {
        this.fileName = fileName;
        try   (FileWriter writer = new FileWriter(fileName, true)){
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<String> readAllLines() {
        List<String> lines = new ArrayList<>();
        try {
            FileReader r = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(r);
            String line = reader.readLine();
            while (line!=null){
                lines.add(line);
                line=reader.readLine();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return lines;
    }

    @Override
    public void saveAllLines(List<String> lines) {
        try(FileWriter w = new FileWriter(fileName, false)){
            for (String line:lines) {
                w.write(line);
                w.write('\n');
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
