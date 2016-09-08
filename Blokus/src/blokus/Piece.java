/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blokus;

import javax.swing.JOptionPane;

/**
 *
 * @author Squall
 */
public class Piece {
    private int numeroPiece;
    private int couleurJoueur;
    private int largeur;
    private int hauteur;
    private int[][] forme;
    private int valeur;
    
    // constructeur utilisé pour créer les pièces au début du jeu
    public Piece(int couleur, int numPiece){
        this.numeroPiece = numPiece;
        this.couleurJoueur = couleur;
        switch(numPiece){
            /*
            gestion des pièces sous forme de matrice : forme[x][y] 
            avec x le nombre de cases sur le plan horizontal
            avec y le nombre de cases sur le plan vertical
            on indique si la case est remplie (1) ou non (0)
            ainsi, la représentation d'une pièce peut se faire comme suit :
            piece 11 --> forme[3][3]
            forme = {{1,1,1},
                     {0,1,0},
                     {0,1,0}}
            */
            case 1:
                hauteur = 1;
                largeur = 1;
                forme = new int[hauteur][largeur];
                forme[0][0] = 1;
                valeur = 1;
                break;
            case 2:
                hauteur = 2;
                largeur = 1;
                forme = new int[hauteur][largeur];
                forme[0][0] = 1;
                forme[1][0] = 1;
                valeur = 2;
                break;
            case 3:
                hauteur = 2;
                largeur = 2;
                forme = new int[hauteur][largeur];
                forme[0][0] = 0;
                forme[0][1] = 1;
                forme[1][0] = 1;
                forme[1][1] = 1;
                valeur = 3;
                break;
            case 4:
                hauteur = 3;
                largeur = 1;
                forme = new int[hauteur][largeur];
                forme[0][0] = 1;
                forme[1][0] = 1;
                forme[2][0] = 1;
                valeur = 3;
                break;
            case 5:
                hauteur = 2;
                largeur = 2;
                forme = new int[hauteur][largeur];
                forme[0][0] = 1;
                forme[0][1] = 1;
                forme[1][0] = 1;
                forme[1][1] = 1;
                valeur = 4;
                break;
            case 6:
                hauteur = 3;
                largeur = 2;
                forme = new int[hauteur][largeur];
                forme[0][0] = 1;
                forme[0][1] = 0;
                forme[1][0] = 1;
                forme[1][1] = 1;
                forme[2][0] = 1;
                forme[2][1] = 0;
                valeur = 4;
                break;
            case 7:
                hauteur = 4;
                largeur = 1;
                forme = new int[hauteur][largeur];
                forme[0][0] = 1;
                forme[1][0] = 1;
                forme[2][0] = 1;
                forme[3][0] = 1;
                valeur = 4;
                break;
            case 8:
                hauteur = 3;
                largeur = 2;
                forme = new int[hauteur][largeur];
                forme[0][0] = 1;
                forme[0][1] = 0;
                forme[1][0] = 1;
                forme[1][1] = 0;
                forme[2][0] = 1;
                forme[2][1] = 1;
                valeur = 4;
                break;
            case 9:
                hauteur = 3;
                largeur = 2;
                forme = new int[hauteur][largeur];
                forme[0][0] = 1;
                forme[0][1] = 0;
                forme[1][0] = 1;
                forme[1][1] = 1;
                forme[2][0] = 0;
                forme[2][1] = 1;
                valeur = 4;
                break;
            case 10:
                hauteur = 4;
                largeur = 2;
                forme = new int[hauteur][largeur];
                forme[0][0] = 1;
                forme[0][1] = 1;
                forme[1][0] = 1;
                forme[1][1] = 0;
                forme[2][0] = 1;
                forme[2][1] = 0;
                forme[3][0] = 1;
                forme[3][1] = 0;
                valeur = 5;
                break;
            case 11:
                hauteur = 3;
                largeur = 3;
                forme = new int[hauteur][largeur];
                forme[0][0] = 1;
                forme[0][1] = 0;
                forme[0][2] = 0;
                forme[1][0] = 1;
                forme[1][1] = 1;
                forme[1][2] = 1;
                forme[2][0] = 1;
                forme[2][1] = 0;
                forme[2][2] = 0;
                valeur = 5;
                break;
            case 12:
                hauteur = 3;
                largeur = 3;
                forme = new int[hauteur][largeur];
                forme[0][0] = 1;
                forme[0][1] = 1;
                forme[0][2] = 1;
                forme[1][0] = 1;
                forme[1][1] = 0;
                forme[1][2] = 0;
                forme[2][0] = 1;
                forme[2][1] = 0;
                forme[2][2] = 0;
                valeur = 5;
                break;
            case 13:
                hauteur = 4;
                largeur = 2;
                forme = new int[hauteur][largeur];
                forme[0][0] = 1;
                forme[0][1] = 0;
                forme[1][0] = 1;
                forme[1][1] = 1;
                forme[2][0] = 0;
                forme[2][1] = 1;
                forme[3][0] = 0;
                forme[3][1] = 1;
                valeur = 5;
                break;
            case 14:
                hauteur = 3;
                largeur = 3;
                forme = new int[hauteur][largeur];
                forme[0][0] = 1;
                forme[0][1] = 1;
                forme[0][2] = 0;
                forme[1][0] = 0;
                forme[1][1] = 1;
                forme[1][2] = 0;
                forme[2][0] = 0;
                forme[2][1] = 1;
                forme[2][2] = 1;
                valeur = 5;
                break;
            case 15:
                hauteur = 1;
                largeur = 5;
                forme = new int[hauteur][largeur];
                forme[0][0] = 1;
                forme[0][1] = 1;
                forme[0][2] = 1;
                forme[0][3] = 1;
                forme[0][4] = 1;
                valeur = 5;
                break;
            case 16:
                hauteur = 2;
                largeur = 3;
                forme = new int[hauteur][largeur];
                forme[0][0] = 1;
                forme[0][1] = 1;
                forme[0][2] = 1;
                forme[1][0] = 1;
                forme[1][1] = 1;
                forme[1][2] = 0;
                valeur = 5;
                break;
            case 17:
                hauteur = 3;
                largeur = 3;
                forme = new int[hauteur][largeur];
                forme[0][0] = 1;
                forme[0][1] = 1;
                forme[0][2] = 0;
                forme[1][0] = 0;
                forme[1][1] = 1;
                forme[1][2] = 1;
                forme[2][0] = 0;
                forme[2][1] = 0;
                forme[2][2] = 1;
                valeur = 5;
                break;
            case 18:
                hauteur = 2;
                largeur = 3;
                forme = new int[hauteur][largeur];
                forme[0][0] = 1;
                forme[0][1] = 1;
                forme[0][2] = 1;
                forme[1][0] = 1;
                forme[1][1] = 0;
                forme[1][2] = 1;
                valeur = 5;
                break;
            case 19:
                hauteur = 3;
                largeur = 3;
                forme = new int[hauteur][largeur];
                forme[0][0] = 0;
                forme[0][1] = 1;
                forme[0][2] = 0;
                forme[1][0] = 1;
                forme[1][1] = 1;
                forme[1][2] = 1;
                forme[2][0] = 0;
                forme[2][1] = 0;
                forme[2][2] = 1;
                valeur = 5;
                break;
            case 20:
                hauteur = 3;
                largeur = 3;
                forme = new int[hauteur][largeur];
                forme[0][0] = 0;
                forme[0][1] = 1;
                forme[0][2] = 0;
                forme[1][0] = 1;
                forme[1][1] = 1;
                forme[1][2] = 1;
                forme[2][0] = 0;
                forme[2][1] = 1;
                forme[2][2] = 0;
                valeur = 5;
                break;
            case 21:
                hauteur = 4;
                largeur = 2;
                forme = new int[hauteur][largeur];
                forme[0][0] = 1;
                forme[0][1] = 0;
                forme[1][0] = 1;
                forme[1][1] = 1;
                forme[2][0] = 1;
                forme[2][1] = 0;
                forme[3][0] = 1;
                forme[3][1] = 0;
                valeur = 5;
                break;
        }
    }
    
