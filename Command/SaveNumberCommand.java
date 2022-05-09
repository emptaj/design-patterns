package Command;

public class SaveNumberCommand extends Command {
    private int numberToSave = 1000;

    public SaveNumberCommand(String filePath,
                             int hour,
                             int minutes,
                             FileReceiver receiver) {
        super(filePath, hour, minutes, receiver);
    }

    public SaveNumberCommand(String filePath, int hour, int minutes, int numberToSave, FileReceiver receiver) {
        super(filePath, hour, minutes, receiver);
        this.numberToSave = numberToSave;
    }

    public void setNumberToSave(int numberToSave) {
        this.numberToSave = numberToSave;
    }

    @Override
    public void execute() {
        receiver.saveString(filePath, String.valueOf(numberToSave));

    }
}
