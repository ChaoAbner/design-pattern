package com.fosuchao.adapter.interfaceAdapter;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/2 19:03
 */
public class MediaAdapter implements Player {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String mediaType) {
        if("mp4".equalsIgnoreCase(mediaType)){
            this.advancedMediaPlayer = new Mp4Player();
        } else if ("vlc".equalsIgnoreCase(mediaType)) {
            this.advancedMediaPlayer = new VlcPlayer();
        }
    }

    @Override
    public void play(String mediaType, String filename) {
        switch (mediaType){
            case "vlc": this.advancedMediaPlayer.playVlc(filename); break;
            case "mp4": this.advancedMediaPlayer.playMp4(filename); break;
            default: break;
        }
    }


}
