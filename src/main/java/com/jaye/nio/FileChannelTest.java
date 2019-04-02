package com.jaye.nio;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;

/**
 * Program: java
 * Author: Gaowei
 * Date: 2019-04-01 16:47
 * Email: gaoweivf@aliyun.com
 * Description:
 **/

public class FileChannelTest {
    public void readLineByIo() {
        File file = new File("/Users/gaowei/dev/workspace/JavaProject/DailyBeginner/src/main/java/com/jaye/nio/data.txt");
        FileInputStream fileInputStream = null;
        file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return false;
            }
        });
        try {
            System.out.println(file.getAbsoluteFile());
            fileInputStream = new FileInputStream(file);
            byte[] b = new byte[1024];
            int len = fileInputStream.read(b);
            while (len != -1) {
                String str = new String(b, 0, len);
                System.out.println(str);
                len = fileInputStream.read(b);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void readLineByNio() {
        try {
            File file = new File("/Users/gaowei/dev/workspace/JavaProject/DailyBeginner/src/main/java/com/jaye/nio/data.txt");
            RandomAccessFile aFile = new RandomAccessFile(file, "rw");
            FileChannel inChannel = aFile.getChannel();

            ByteBuffer buf = ByteBuffer.allocate(1024);

            int bytesRead = inChannel.read(buf);
            while (bytesRead != -1) {

                System.out.println("Read " + bytesRead);
                buf.flip();

                while (buf.hasRemaining()) {
                    System.out.print((char) buf.get());
                }

                buf.clear();
                bytesRead = inChannel.read(buf);
            }
            aFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
