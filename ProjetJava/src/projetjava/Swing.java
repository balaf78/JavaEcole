/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import javax.swing.*;
import java.awt.GridLayout;

import java.awt.event.*;

import javax.swing.JButton;

/**
 *
 * @author Moi
 */


public abstract class Swing extends JFrame implements MouseListener{
    public static void Graphique(){
    JFrame frame = new JFrame("Voila");
    frame.setSize(800,600);
    JPanel pan = new JPanel();
    frame.setContentPane(pan);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    /*
    frame.setLayout(new GridLayout (3,3));
    

    
    for (int i=0;i<3;i++)
    {
        for (int j=0;j<3;j++)
        {
            JButton bouton = new JButton(" Fonction" + i + ":" + j);
            frame.getContentPane().add(bouton);
            
          
            
        }
    }*/
        JButton b = new JButton("test");
        JLabel l=new JLabel("");
	frame.getContentPane().add(b);
        frame.getContentPane().add(l);
        frame.setVisible(true);
        
        
	b.addActionListener(new ActionListener(){  
            
        public void actionPerformed(ActionEvent e){  
        l.setText("Vous avez ajoutez une note");  
        Note note = new Note();
        
        }});  
    }
    
    public void Graphique (JPanel pan)
    {
        JFrame frame = new JFrame("Voila");
        frame.setSize(800,600);
        frame.setContentPane(pan);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    
    

}

