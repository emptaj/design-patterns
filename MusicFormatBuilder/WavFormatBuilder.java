package Builder;

public class WavFormatBuilder extends MusicFormatBuilder {
    @Override
    public WavFormatBuilder buildHeader() {
        this.musicFormat.setHeader("WavHeader");
        return this;
    }

    @Override
    public WavFormatBuilder buildTags() {
        this.musicFormat.setTags("");
        return this;
    }

    @Override
    public WavFormatBuilder buildBody(int[] values) {
        String body = "";

        for (int value : values) {
            body += value + ",";
        }

        this.musicFormat.setBody(body);
        return this;
    }
}
