/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author alex
 */
public class FileUtils {
    public static void addFileFilter(JFileChooser jfc, FileFilter ff){
    jfc.removeChoosableFileFilter(jfc.getFileFilter());
    jfc.setFileFilter(ff);
    jfc.setSelectedFile(new File(""));
    }

    public static String getFileNameWithoutExtension(String filename) {
        File file = new File(filename);
        int index = file.getName().lastIndexOf('.');
        if (index > 0 && index <= file.getName().length() - 2) {
            return file.getName().substring(0, index);
        }
        return "noname";
    }

public static String getFileExtension(File file){
        String ext = null;
        String s = file.getName();
        int i = s.lastIndexOf('.');

        if (i > 0 &&  i < s.length() - 1) {
            ext = s.substring(i+1).toLowerCase();
        }
        return ext;
}
        public static void serialize(Object obj, String fileName) {
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.flush();
            oos.close();
            fos.close();
        } catch (IOException ex) {
            Logger.getLogger(FileUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public static Object deserialize(String fileName) {
        try {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream oin = new ObjectInputStream(fis);
            Object ts = (Object) oin.readObject();
            fis.close();
            return ts;

        } catch (ClassNotFoundException | IOException ex) {
            Logger.getLogger(FileUtils.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
    }




