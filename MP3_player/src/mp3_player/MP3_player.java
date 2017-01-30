/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp3_player;

import com.jtattoo.plaf.graphite.GraphiteLookAndFeel;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import classes.Change_Skins;
import classes.FileUtils;
import classes.MP3FileFilter;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javazoom.jlgui.basicplayer.BasicController;
import javazoom.jlgui.basicplayer.BasicPlayerEvent;
import javazoom.jlgui.basicplayer.BasicPlayerListener;
import objects.MP3;
import objects.MP3Player;

/**
 *
 * @author alex
 */
public class MP3_player extends javax.swing.JFrame implements BasicPlayerListener{
    private static final String MP3_FILE_EXTENSION = "mp3";
    private static final String MP3_FILE_DESCRIPTION = "files mp3";
    private static final String PLAYLIST_FILE_EXTENSION = "pls";
    private static final String PLAYLIST_FILE_DESCRIPTION = "playlist files";
    private static final String EMPTY_STRING = "";
    private static final String INPUT_SONG_NAME = "enter name of song";
    /**
     * Creates new form MP3_player
     */
    private long secondsAmount;
    private long duration;
    private int bytesLen;
    private double posValue = 0.0; 
    private boolean movingFromJump = false;
    private boolean moveAutomatic = false;
    
    
    
    private DefaultListModel mp3ListModel = new DefaultListModel();
    private FileFilter mp3filefilter = new MP3FileFilter(MP3_FILE_EXTENSION, MP3_FILE_DESCRIPTION);
    private FileFilter playlistFileFilter = new MP3FileFilter(PLAYLIST_FILE_EXTENSION, PLAYLIST_FILE_DESCRIPTION);
    private MP3Player player=new MP3Player(this);
    public MP3_player() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filechooser = new javax.swing.JFileChooser();
        panel_search = new javax.swing.JPanel();
        txt_search = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        panel_main = new javax.swing.JPanel();
        btn_previoussong = new javax.swing.JButton();
        btn_playsong = new javax.swing.JButton();
        btn_pausesong = new javax.swing.JButton();
        btn_stopsong = new javax.swing.JButton();
        btn_nextsong = new javax.swing.JButton();
        sld_volume = new javax.swing.JSlider();
        tgbtn_mute = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_songs = new javax.swing.JList<>();
        btn_addsong = new javax.swing.JButton();
        btn_deletesong = new javax.swing.JButton();
        btn_selectprevious = new javax.swing.JButton();
        btn_selextnextsong = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_nameofsong = new javax.swing.JLabel();
        sld_progres = new javax.swing.JSlider();
        jMenuBar1 = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        menu_openplaylist = new javax.swing.JMenuItem();
        menu_saveplaylist = new javax.swing.JMenuItem();
        menu_exit = new javax.swing.JMenuItem();
        edit = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        menu_skin1 = new javax.swing.JMenuItem();
        menu_skin2 = new javax.swing.JMenuItem();
        menu_skin3 = new javax.swing.JMenuItem();

