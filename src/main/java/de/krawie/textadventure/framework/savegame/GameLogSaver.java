package de.krawie.textadventure.framework.savegame;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GameLogSaver {
    
    private final GameLog logToSave;

    public GameLogSaver(GameLog logToSave) {
        this.logToSave = logToSave;
    }

    public void save(String fileName) {
        /*new TextBuilder()
            .append("Name des Speicherstands: ")
            .print();
        String fileName = System.console().readLine();
*/
        Path projectPath = Paths.get("").toAbsolutePath();
        File filePath = new File(projectPath.toString() + File.separator + fileName + GameLog.SAVE_FILE_ENDING);

        try (FileWriter fw = new FileWriter(filePath)) {
            
            for (String input : logToSave.getInputs()) {
                fw.write(input + "\n");
            }

            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }        
    }
}
