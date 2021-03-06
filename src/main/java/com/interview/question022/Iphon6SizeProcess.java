package com.interview.question022;

import com.interview.question005.ImageSizeProcess;

import java.io.IOException;

import static com.interview.other.Contants.INPUT_IMAGE_PATH;
import static com.interview.other.Contants.OUTPUT_IMAGE_PATH;
import static com.interview.question005.IphoneSizeEnum.IPHONE6;

/**
 * 第 0022 题： iPhone 6、iPhone 6 Plus 早已上市开卖。请查看你写得 第 0005 题的代码是否可以复用。
 */
public class Iphon6SizeProcess {

    public static void main(String[] args) throws IOException {
        ImageSizeProcess imageSizeProcess = new ImageSizeProcess();
        imageSizeProcess.generateIphoneSizeImage(INPUT_IMAGE_PATH + "icon.jpg", "jpg", OUTPUT_IMAGE_PATH + "icon_iphone6.jpg", IPHONE6);
    }
}