    // constructeur utilisé pour créer les pièces lors de rotation
    public Piece(int H, int L, int num){
        this.numeroPiece = num;
        this.largeur = L;
        this.hauteur = H;
        this.forme = new int[this.hauteur][this.largeur];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < L; j++) {
                this.forme[i][j] = 0;
            }
        }
    }

    /**
     * @return the numeroPiece
     */
    public int getNumeroPiece() {
        return numeroPiece;
    }
    
    /**
     * @return the couleurJoueur
     */
    public int getCouleurJoueur() {
        return couleurJoueur;
    }

    /**
     * @param couleurJoueur the couleurJoueur to set
     */
    public void setCouleurJoueur(int couleurJoueur) {
        this.couleurJoueur = couleurJoueur;
    }
    
    /**
     * @return the largeur
     */
    public int getLargeur() {
        return largeur;
    }

    /**
     * @param largeur the largeur to set
     */
    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    /**
     * @return the hauteur
     */
    public int getHauteur() {
        return hauteur;
    }

    /**
     * @param hauteur the hauteur to set
     */
    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    /**
     * @return the forme
     */
    public int getForme(int i, int j) {
        return forme[i][j];
    }

    /**
     * @param forme the forme to set
     */
    public void setForme(int x, int y, int i) {
        this.forme[x][y] = i;
    }
    
    public static Piece rotationPiece(Piece select){
        int L = select.getHauteur(),
            H = select.getLargeur();
        Piece p = new Piece(H, L, select.getNumeroPiece());
        p.setCouleurJoueur(select.getCouleurJoueur());
        //JOptionPane.showMessageDialog(null, "p.num = " + p.getNumeroPiece() + "\np.largeur = " + p.getHauteur() + "\np.hauteur = "+ p.getLargeur() + "\n");
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < H; j++) {
                int x = j,
                    y = L - 1 - i;
                p.forme[x][y] = select.forme[i][j];
            }
        }
        return p;
    }
    
    public static Piece symetriePiece(Piece select){
        int L = select.getHauteur(),
            H = select.getLargeur();
        Piece p = new Piece(L, H, select.getNumeroPiece());
        p.setCouleurJoueur(select.getCouleurJoueur());
        //JOptionPane.showMessageDialog(null, "p.num = " + p.getNumeroPiece() + "\np.largeur = " + p.getHauteur() + "\np.hauteur = "+ p.getLargeur() + "\n");
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < H; j++) {
                int x = L - i - 1,
                    y = j;
                p.forme[x][y] = select.forme[i][j];
            }
        }
        return p;
    }
}
