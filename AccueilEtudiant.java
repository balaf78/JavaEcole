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
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Omer
 */
public class AccueilEtudiant extends JFrame{
    private JPanel container= new JPanel();
    private JLabel label1 = new JLabel("Salut Omer-Faruk Kiziltoprak");
    private JLabel label2 = new JLabel("Classe: IG3");
    private JLabel label3 = new JLabel("Voir mes notes: ");
    private JButton b1 =new JButton("Trimestre 1");
    private JButton b2 =new JButton("Trimestre 2");
    private JButton b3 =new JButton("Trimestre 3");
    
    
    
    public AccueilEtudiant()
    {
        this.setTitle("Connexion");
      this.setSize(800,600);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setLocationRelativeTo(null);
      
      JPanel contentPanel = new JPanel();
      contentPanel.setLayout(new BorderLayout());
      label1.setPreferredSize(new Dimension(300,20));
      label2.setPreferredSize(new Dimension (70,20));
      label3.setPreferredSize(new Dimension (100,20));
      
      JPanel extremity = new JPanel();
      extremity.setLayout(new BorderLayout());
      
      extremity.add(label1,BorderLayout.WEST);
      extremity.add(label2,BorderLayout.EAST);
     
   
      
    contentPanel.add(extremity,BorderLayout.NORTH);
    
     
     
     
    
     
    JPanel trimestre = new JPanel();
    
    trimestre.setLayout(new FlowLayout(FlowLayout.CENTER,10,100));
    trimestre.add(label3);
    trimestre.add(b1);
    trimestre.add(b2);
    trimestre.add(b3);
    contentPanel.add(trimestre);
    
      
      this.setContentPane(contentPanel);
      this.setVisible(true);
    }     
    
    
}
