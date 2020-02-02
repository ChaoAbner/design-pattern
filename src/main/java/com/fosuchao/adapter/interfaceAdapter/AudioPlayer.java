package com.fosuchao.adapter.interfaceAdapter;

/**
 * @Description: 默认模仿其
 * @Auther: Joker Ye
 * @Date: 2020/2/2 19:06
 */
public class AudioPlayer implements Player {

    @Override
    public void play(String mediaType, String filename) {
       if("mp3".equalsIgnoreCase(mediaType)) {
           this.Mp3Player(filename);
       } else if ("vlc".equalsIgnoreCase(mediaType)
       || "mp4".equalsIgnoreCase(mediaType)) {
           new MediaAdapter(mediaType).play(mediaType, filename);
       } else {
           this.printTypeError();
       }
    }

    public void Mp3Player(String filename){
        System.out.println("播放MP3音频，文件为：" + filename);
    }

    public void printTypeError(){
        System.out.println("不支持的音频类型");
    }

}
