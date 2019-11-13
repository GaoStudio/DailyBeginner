package com.jaye.nio;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.Selector;
import java.nio.charset.Charset;

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
    public void wirteBuffer(){
        try {
//            File file = new File("/Users/tidebuy/dev/wordspace/javaweb/LeetCode/src/main/java/com/jaye/nio/data.txt");
//            RandomAccessFile aFile = new RandomAccessFile(file, "rw");
//            FileChannel fc = aFile.getChannel();
//            ByteBuffer bf = ByteBuffer.wrap("SOME TIME".getBytes("UTF-16BE"));
//            fc.write(bf);
//            bf.flip();
//            fc.read(bf);
//            bf.clear();
            //System.out.println(bf.asCharBuffer().length());
            FileChannel fc = new FileOutputStream("/Users/tidebuy/dev/wordspace/javaweb/LeetCode/src/main/java/com/jaye/nio/data2.txt").getChannel();
            ByteBuffer bf = ByteBuffer.allocate(24);
            bf.asCharBuffer().put("SOME TEXT");
            fc.write(bf);
            fc.close();

            FileChannel fc2 = new FileInputStream("/Users/tidebuy/dev/wordspace/javaweb/LeetCode/src/main/java/com/jaye/nio/data2.txt").getChannel();
            bf.clear();
            fc2.read(bf);
            bf.flip();
            CharBuffer cb = bf.asCharBuffer();
            if(cb.hasRemaining()){

            }
            System.out.println(cb);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readBuffer(){
        try {
            File file = new File("/Users/tidebuy/dev/wordspace/javaweb/LeetCode/src/main/java/com/jaye/nio/data.txt");
            RandomAccessFile aFile = new RandomAccessFile(file, "rw");
            FileChannel fc = aFile.getChannel();
            ByteBuffer bf = ByteBuffer.allocate(28);
            fc.read(bf);
            bf.flip();
            System.out.println(bf.getChar());
            bf.rewind();
            String encodeing = System.getProperty("file.encodeing");
            System.out.println(Charset.forName("UTF-8").decode(bf));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
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
    public void selectorChannel(){
        try {
            File file = new File("/Users/tidebuy/dev/wordspace/javaweb/LeetCode/src/main/java/com/jaye/nio/data.txt");
            RandomAccessFile aFile = new RandomAccessFile(file, "rw");
            FileChannel fileChannel = aFile.getChannel();
            Selector selector = Selector.open();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
