package com.jaye.nio;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

import static sun.jvm.hotspot.runtime.PerfMemory.start;

/**
 * Program: java
 * Author: Gaowei
 * Date: 2019-04-01 16:21
 * Email: gaoweivf@aliyun.com
 * Description:
 **/

public class NioMain {

    public static void main(String[] args) {
        FileChannelTest fileChannel = new FileChannelTest();
        fileChannel.readLineByNio();
        //fileChannel.readLineByNio();
    }
}
