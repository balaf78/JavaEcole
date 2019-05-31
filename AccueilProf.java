/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Omer
 */
public class AccueilProf extends JFrame {
    private JPanel container= new JPanel();
    private JLabel label1 = new JLabel("Salut Omer-Faruk Kiziltoprak");
    private JLabel label2 = new JLabel("Discipline: Maths ");
    
    private JLabel label3 = new JLabel("Non classe:");
    private JComboBox combo = new JComboBox();
    private JButton b1 =new JButton("Valider");
    
    
    
    
    public AccueilProf()
    {
        this.setTitle("Connexion");
      this.setSize(800,600);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setLocationRelativeTo(null);
      
      JPanel contentPanel = new JPanel();
      contentPanel.setLayout(new BorderLayout());
      label1.setPreferredSize(new Dimension(300,20));
      label2.setPreferredSize(new Dimension (110,20));
      label3.setPreferredSize(new Dimension (100,30));
      combo.setPreferredSize(new Dimension (100,30));
      b1.setPreferredSize(new Dimension (100,20));
      
      JPanel extremity = new JPanel();
      extremity.setLayout(new BorderLayout());
      
      extremity.add(label1,BorderLayout.WEST);
      extremity.add(label2,BorderLayout.EAST);
    contentPanel.add(extremity,BorderLayout.NORTH);
    
    
    //
    
    JPanel content = new JPanel();
      content.setPreferredSize(new Dimension(300,120));
      content.setBackground(Color.white);
      content.setLayout(new GridBagLayout());
      GridBagConstraints gbc = new GridBagConstraints();
      combo.setPreferredSize(new Dimension(100, 20));
      combo.addItem("");
      combo.addItem("6ème");
      combo.addItem("5ème");
      combo.addItem("4ème");
      combo.addItem("3ème");
      
      
       gbc.gridx = 0;
       gbc.gridy = 0;
    //La taille en hauteur et en largeur
      gbc.gridheight = 1;
      gbc.gridwidth = 1;
      
      content.add(label3,gbc);
      gbc.gridwidth = GridBagConstraints.REMAINDER;
      gbc.gridx=1;
      content.add(combo,gbc);
      //retour a la ligne
      
      gbc.gridx=0;
      gbc.gridy=2;
      gbc.gridwidth = 1;
      gbc.gridheight = 1;
      
      content.add(b1,gbc);
      gbc.gridwidth = GridBagConstraints.REMAINDER;
      gbc.gridx=1;
      content.add(b1,gbc);
      
  
      contentPanel.add(content);
      
      this.setContentPane(contentPanel);
      this.setVisible(true);
    
    
}
    }
