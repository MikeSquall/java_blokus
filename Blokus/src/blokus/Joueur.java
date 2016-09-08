/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blokus;

/**
 *
 * @author Squall
 */
public class Joueur {
    private String nom;
    private int couleur;
    private int points;
    
    public Joueur(String name, int color){
        this.nom = name;
        this.couleur = color;
        this.points = -89;
    }
    
    public String getNom(){
        return this.nom;
    }
    
    public int getCouleur(){
        return this.couleur;
    }
    
    public int getPoints(){
        return this.points;
    }
    
    public void setPoints(int valeur){
        this.points += valeur;
    }
}
