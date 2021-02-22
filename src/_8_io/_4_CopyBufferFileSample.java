package _8_io;

import java.io.*;

public class _4_CopyBufferFileSample {
    public static void main(String[] args) throws IOException {
        File source = new File("/home/onik/data/zoo.txt");
        File destination = new File("/home/onik/data/My2Copy.txt");
        copy(source, destination);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    private static void copy(File source, File destination) throws IOException {
        try (InputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(source));

             OutputStream bufferedOutputSteam = new BufferedOutputStream(new FileOutputStream(destination))) {

            byte[] buffer = new byte[1024];
            int lengthRead;
            while ((lengthRead = bufferedInputStream.read(buffer)) > 0) {
                bufferedOutputSteam.write(buffer, 0, lengthRead);
                bufferedOutputSteam.flush();
            }
        }

    }
}
