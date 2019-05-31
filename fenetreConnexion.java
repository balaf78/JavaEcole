/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Omer
 */
public class fenetreConnexion extends JFrame {
    private JPanel container= new JPanel();
    private JTextField jtf1 = new JTextField("");
    private JTextField jtf2 = new JTextField("");
    private JComboBox combo = new JComboBox();
    private JLabel label3 = new JLabel("base de donnée");
    private JLabel label1 = new JLabel("Identifiant");
    private JLabel label2 = new JLabel("Mot de passe");
    private JButton b =new JButton("Valider");
    private JFrame frame = new JFrame();
    
    
    
    
    
    
    
    
    public fenetreConnexion(){
     
      this.setTitle("Connexion");
      this.setSize(800,600);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setLocationRelativeTo(null);
      container.setBackground(Color.red);
      GridBagLayout layout = new GridBagLayout();
      this.setLayout(layout);
      
      JPanel content = new JPanel();
      content.setPreferredSize(new Dimension(300,120));
      content.setBackground(Color.white);
      content.setLayout(new GridBagLayout());
      jtf1.setPreferredSize(new Dimension(100, 20));
      jtf2.setPreferredSize(new Dimension(100, 20));
      b.setPreferredSize(new Dimension(100, 20));
      
      // Action du bouton
      b.addActionListener(new ActionListener(){  
            
        public void actionPerformed(ActionEvent e){  
            // On recuperer password et identifiant
      String identifiant =jtf1.getText();
      String password=jtf2.getText();
      
      
      // Connexion
      connexion co = new connexion();
      try{
           co.connexion(identifiant,password);
      }
      
      catch(Exception f){
          
      }
        
        }});
      
      GridBagConstraints gbc = new GridBagConstraints();
      combo.setPreferredSize(new Dimension(100, 20));
      combo.addItem("Seclectionner");
      combo.addItem("ecole");
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
      
      content.add(label1,gbc);
      gbc.gridwidth = GridBagConstraints.REMAINDER;
      gbc.gridx=1;
      content.add(jtf1,gbc);
      
      gbc.gridx=0;
      gbc.gridy=4;
      gbc.gridwidth = 1;
      gbc.gridheight = 1;
      content.add(label2,gbc);
      gbc.gridwidth = GridBagConstraints.REMAINDER;
      gbc.gridx=1;
      content.add(jtf2,gbc);
      
      gbc.gridx=0;
      gbc.gridy=5;
      content.add(b);
      
    
      
  
   
      this.setContentPane(content);
        this.setVisible(true);
      
      
}
  
    
    
    
}
