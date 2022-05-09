package Builder;

import java.io.IOException;

public class MusicFormatDirector {
    private MusicFormatBuilder builder;

    public void setBuilder(MusicFormatBuilder builder) {
        this.builder = builder;
    }

    public MusicFormatDirector(MusicFormatBuilder builder) {
        this.builder = builder;
    }

    public MusicFormat construct(int[] values) throws IOException {
        return builder.buildHeader().
                buildTags().
                buildBody(values)
                .build();

    }
}
