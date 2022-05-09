package Builder;

import java.io.*;

import java.util.Base64;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Mp3FormatBuilder extends MusicFormatBuilder {

    @Override
    public Mp3FormatBuilder buildHeader() {
        this.musicFormat.setHeader("Mp3Header");
        return this;
    }

    @Override
    public Mp3FormatBuilder buildTags() {
        this.musicFormat.setTags("Mp3Tags");
        return this;
    }

    @Override
    public Mp3FormatBuilder buildBody(int[] values) throws IOException{
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        // - zapis do pliku. W tym przypadku niepotrzebny
        // FileOutputStream fos = new FileOutputStream("test.zip");

        ZipOutputStream zos = new ZipOutputStream(baos);
        ZipEntry entry = new ZipEntry("Mp3Builder.txt");
        try {
            zos.putNextEntry(entry);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int value : values) {
            String stringValue = (value) + " ";
            byte[] bytesValue = stringValue.getBytes();
            try {
                zos.write(bytesValue);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        zos.closeEntry();
        zos.close();

        byte[] bytes = baos.toByteArray();
        String baseEncoded = Base64.getEncoder().encodeToString(bytes);

        this.musicFormat.setBody(baseEncoded);
        return this;
    }
}
