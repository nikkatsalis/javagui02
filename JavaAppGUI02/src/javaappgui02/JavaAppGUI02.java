/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaappgui02;

/**
 *
 * @author Administrator
 */
public class JavaAppGUI02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MainFrame mf = new MainFrame("Η Εφαρμογή μου");
        mf.setVisible(true);
        mf.setResizable(false);
        
        PictureFrame pf = new PictureFrame("Επιλογέας εικόνων");
        pf.setVisible(true);
        pf.setResizable(false);
        
        
        System.out.println(System.getProperty("user.dir"));
    }
    
}