        filechooser.setAcceptAllFileFilterUsed(false);
        filechooser.setDialogTitle("");
        filechooser.setMultiSelectionEnabled(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        txt_search.setText("enter name of song");
        txt_search.setToolTipText("");
        txt_search.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_search.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_searchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_searchFocusLost(evt);
            }
        });
        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_searchKeyPressed(evt);
            }
        });

        btn_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search_16.png"))); // NOI18N
        btn_search.setText("search");
        btn_search.setToolTipText("search song");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_searchLayout = new javax.swing.GroupLayout(panel_search);
        panel_search.setLayout(panel_searchLayout);
        panel_searchLayout.setHorizontalGroup(
            panel_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_searchLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_search)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panel_searchLayout.setVerticalGroup(
            panel_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_searchLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panel_searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_search))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        btn_previoussong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/prev-icon.png"))); // NOI18N
        btn_previoussong.setToolTipText("previous song");
        btn_previoussong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_previoussongActionPerformed(evt);
            }
        });

        btn_playsong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Play.png"))); // NOI18N
        btn_playsong.setToolTipText("play song");
        btn_playsong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_playsongActionPerformed(evt);
            }
        });

        btn_pausesong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Pause-icon.png"))); // NOI18N
        btn_pausesong.setToolTipText("pause song");
        btn_pausesong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pausesongActionPerformed(evt);
            }
        });

        btn_stopsong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stop-red-icon.png"))); // NOI18N
        btn_stopsong.setToolTipText("stop song");
        btn_stopsong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_stopsongActionPerformed(evt);
            }
        });

        btn_nextsong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/next-icon.png"))); // NOI18N
        btn_nextsong.setToolTipText("next song");
        btn_nextsong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextsongActionPerformed(evt);
            }
        });

        sld_volume.setMaximum(200);
        sld_volume.setMinorTickSpacing(5);
        sld_volume.setSnapToTicks(true);
        sld_volume.setToolTipText("change volume");
        sld_volume.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sld_volume.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sld_volumeStateChanged(evt);
            }
        });

        tgbtn_mute.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/speaker.png"))); // NOI18N
        tgbtn_mute.setToolTipText("mute off");
        tgbtn_mute.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mute.png"))); // NOI18N
        tgbtn_mute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbtn_muteActionPerformed(evt);
            }
        });

        list_songs.setModel(mp3ListModel);
        list_songs.setToolTipText("list of songs");
        list_songs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list_songsMouseClicked(evt);
            }
        });
        list_songs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                list_songsKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(list_songs);

        btn_addsong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus_16.png"))); // NOI18N
        btn_addsong.setToolTipText("add song");
        btn_addsong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addsongActionPerformed(evt);
            }
        });

        btn_deletesong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/remove_icon.png"))); // NOI18N
        btn_deletesong.setToolTipText("delete song");
        btn_deletesong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deletesongActionPerformed(evt);
            }
        });

        btn_selectprevious.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow-up-icon.png"))); // NOI18N
        btn_selectprevious.setToolTipText(" select the previous song");
        btn_selectprevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_selectpreviousActionPerformed(evt);
            }
        });

        btn_selextnextsong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow-down-icon.png"))); // NOI18N
        btn_selextnextsong.setToolTipText("select the next song");
        btn_selextnextsong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_selextnextsongActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lbl_nameofsong.setText("...");

        sld_progres.setMaximum(1000);
        sld_progres.setMinorTickSpacing(1);
        sld_progres.setValue(0);
        sld_progres.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sld_progresStateChanged(evt);
            }
        });

        javax.swing.GroupLayout panel_mainLayout = new javax.swing.GroupLayout(panel_main);
        panel_main.setLayout(panel_mainLayout);
        panel_mainLayout.setHorizontalGroup(
            panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_mainLayout.createSequentialGroup()
                .addGroup(panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_mainLayout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(tgbtn_mute, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(sld_volume, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panel_mainLayout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(btn_previoussong, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btn_playsong, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(btn_pausesong, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btn_stopsong, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btn_nextsong, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_mainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                            .addGroup(panel_mainLayout.createSequentialGroup()
                                .addComponent(btn_addsong, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_deletesong, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_selextnextsong, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_selectprevious, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(sld_progres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_nameofsong, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_mainLayout.setVerticalGroup(
            panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_mainLayout.createSequentialGroup()
                .addGroup(panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_addsong, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btn_deletesong, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btn_selectprevious, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btn_selextnextsong, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_nameofsong)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sld_progres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sld_volume, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tgbtn_mute, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_nextsong, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_stopsong, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pausesong, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_previoussong, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_playsong, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        file.setText("File");

        menu_openplaylist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/open-icon.png"))); // NOI18N
        menu_openplaylist.setText("open playlist");
        menu_openplaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_openplaylistActionPerformed(evt);
            }
        });
        file.add(menu_openplaylist);

        menu_saveplaylist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save_16.png"))); // NOI18N
        menu_saveplaylist.setText("save playlist");
        menu_saveplaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_saveplaylistActionPerformed(evt);
            }
        });
        file.add(menu_saveplaylist);

        menu_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        menu_exit.setText("exit");
        file.add(menu_exit);

        jMenuBar1.add(file);

        edit.setText("Edit");

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gear_16.png"))); // NOI18N
        jMenu1.setText("change skin");

        menu_skin1.setText("skin 1");
        menu_skin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_skin1ActionPerformed(evt);
            }
        });
        jMenu1.add(menu_skin1);

        menu_skin2.setText("skin 2");
        menu_skin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_skin2ActionPerformed(evt);
            }
        });
        jMenu1.add(menu_skin2);

        menu_skin3.setText("skin 3");
        menu_skin3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_skin3ActionPerformed(evt);
            }
        });
        jMenu1.add(menu_skin3);

        edit.add(jMenu1);

        jMenuBar1.add(edit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_skin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_skin1ActionPerformed
Change_Skins.changeskins(this, UIManager.getSystemLookAndFeelClassName());  // TODO add your handling code here:
    }//GEN-LAST:event_menu_skin1ActionPerformed

    private void menu_skin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_skin2ActionPerformed
       Change_Skins.changeskins(this, new GraphiteLookAndFeel());
    }//GEN-LAST:event_menu_skin2ActionPerformed

    private void menu_skin3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_skin3ActionPerformed
        Change_Skins.changeskins(this, new NimbusLookAndFeel());
    }//GEN-LAST:event_menu_skin3ActionPerformed

    private void btn_addsongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addsongActionPerformed
        FileUtils.addFileFilter(filechooser, mp3filefilter);
        int result = filechooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File[] selectedFiles = filechooser.getSelectedFiles();
            for (File file : selectedFiles) {
                MP3 mp3 = new MP3(file.getName(), file.getPath());
                if (!mp3ListModel.contains(mp3)) mp3ListModel.addElement(mp3);
            }

        }
    }//GEN-LAST:event_btn_addsongActionPerformed

    private void btn_deletesongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deletesongActionPerformed
