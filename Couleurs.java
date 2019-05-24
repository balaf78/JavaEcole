/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package couleurs;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author cynth
 */
public class Couleurs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Saisir les 5 couleurs
        ArrayList <String> couleurs = new ArrayList<>();
        ArrayList <String> couleurs2 = new ArrayList<>();
        String mot = "";
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<5; i++){
            System.out.print("Saisir la couleur: ");
            mot= sc.next();
            System.out.println();
            couleurs.add(mot);
        }

        System.out.println("Le premier tableau de couleurs: " + couleurs);
        for (int i = 0; i<5; i++){
            System.out.print("Saisir la couleur: ");
            mot= sc.next();
            System.out.println();
            couleurs2.add(mot);
        }    
        System.out.println("Le deuxieme tableau de couleurs: " + couleurs2);
        
        couleurs.addAll(couleurs2);
        System.out.println("Le tableau de toutes les couleurs: " + couleurs);
         
        }
    
}
