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
public class Piece {
    private int numeroPiece;
    private int couleurJoueur;
    private int hauteur;
    private int largeur;
    private int[][] forme;
    
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
                largeur = 1;
                hauteur = 1;
                forme = new int[largeur][hauteur];
                forme[0][0] = 1;
                break;
            case 2:
                largeur = 2;
                hauteur = 1;
                forme = new int[largeur][hauteur];
                forme[0][0] = 1;
                forme[1][0] = 1;
                break;
            case 3:
                largeur = 2;
                hauteur = 2;
                forme = new int[largeur][hauteur];
                forme[0][0] = 0;
                forme[0][1] = 1;
                forme[1][0] = 1;
                forme[1][1] = 1;
                break;
            case 4:
                largeur = 3;
                hauteur = 1;
                forme = new int[largeur][hauteur];
                forme[0][0] = 1;
                forme[1][0] = 1;
                forme[2][0] = 1;
                break;
            case 5:
                largeur = 2;
                hauteur = 2;
                forme = new int[largeur][hauteur];
                forme[0][0] = 1;
                forme[0][1] = 1;
                forme[1][0] = 1;
                forme[1][1] = 1;
                break;
            case 6:
                largeur = 3;
                hauteur = 2;
                forme = new int[largeur][hauteur];
                forme[0][0] = 1;
                forme[0][1] = 0;
                forme[1][0] = 1;
                forme[1][1] = 1;
                forme[2][0] = 1;
                forme[2][1] = 0;
                break;
            case 7:
                largeur = 4;
                hauteur = 1;
                forme = new int[largeur][hauteur];
                forme[0][0] = 1;
                forme[1][0] = 1;
                forme[2][0] = 1;
                forme[3][0] = 1;
                break;
            case 8:
                largeur = 3;
                hauteur = 2;
                forme = new int[largeur][hauteur];
                forme[0][0] = 1;
                forme[0][1] = 0;
                forme[1][0] = 1;
                forme[1][1] = 0;
                forme[2][0] = 1;
                forme[2][1] = 1;
                break;
            case 9:
                largeur = 3;
                hauteur = 2;
                forme = new int[largeur][hauteur];
                forme[0][0] = 1;
                forme[0][1] = 0;
                forme[1][0] = 1;
                forme[1][1] = 1;
                forme[2][0] = 0;
                forme[2][1] = 1;
                break;
            case 10:
                largeur = 4;
                hauteur = 2;
                forme = new int[largeur][hauteur];
                forme[0][0] = 1;
                forme[0][1] = 1;
                forme[1][0] = 1;
                forme[1][1] = 0;
                forme[2][0] = 1;
                forme[2][1] = 0;
                forme[3][0] = 1;
                forme[3][1] = 0;
                break;
            case 11:
                largeur = 3;
                hauteur = 3;
                forme = new int[largeur][hauteur];
                forme[0][0] = 1;
                forme[0][1] = 0;
                forme[0][2] = 0;
                forme[1][0] = 1;
                forme[1][1] = 1;
                forme[1][2] = 1;
                forme[2][0] = 1;
                forme[2][1] = 0;
                forme[2][2] = 0;
                break;
            case 12:
                largeur = 3;
                hauteur = 3;
                forme = new int[largeur][hauteur];
                forme[0][0] = 1;
                forme[0][1] = 1;
                forme[0][2] = 1;
                forme[1][0] = 1;
                forme[1][1] = 0;
                forme[1][2] = 0;
                forme[2][0] = 1;
                forme[2][1] = 0;
                forme[2][2] = 0;
                break;
            case 13:
                largeur = 4;
                hauteur = 2;
                forme = new int[largeur][hauteur];
                forme[0][0] = 1;
                forme[0][1] = 0;
                forme[1][0] = 1;
                forme[1][1] = 1;
                forme[2][0] = 0;
                forme[2][1] = 1;
                forme[3][0] = 0;
                forme[3][1] = 1;
                break;
            case 14:
                largeur = 3;
                hauteur = 3;
                forme = new int[largeur][hauteur];
                forme[0][0] = 1;
                forme[0][1] = 1;
                forme[0][2] = 0;
                forme[1][0] = 0;
                forme[1][1] = 1;
                forme[1][2] = 0;
                forme[2][0] = 0;
                forme[2][1] = 1;
                forme[2][2] = 1;
                break;
            case 15:
                largeur = 1;
                hauteur = 5;
                forme = new int[largeur][hauteur];
                forme[0][0] = 1;
                forme[0][1] = 1;
                forme[0][2] = 1;
                forme[0][3] = 1;
                forme[0][4] = 1;
                break;
            case 16:
                largeur = 2;
                hauteur = 3;
                forme = new int[largeur][hauteur];
                forme[0][0] = 1;
                forme[0][1] = 1;
                forme[0][2] = 1;
                forme[1][0] = 1;
                forme[1][1] = 1;
                forme[1][2] = 0;
                break;
            case 17:
                largeur = 3;
                hauteur = 3;
                forme = new int[largeur][hauteur];
                forme[0][0] = 1;
                forme[0][1] = 1;
                forme[0][2] = 0;
                forme[1][0] = 0;
                forme[1][1] = 1;
                forme[1][2] = 1;
                forme[2][0] = 0;
                forme[2][1] = 0;
                forme[2][2] = 1;
                break;
            case 18:
                largeur = 2;
                hauteur = 3;
                forme = new int[largeur][hauteur];
                forme[0][0] = 1;
                forme[0][1] = 1;
                forme[0][2] = 1;
                forme[1][0] = 1;
                forme[1][1] = 0;
                forme[1][2] = 1;
                break;
            case 19:
                largeur = 3;
                hauteur = 3;
                forme = new int[largeur][hauteur];
                forme[0][0] = 0;
                forme[0][1] = 1;
                forme[0][2] = 0;
                forme[1][0] = 1;
                forme[1][1] = 1;
                forme[1][2] = 1;
                forme[2][0] = 0;
                forme[2][1] = 0;
                forme[2][2] = 1;
                break;
            case 20:
                largeur = 3;
                hauteur = 3;
                forme = new int[largeur][hauteur];
                forme[0][0] = 0;
                forme[0][1] = 1;
                forme[0][2] = 0;
                forme[1][0] = 1;
                forme[1][1] = 1;
                forme[1][2] = 1;
                forme[2][0] = 0;
                forme[2][1] = 1;
                forme[2][2] = 0;
                break;
            case 21:
                largeur = 4;
                hauteur = 2;
                forme = new int[largeur][hauteur];
                forme[0][0] = 1;
                forme[0][1] = 0;
                forme[1][0] = 1;
                forme[1][1] = 1;
                forme[2][0] = 1;
                forme[2][1] = 0;
                forme[3][0] = 1;
                forme[3][1] = 0;
                break;
        }
    }
    
    // constructeur utilisé pour créer les pièces lors de rotation
    public Piece(int H, int L, int num){
        this.numeroPiece = num;
        this.hauteur = L;
        this.largeur = H;
        this.forme = new int[this.largeur][this.hauteur];
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
     * @return the forme
     */
    public int[][] getForme() {
        return forme;
    }

    /**
     * @param forme the forme to set
     */
    public void setForme(int[][] forme) {
        this.forme = forme;
    }
    
    public Piece rotationPiece(Piece select){
        int L = select.getLargeur(),
            H = select.getHauteur();
        Piece p = new Piece(H, L, select.getNumeroPiece());
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < H; j++) {
                int x = j,
                    y = H - 1 - i;
                p.forme[x][y] = select.forme[i][j];
            }
        }
        return p;
    }
}
