/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author Omer
 */
public class Note {
    
    private String query;
    public void ajouterNote() throws SQLException, ClassNotFoundException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer la note à ajouter");
        float note=sc.nextFloat();
        do
        {
          
        
        if(note>=0 && note<=20)
        {
        query = "Insert INTO evaluation (note_evaluation)  VALUES ("+note+")";   
        }
        else
             {
               System.out.println("Entrer une note valide");
               note=sc.nextFloat();  
             }
        
        }while(note<0 || note>20);     
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }
    
    
    
    public void supprimerNote() throws SQLException, ClassNotFoundException
    {   
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer l'Id de la note à supprimer");
        int id=sc.nextInt();
         
        query = "Delete From anneescolaire Where id_anneescolaire="+id;
         
            
    }
        
                
    }
    
    