int songindex[]=list_songs.getSelectedIndices();
if(songindex.length>0){
ArrayList<MP3> removesong=new ArrayList<>();
    for (int i = 0; i < songindex.length; i++) {
        MP3 mp3=(MP3) mp3ListModel.getElementAt(songindex[i]);
        removesong.add(mp3);
    }
    for(MP3 mp3: removesong)
        mp3ListModel.removeElement(mp3);
}
    }//GEN-LAST:event_btn_deletesongActionPerformed

    private void btn_selextnextsongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_selextnextsongActionPerformed
selectNextSong();
    }//GEN-LAST:event_btn_selextnextsongActionPerformed

    private void btn_selectpreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_selectpreviousActionPerformed
selectprsong();       
    }//GEN-LAST:event_btn_selectpreviousActionPerformed

    private void btn_playsongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_playsongActionPerformed
        playFile();
    }//GEN-LAST:event_btn_playsongActionPerformed

    private void menu_saveplaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_saveplaylistActionPerformed
      FileUtils.addFileFilter(filechooser, playlistFileFilter);
      int result=filechooser.showSaveDialog(this);
      if(result == JFileChooser.APPROVE_OPTION){
      File selectedfile=filechooser.getSelectedFile();
      if(selectedfile.exists()){
          int resultoverride = JOptionPane.showConfirmDialog(this,"file exists!"," raplace?", JOptionPane.YES_NO_CANCEL_OPTION);
          switch(resultoverride){
              case JOptionPane.YES_OPTION:
                  menu_saveplaylistActionPerformed(evt);
                  return;
              case JOptionPane.CANCEL_OPTION:
                  filechooser.cancelSelection();
                  return;
          }
          filechooser.approveSelection();
      }
      String fileextension=FileUtils.getFileExtension(selectedfile);
      String fileNameForSave = (fileextension != null && fileextension.equals(PLAYLIST_FILE_EXTENSION)) ? selectedfile.getPath() : selectedfile.getPath() + "." + PLAYLIST_FILE_EXTENSION;

            FileUtils.serialize(mp3ListModel, fileNameForSave);}
    }//GEN-LAST:event_menu_saveplaylistActionPerformed

    private void menu_openplaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_openplaylistActionPerformed
      FileUtils.addFileFilter(filechooser, playlistFileFilter);
      int result=filechooser.showSaveDialog(this);
      if(result==JFileChooser.APPROVE_OPTION){
          File selectedfile=filechooser.getSelectedFile();
      DefaultListModel mp3ListModel=(DefaultListModel) FileUtils.deserialize(selectedfile.getPath());
      this.mp3ListModel=mp3ListModel;
      list_songs.setModel(mp3ListModel);
      }
    }//GEN-LAST:event_menu_openplaylistActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        searchsong();
    }//GEN-LAST:event_btn_searchActionPerformed
 
                                      
    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchActionPerformed

    private void btn_pausesongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pausesongActionPerformed
        player.pause();
    }//GEN-LAST:event_btn_pausesongActionPerformed

    private void btn_stopsongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_stopsongActionPerformed
        player.stop();
    }//GEN-LAST:event_btn_stopsongActionPerformed
    
    private int currentVolumeValue;
    private void tgbtn_muteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbtn_muteActionPerformed
                
        if (tgbtn_mute.isSelected()){
            currentVolumeValue= sld_volume.getValue();
            sld_volume.setValue(0);
        }else{
            sld_volume.setValue(currentVolumeValue);
        }
    }//GEN-LAST:event_tgbtn_muteActionPerformed

    private void list_songsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_songsMouseClicked
        if (evt.getModifiers() == InputEvent.BUTTON1_MASK && evt.getClickCount() == 2) {
            int[] indexPlayList = list_songs.getSelectedIndices();
            if (indexPlayList.length > 0) {
                MP3 mp3 = (MP3) mp3ListModel.getElementAt(indexPlayList[0]);
                player.play(mp3.getPath());
                player.setVolume(sld_volume.getValue(),sld_volume.getMaximum());
            }
        }
    }//GEN-LAST:event_list_songsMouseClicked

    private void btn_nextsongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextsongActionPerformed
