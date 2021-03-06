package com.interview.question005;

import org.junit.Test;

import java.io.IOException;

import static com.interview.other.Contants.INPUT_IMAGE_PATH;
import static com.interview.other.Contants.OUTPUT_IMAGE_PATH;
import static com.interview.question005.IphoneSizeEnum.IPHONE5;

/**
 * 将你的 QQ 头像（或者微博头像）右上角加上红色的数字，类似于微信未读信息数量那种提示效果。
 */
public class ImageSizeProcessTest {

    private ImageSizeProcess imageSizeProcess = new ImageSizeProcess();


    @Test
    public void drawIphone5ImageTest() throws IOException {
        imageSizeProcess.generateIphoneSizeImage(INPUT_IMAGE_PATH + "icon.jpg", "jpg", OUTPUT_IMAGE_PATH + "icon_iphone5.jpg", IPHONE5);
        imageSizeProcess.generateIphoneSizeImage(INPUT_IMAGE_PATH + "icon1.jpg", "jpg", OUTPUT_IMAGE_PATH + "icon1_iphone5.jpg", IPHONE5);
        imageSizeProcess.generateIphoneSizeImage(INPUT_IMAGE_PATH + "icon2.jpg", "jpg", OUTPUT_IMAGE_PATH + "icon2_iphone5.jpg", IPHONE5);
    }

}