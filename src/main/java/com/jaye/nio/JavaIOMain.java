package com.jaye.nio;

import java.io.*;

public class JavaIOMain {
    public static void main(String[] args) {
        IOControler ioControler = new IOControler();
        try {
            ioControler.InputStreamTest();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class IOControler {
    //加载一个文件
    public File loadFile() throws IOException {
        //初始化文件
        File data = new File("./files/datas/data.txt");
        File file = new File("./files/flie.md");
        //判断文件是否存在
        if (!data.exists() || !file.exists()) {
            if (!data.getParentFile().exists()) {
                //mkdirs 创建所有必需且不存在的目录
                data.getParentFile().mkdirs();
            }
            //创建文件
            data.createNewFile();
            file.createNewFile();
        }
        return data;
    }

    public void InputStreamTest() throws IOException {
        File file = loadFile();
        FileInputStream inputStream = new FileInputStream(file);
        byte[] bytes = new byte[128];
        int readed = inputStream.read(bytes);
        System.out.println(new String(bytes,0,readed));
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes,0,readed);
        int tempbyte;
        while ((tempbyte = byteArrayInputStream.read()) != -1) {
            System.out.println((char) tempbyte);
        }
        String inputString = "String Input";
        StringBufferInputStream stringBufferInputStream = new StringBufferInputStream(inputString);
        while ((tempbyte = stringBufferInputStream.read()) != -1) {
            System.out.print((char) tempbyte);
        }


        byte newBytes[] = new byte[128];
        new Thread(new Runnable() {
            @Override
            public void run() {
                String string = "Thr";
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

            }
        });
    }

    public void PipedStreamTest(){

    }
    public void printf(String[] names) {
        for (String name : names) {
            System.out.println(name);
        }
    }
}