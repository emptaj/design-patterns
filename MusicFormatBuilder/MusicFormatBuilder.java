package Builder;

import java.io.IOException;

public abstract class MusicFormatBuilder {
    protected MusicFormat musicFormat;

    {
        musicFormat = new MusicFormat();
    }

    public abstract MusicFormatBuilder buildHeader();

    public abstract MusicFormatBuilder buildTags();

    public abstract MusicFormatBuilder buildBody(int[] values) throws IOException;

    public MusicFormat build() {
        return this.musicFormat;
    }
}
