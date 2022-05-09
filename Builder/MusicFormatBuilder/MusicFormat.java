package Builder;

public class MusicFormat {
    private String header;
    private String tags;
    private String body;

    public void setHeader(String header) {
        this.header = header;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "header='" + header + '\'' +
                ", tags='" + tags + '\'' +
                ", body='" + body + '\'';
    }
}