package Command;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

public class Main {
    private static int systemHour = 0;
    private static int systemMinutes = 0;

    public static void updateTime() {
        systemMinutes++;
        if (systemMinutes == 60) {
            systemHour++;
            systemMinutes = 0;
        }

        if (systemHour == 24)
            systemHour = systemMinutes = 0;
    }

    public static void main(String[] args) {

        List<Command> commandInvoker = new ArrayList<>();
        FileReceiver receiver = new FileReceiver();

        commandInvoker.add(new SaveStringCommand("test.txt", "Testowa linia", 0, 11, receiver));
        commandInvoker.add(new SaveNumberCommand("test.txt", 1, 1, 1, receiver));
        commandInvoker.add(new SaveSumOfNumbersCommand("test.txt", 2, 23, receiver));
        commandInvoker.add(new SaveStringCommand("test.txt", "To, co się dzieje naprawdę nie istnieje", 5, 12, receiver));
        commandInvoker.add(new SaveStringCommand("test.txt", "Zegarmistrz światła purpurowy", 5, 14, receiver));
        commandInvoker.add(new SaveNumberCommand("test.txt", 12, 10, 123, receiver));
        commandInvoker.add(new SaveSumOfNumbersCommand("test.txt", 14, 2, receiver));


        while (systemHour <= 23 && systemMinutes <= 59) {
            out.println(systemHour + ":" + systemMinutes);

            commandInvoker.stream()
                    .filter(command -> command.getHour() == systemHour && command.getMinutes() == systemMinutes)
                    .forEach(Command::execute);
        
            updateTime();
        }
    }
}
