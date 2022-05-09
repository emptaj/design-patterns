package Builder;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class OggFormatBuilder extends MusicFormatBuilder {
    @Override
    public OggFormatBuilder buildHeader() {
        this.musicFormat.setHeader("OggHeader");
        return this;
    }

    @Override
    public OggFormatBuilder buildTags() {
        this.musicFormat.setTags("OggTags");
        return this;
    }

    @Override
    public OggFormatBuilder buildBody(int[] values) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        // - zapis do pliku. W tym przypadku niepotrzebny
        // FileOutputStream fos = new FileOutputStream("test.zip");

        ZipOutputStream zos = new ZipOutputStream(baos);
        ZipEntry entry = new ZipEntry("OggBuilder.txt");
        zos.putNextEntry(entry);

        for (int value : values) {
            String stringValue;

            if (value > 100)
                stringValue = 100 + " ";
            else if (value < -100)
                stringValue = -100 + " ";
            else
                stringValue = (value) + " ";

            byte[] bytesValue = stringValue.getBytes();
            zos.write(bytesValue);
        }

        zos.closeEntry();
        zos.close();

        byte[] bytes = baos.toByteArray();
        String baseEncoded = Base64.getEncoder().encodeToString(bytes);

        this.musicFormat.setBody(baseEncoded);
        return this;
    }
}