if(selectNextSong())
        playFile();
    }//GEN-LAST:event_btn_nextsongActionPerformed

    private void btn_previoussongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_previoussongActionPerformed
if(selectprsong())
        playFile();
    }//GEN-LAST:event_btn_previoussongActionPerformed

    private void sld_volumeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sld_volumeStateChanged
               player.setVolume(sld_volume.getValue(),sld_volume.getMaximum());
        
        if (sld_volume.getValue()==0){
            tgbtn_mute.setSelected(true);
        }else {
            tgbtn_mute.setSelected(false);
    }//GEN-LAST:event_sld_volumeStateChanged
    }
    private void txt_searchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_searchFocusGained
        if (txt_search.getText().equals(INPUT_SONG_NAME)) {
            txt_search.setText(EMPTY_STRING);
    }//GEN-LAST:event_txt_searchFocusGained
    }
    private void txt_searchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_searchFocusLost
               if (txt_search.getText().trim().equals(EMPTY_STRING)) {
            txt_search.setText(INPUT_SONG_NAME);}
    }//GEN-LAST:event_txt_searchFocusLost

    private void list_songsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_list_songsKeyPressed
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_ENTER) {
        playFile();
        }
    }//GEN-LAST:event_list_songsKeyPressed

    private void txt_searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyPressed
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_ENTER) {
        searchsong();
    }//GEN-LAST:event_txt_searchKeyPressed
    }
    private void sld_progresStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sld_progresStateChanged
        if (sld_progres.getValueIsAdjusting() == false) {
            if (moveAutomatic == true) {
                moveAutomatic = false;
                posValue = sld_progres.getValue() * 1.0 / 1000;
                processSeek(posValue);
            }
        } else {
            moveAutomatic = true;
            movingFromJump = true;
        }
    }//GEN-LAST:event_sld_progresStateChanged
