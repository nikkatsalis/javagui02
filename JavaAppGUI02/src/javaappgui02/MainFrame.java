/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaappgui02;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.ScrollPane;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 *
 * @author Administrator
 */
public class MainFrame extends JFrame {
    JLabel jl1, jl2;
    JTextField tf1, tf2;
    JList listSports;
    JRadioButton jrb1, jrb2;
    JLabel jl3, jl4;
    JCheckBox chk1, chk2, chk3, chk4;
    JButton b1, b2, b3;
    
    MainFrame() {
        super();
        
        createGUI();
    }
    
    MainFrame(String t) {
        super(t);
        
        createGUI();
    }
    
    private void createGUI() {
        setSize(500, 340);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        //Δημιουργώ τα αντικείμενα που θ προσθέσω στο Frame
        JPanel upLeftP = new JPanel();
        upLeftP.setLayout(new GridLayout(2,2));
        
        jl1 = new JLabel("Ετικέτα 1");
        jl2 = new JLabel("Ετικέτα 2");
        tf1 = new JTextField(12);
        tf2 = new JTextField(12);
        
        upLeftP.add(jl1);
        upLeftP.add(tf1);
        upLeftP.add(jl2);
        upLeftP.add(tf2);
         
        DefaultListModel dlm = new DefaultListModel();
        dlm.addElement("Κολύμβηση");
        dlm.addElement("Τρέξιμο");
        dlm.addElement("Άλμα εις μήκος");
        dlm.addElement("a1");
        dlm.addElement("a2");
        dlm.addElement("a3");
        
        listSports = new JList(dlm);
        listSports.setLayoutOrientation(JList.VERTICAL);
        listSports.setVisibleRowCount(4);
        ScrollPane sp = new ScrollPane();
        sp.add(listSports);
        
        JPanel fyloP = new JPanel();
        fyloP.setLayout(new GridLayout(2,2));
        
        jl3 = new JLabel("Φύλο");
        jrb1 = new JRadioButton("Άντρας");
        jrb2 = new JRadioButton("Γυναίκα");
        //Δημιουργώ ένα ButtonGroup και προσθέτω σε αυτό τα δύο JRadioButton
        //ώστε όταν πατάς το ένα να ξεεπιλέγεται το άλλο
        ButtonGroup bg = new ButtonGroup();
        bg.add(jrb1);
        bg.add(jrb2);
        jrb2.setSelected(true);
        
        fyloP.add(jl3);
        fyloP.add(jrb1);
        fyloP.add(new JLabel(" "));
        fyloP.add(jrb2);
        
        
        JPanel glossaP = new JPanel();
        glossaP.setLayout(new GridLayout(4,2));
        
        jl4 = new JLabel("Γλώσσα Πρ/σμού:");
        chk1 = new JCheckBox("Java");
        chk2 = new JCheckBox("Python");
        chk3 = new JCheckBox("PHP");
        chk4 = new JCheckBox("C++");
        
        glossaP.add(jl4);
        glossaP.add(chk1);
        glossaP.add(new JLabel(" "));
        glossaP.add(chk2);
        glossaP.add(new JLabel(" "));
        glossaP.add(chk3);
        glossaP.add(new JLabel(" "));
        glossaP.add(chk4);
        
        //Δημιούργησε ένα JPanel και εφάρμοσέ του gridLayout με 3 στήλες
        //και βάλε πάνω του τα κουμπιά
        JPanel downButtonP = new JPanel();
        downButtonP.setLayout(new GridLayout(1,3));
        b1 = new JButton("Φύλο");
        b2 = new JButton("Γλώσσα");
        b3 = new JButton("Κλείσιμο");
        downButtonP.add(b1);
        downButtonP.add(b2);
        downButtonP.add(b3);
        
        //τα προσθέτω
        //Να υπάρχει περιθώριο 5 pixels πάνω, αριστερά, κάτω και δεξιά
        //γύρω από το κάθε αντικείμενο
        c.insets = new Insets(5, 5, 5, 5);
        
        c.anchor = GridBagConstraints.LINE_START;
        c.fill = GridBagConstraints.HORIZONTAL;
        
        c.gridx = 0;
        c.gridy = 0;
        c.gridheight = 2;
        add(upLeftP, c);
        
        c.gridx = 1;
        c.gridy = 0;
        c.gridheight = 2;
        add(sp, c);
        
        c.gridx = 0;
        c.gridy = 2;
        c.gridheight = 2;
        add(fyloP, c);
        
        c.gridx = 1;
        c.gridy = 2;
        c.gridheight = 2;
        add(glossaP, c);        
        
        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 2;
        c.gridheight = 1;
        add(downButtonP, c);
        
        //pack();
    }
    
