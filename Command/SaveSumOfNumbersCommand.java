package Command;

public class SaveSumOfNumbersCommand extends Command {

    public SaveSumOfNumbersCommand(String filePath,
                                   int hour,
                                   int minutes,
                                   FileReceiver receiver) {
        super(filePath, hour, minutes, receiver);
    }

    @Override
    public void execute() {
        receiver.saveSum(filePath);

    }
}
