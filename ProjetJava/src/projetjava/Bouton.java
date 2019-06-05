/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import java.awt.event.MouseListener;
import javax.swing.JButton;
import java.io.IOException; 
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException; 
import javax.imageio.ImageIO;
import javax.swing.JButton;

/**
 *
 * @author Moi
 */
public abstract class Bouton extends JButton implements MouseListener{
    
  private String name;
  
  public Bouton(String str){
  super(str);
  this.name = str;
  }
  try {
    System.out.println("voila tout bg");
    
    
}
  
  
  
  
  
  @Override
    public void mousePressed(MouseEvent event) {
    //Nous changeons le fond de notre image pour le jaune lors du clic gauche, avec le fichier fondBoutonClic.png
    System.out.println("aaaa");
  }

}


