package Command;

public abstract class Command {
    protected String filePath;
    protected int hour;
    protected int minutes;
    protected FileReceiver receiver;

    public Command(String filePath, int hour, int minutes, FileReceiver receiver) {
        this.filePath = filePath;
        this.hour = hour;
        this.minutes = minutes;
        this.receiver = receiver;
    }

    public void setTime(int hour, int minutes) {
        this.hour = hour;
        this.minutes = minutes;
    }

    public int getHour() {
        return hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public abstract void execute();
}
