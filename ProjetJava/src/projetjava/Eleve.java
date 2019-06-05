/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.TableModel;

/**
 *
 * @author Moi
 */
public class Eleve {
    
    private String query;
    private String[]test;
    
    
    
            public void afficherEleve()throws SQLException, ClassNotFoundException {
    
               try{
        ResultSet set = null;
        Scanner sc = new Scanner(System.in);
        Connection tmp = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecole","root","");
        Statement stm = tmp.createStatement();
        System.out.println("Liste des eleves : ");
        
        query = "Select * From personne Where type = 2 " ;
        set =stm.executeQuery(query);
        JPanel pan = new JPanel();
        JFrame frame = new JFrame("Voila");
        frame.setSize(800,600);
        frame.setContentPane(pan);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        String[] entete =  {"Prénom", "Nom", "Sport"};
        JTable tab = new JTable((TableModel) set);
        frame.getContentPane().add(tab.getTableHeader(), BorderLayout.NORTH);
        frame.getContentPane().add(tab, BorderLayout.CENTER);
/*        while (set.next())
        {
            System.out.println(set.getString("prenom_personne"));
                    JLabel l=new JLabel(set.getString("prenom_personne"));
                    pan.add(l);
        }
*/
}
               catch(HeadlessException | SQLException e) 
               {
                   System.out.println("Base de donnÃ©es non trouvÃ©");
               }
               
             
    }

            
            
           public void affiche()
           {
        
        JPanel pan = new JPanel();
        JFrame frame = new JFrame("Voila");
        frame.setSize(800,600);
        frame.setContentPane(pan);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        String[] entete =  {"Prénom", "Nom","azer"};
        

        Object [][] data = {
      {"Cysboy", "28 ans", "1.80 m"},
      {"BZHHydde", "28 ans", "1.80 m"},
      {"IamBow", "24 ans", "1.90 m"},
      {"FunMan", "32 ans", "1.85 m"}
        };
          JTable tab = new JTable(data,entete);
        frame.getContentPane().add(tab.getTableHeader(), BorderLayout.NORTH);
        frame.getContentPane().add(tab, BorderLayout.NORTH);
        frame.setVisible(true);
        
           }
    
}
