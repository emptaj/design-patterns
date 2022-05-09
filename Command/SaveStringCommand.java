package Command;


public class SaveStringCommand extends Command {
    private String stringToSave = "savetofile";

    public SaveStringCommand(String filePath, int hour, int minutes, FileReceiver receiver) {
        super(filePath, hour, minutes, receiver);
    }

    public SaveStringCommand(String filePath, String stringToSave, int hour, int minutes, FileReceiver receiver) {
        super(filePath, hour, minutes, receiver);
        this.stringToSave = stringToSave;
    }

    public void setStringToSave(String stringToSave) {
        this.stringToSave = stringToSave;
    }

    @Override
    public void execute() {
        receiver.saveString(filePath, stringToSave);
    }
}
