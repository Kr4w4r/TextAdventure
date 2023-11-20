package de.krawie.textadventure.framework.savegame;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import com.diogonunes.jcolor.Attribute;

import de.krawie.textadventure.framework.textoutput.TextBuilder;

public class GameLogLoader {
    
    public GameLogLoader() {
        
    }

    public GameLog loadSave(String fileName) {
        Path projectPath = Paths.get("").toAbsolutePath();
        File filePath = new File(projectPath.toString() + File.separator + fileName + GameLog.SAVE_FILE_ENDING);

        GameLog gameLog = new GameLog();

        try (Scanner scanner = new Scanner(filePath)) {
            while (scanner.hasNextLine()) {
                String playerInput = scanner.nextLine();
                gameLog.addInput(playerInput);
            }
        } catch (FileNotFoundException e) {
            new TextBuilder().appendLine("Datei existiert nicht.", Attribute.RED_TEXT(), Attribute.WHITE_BACK());
        }

        return gameLog;
    }

}
