/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;
import javazoom.jlgui.basicplayer.BasicPlayerListener;
import mp3_player.MP3_player;

/**
 *
 * @author alex
 */
public class MP3Player {
    private BasicPlayer player=new BasicPlayer();
    private String filename;
    private double volumevalue;
    public MP3Player(BasicPlayerListener listener) {
         player.addBasicPlayerListener(listener);
    }
        public void play(String name) {
        try{
    if(filename!=null&&filename.equals(name)&&player.getStatus()==BasicPlayer.PAUSED){
        player.resume();
        return;
    }
    filename=name;
    player.open(new File(name));
    player.play();
    player.setGain(volumevalue);
}
catch(BasicPlayerException e){
    Logger.getLogger(MP3Player.class.getName()).log(Level.SEVERE,null, e);
}
}
    public void stop() {
        try {
            player.stop();
        } catch (BasicPlayerException e) {
            Logger.getLogger(MP3Player.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void pause() {
        try {
            player.pause();
        } catch (BasicPlayerException e) {
            Logger.getLogger(MP3Player.class.getName()).log(Level.SEVERE, null, e);
        }
    }

public void setVolume(int value, int maxvalue){
    try{
        this.volumevalue=value;
        if(value==0){
            player.setGain(0);
        }
        else{
            player.setGain(calcVolume(value, maxvalue));
    }
}
    catch(BasicPlayerException e){
        Logger.getLogger(MP3Player.class.getName()).log(Level.SEVERE,null, e);       
    }}
    

private double calcVolume(int currentValue, int maximumValue) {
        volumevalue = (double) currentValue / (double) maximumValue;
        return volumevalue;
    }
public void jump(long bytes) {
        try {
            player.seek(bytes);
            player.setGain(volumevalue);
        } catch (BasicPlayerException ex) {
            Logger.getLogger(MP3Player.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}