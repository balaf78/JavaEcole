/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection tmp = DriverManager.getConnection("jdbc:mysql://localhost:3306/etudiant","root","");
            Statement stm = tmp.createStatement();
            Scanner sc = new Scanner(System.in);
            System.out.println("Entrer la note à ajouter");
        float note=sc.nextFloat();
        do
        {
          
        
        if(note>=0 && note<=20)
        {
        query = "Insert INTO evaluation (note_evaluation)  VALUES ("+note+")";
        stm.executeUpdate(query);
        System.out.println("Note ajouté");
        }
        else
             {
               
               System.out.println("Entrer une note valide");
               note=sc.nextFloat();
               if(note>=0 && note<=20)
               {
                   query = "Insert INTO evaluation (note_evaluation)  VALUES ("+note+")";
                   stm.executeUpdate(query);
                   System.out.println("Note ajouté");
                   
             }
             }
        
        }while(note<0 || note>20);     
        }
        catch(Exception e){
            System.out.println("Erreur");
            
        }
        
    }

    public void supprimerNote() throws SQLException, ClassNotFoundException
    {   
        try{
            
            
        ResultSet set = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer l'Id de la note à supprimer");
        int id=sc.nextInt();
        Connection tmp = DriverManager.getConnection("jdbc:mysql://localhost:3306/etudiant","root","");
        Statement stm = tmp.createStatement();
        query = "Select id_evaluation From evaluation where id_evaluation="+id+"";
        set =stm.executeQuery(query);
        
        if(set.next())
        {
            System.out.println("Present");
            query = "Delete From evaluation Where id_evaluation="+id;
            stm.executeUpdate(query);
            System.out.println("Note supprimé");
        }
        else{
            System.out.println("Cette note n'existe pas");
        }
        
        }
        
        catch(Exception e){
        System.out.println("fgdgfd");}
        
            
        
    }
        
        public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }
                
    }
    
    

