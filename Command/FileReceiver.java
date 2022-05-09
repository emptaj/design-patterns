package Command;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class FileReceiver {

    public void saveString(String filePath, String content) {
        try {
            Files.writeString(Path.of(filePath), (content + "\n"), StandardOpenOption.APPEND, StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveSum(String filePath) {
        File file = new File(filePath);

        Scanner s = null;
        try {
            s = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int sum = 0;

        while (s.hasNextLine()) {
            var line = s.nextLine();

            try {
                int intValue = Integer.parseInt(line);
                sum += intValue;
            } catch (NumberFormatException e) {
            }

        }

        if (sum > 0) {
            try {
                Files.writeString(Path.of(filePath), ("sum:" + sum + "\n"), StandardOpenOption.APPEND);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