    private void createGUIOld() {
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        //Δημιουργώ τα αντικείμενα που θ προσθέσω στο Frame
        jl1 = new JLabel("Ετικέτα 1");
        jl2 = new JLabel("Ετικέτα 2");
        tf1 = new JTextField(12);
        tf2 = new JTextField(12);
        
        String[] dm = {"Κολύμβηση", "Τρέξιμο", "Άλμα εις μήκος", "Κωπηλασία"}; 

        listSports = new JList(dm);

        
        jl3 = new JLabel("Φύλο");
        jrb1 = new JRadioButton("Άντρας");
        jrb2 = new JRadioButton("Γυναίκα");
        //Δημιουργώ ένα ButtonGroup και προσθέτω σε αυτό τα δύο JRadioButton
        //ώστε όταν πατάς το ένα να ξεεπιλέγεται το άλλο
        ButtonGroup bg = new ButtonGroup();
        bg.add(jrb1);
        bg.add(jrb2);
        jrb2.setSelected(true);
        
        
        jl4 = new JLabel("Γλώσσα Πρ/σμού:");
        chk1 = new JCheckBox("Java");
        chk2 = new JCheckBox("Python");
        chk3 = new JCheckBox("PHP");
        
        //Δημιούργησε ένα JPanel και εφάρμοσέ του gridLayout με 3 στήλες
        //και βάλε πάνω του τα κουμπιά
        JPanel downButtonP = new JPanel();
        downButtonP.setLayout(new GridLayout(1,3));
        b1 = new JButton("Φύλο");
        b2 = new JButton("Γλώσσα");
        b3 = new JButton("Κλείσιμο");
        downButtonP.add(b1);
        downButtonP.add(b2);
        downButtonP.add(b3);
        
        //τα προσθέτω
        //Να υπάρχει περιθώριο 5 pixels πάνω, αριστερά, κάτω και δεξιά
        //γύρω από το κάθε αντικείμενο
        c.insets = new Insets(5, 5, 5, 5);
        
        c.anchor = GridBagConstraints.LINE_START;
        
        c.gridx = 0;
        c.gridy = 0;
        add(jl1, c);
        
        c.gridx = 0;
        c.gridy = 1;
        add(jl2, c);
        
        c.gridx = 1;
        c.gridy = 0;
        add(tf1, c);
        
        c.gridx = 1;
        c.gridy = 1;
        add(tf2, c);
        
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 2;
        c.gridheight = 3;
        c.fill = GridBagConstraints.BOTH;
        add(listSports, c); 
        
        c.gridx = 0;
        c.gridy = 5;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.fill = GridBagConstraints.NONE;
        add(jl3, c);
        
        c.gridx = 1;
        c.gridy = 5;
        add(jrb1, c);
        c.gridx = 1;
        c.gridy = 6;
        add(jrb2, c);
        
        c.gridx = 0;
        c.gridy = 7;
        add(jl4, c);
        
        c.gridx = 1;
        c.gridy = 7;
        add(chk1, c);
        
        c.gridx = 1;
        c.gridy = 8;
        add(chk2, c);
        
        c.gridx = 1;
        c.gridy = 9;
        add(chk3, c);
        
        
        c.gridx = 0;
        c.gridy = 10;
        c.gridwidth = 2;
        add(downButtonP, c);
        
        pack();
    }
    
    
}