private void processSeek(double bytes) {
        try {
            long skipBytes = (long) Math.round(((Integer) bytesLen).intValue() * bytes);
            player.jump(skipBytes);
        } catch (Exception e) {
            e.printStackTrace();
            movingFromJump = false;
        }

    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MP3_player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MP3_player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MP3_player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MP3_player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MP3_player().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addsong;
    private javax.swing.JButton btn_deletesong;
    private javax.swing.JButton btn_nextsong;
    private javax.swing.JButton btn_pausesong;
    private javax.swing.JButton btn_playsong;
    private javax.swing.JButton btn_previoussong;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_selectprevious;
    private javax.swing.JButton btn_selextnextsong;
    private javax.swing.JButton btn_stopsong;
    private javax.swing.JMenu edit;
    private javax.swing.JMenu file;
    private javax.swing.JFileChooser filechooser;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_nameofsong;
    private javax.swing.JList<String> list_songs;
    private javax.swing.JMenuItem menu_exit;
    private javax.swing.JMenuItem menu_openplaylist;
    private javax.swing.JMenuItem menu_saveplaylist;
    private javax.swing.JMenuItem menu_skin1;
    private javax.swing.JMenuItem menu_skin2;
    private javax.swing.JMenuItem menu_skin3;
    private javax.swing.JPanel panel_main;
    private javax.swing.JPanel panel_search;
    private javax.swing.JSlider sld_progres;
    private javax.swing.JSlider sld_volume;
    private javax.swing.JToggleButton tgbtn_mute;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables

    @Override
    public void opened(Object o, Map map) {
        duration=(long)Math.round((((Long)map.get("duration")).longValue())/1000000);
        bytesLen=(int)Math.round(((Integer)map.get("mp3.length.bytes")).intValue());
        String songname=map.get("title")!=null ? map.get("title").toString() : FileUtils.getFileNameWithoutExtension(new File(o.toString()).getName());
    if(songname.length()>30){
        songname=songname.substring(0, 30) + "...";
    }
    lbl_nameofsong.setText(songname);
    }
    @Override
    public void progress(int bytesread, long microseconds, byte[] pcmdata, Map properties) {
        float progress = -1.0f;

        if ((bytesread> 0) && ((duration > 0))) {
            progress = bytesread * 1.0f / bytesLen * 1.0f;
        }
        secondsAmount = (long) (duration * progress);

        if (duration != 0) {
            if (movingFromJump == false) {
                sld_progres.setValue(((int) Math.round(secondsAmount * 1000 / duration)));

            }
        }
    }
    @Override
    public void stateUpdated(BasicPlayerEvent bpe) {
        int state = bpe.getCode();
        if (state == BasicPlayerEvent.PLAYING) {
            movingFromJump = false;
        } else if (state == BasicPlayerEvent.SEEKING) {
            movingFromJump = true;
        } else if (state == BasicPlayerEvent.EOM) {
            if (selectNextSong()) {
                playFile();
            }
        }
    }
    @Override
    public void setController(BasicController bc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void playFile(){
            int [] songindex=list_songs.getSelectedIndices();
        if(songindex.length>0){
        MP3 mp3=(MP3) mp3ListModel.getElementAt(songindex[0]);
            player.play(mp3.getPath());
            player.setVolume(sld_volume.getValue(), sld_volume.getMaximum());
        }
    }
    private boolean selectNextSong(){
    int index=list_songs.getSelectedIndex()+1;
        if(index<=list_songs.getModel().getSize()-1){
        list_songs.setSelectedIndex(index);
        return true;
        }
        return false;
    }
    private boolean selectprsong(){
    int index=list_songs.getSelectedIndex()-1;
        if(index>=0){
        list_songs.setSelectedIndex(index);
        return true;
    }
        return false;
}
    private void searchsong(){
     String search=txt_search.getText();
        if(search==null||search.trim().equals(EMPTY_STRING)){
            return;}
        ArrayList<Integer> findsongindex=new ArrayList<>();
        for (int i = 0; i < mp3ListModel.size(); i++) {
            MP3 mp3=(MP3) mp3ListModel.getElementAt(i);
            if(mp3.getName().toUpperCase().contains(search.toUpperCase())){
                findsongindex.add(i);
            }
        }
        int [] selectedindexes=new int[findsongindex.size()];
        if(selectedindexes.length==0){
            JOptionPane.showMessageDialog(this,search+" not found");
            txt_search.requestFocus();
            txt_search.selectAll();
            return;
        }
        for (int i = 0; i < selectedindexes.length; i++) {
            selectedindexes[i]=findsongindex.get(i).intValue();
        }
        list_songs.setSelectedIndices(selectedindexes);
}


}
