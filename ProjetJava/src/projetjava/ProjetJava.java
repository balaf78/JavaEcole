/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

/**
 *
 * @author Omer
 */
public class ProjetJava {

    /**
     * @param args the command line arguments
     */
    // Dans mon cas le nom de ma base est test et le nom de la table est java
    
    
    public static void main(String[] args) throws Exception {
        
        try
        {   
            
            Note note = new Note();
            //Swing.Graphique();
            //note.ajouterNote();
            Eleve eleve = new Eleve();
            eleve.affiche();
            
            
                    
       
        }
        
        
        catch(Exception ex){}
        
   }
    
       
        
        
        
        }

    

    
    /*
    Autre methode:
    try
    PrepareStatement statement = this.connect.prepareStatement("INSERT INTO tab (,) VAlues(?,?)"
    );
    statement.setObject(1,obj.getM_Id() , Types.INTEGER);
    statement.setObject(2,obj.getM_Id() , Types.Varchar);
    statement.executeUpdate();
    
    
    
    
    */
    

