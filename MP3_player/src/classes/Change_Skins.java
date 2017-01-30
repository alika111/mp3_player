/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.LookAndFeel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author alex
 */
public class Change_Skins {
    public static void changeskins(Component c, LookAndFeel laf){
        try {
            UIManager.setLookAndFeel(laf);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Change_Skins.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        SwingUtilities.updateComponentTreeUI(c);
    }
    public static void changeskins(Component c, String laf){
        try {
            UIManager.setLookAndFeel(laf);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Change_Skins.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Change_Skins.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Change_Skins.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Change_Skins.class.getName()).log(Level.SEVERE, null, ex);
        }
        SwingUtilities.updateComponentTreeUI(c);
    }
    }

