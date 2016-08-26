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
    int couleurJoueur;
    int[][] forme;
    
    public Piece(int couleur, int numPiece){
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
                forme = new int[1][1];
                forme[0][0] = 1;
                break;
            case 2:
                forme = new int[2][1];
                forme[0][0] = 1;
                forme[1][0] = 1;
                break;
            case 3:
                forme = new int[2][2];
                forme[0][0] = 0;
                forme[0][1] = 1;
                forme[1][0] = 1;
                forme[1][1] = 1;
                break;
            case 4:
                forme = new int[3][1];
                forme[0][0] = 1;
                forme[1][0] = 1;
                forme[2][0] = 1;
                break;
            case 5:
                forme = new int[2][2];
                forme[0][0] = 1;
                forme[0][1] = 1;
                forme[1][0] = 1;
                forme[1][1] = 1;
                break;
            case 6:
                forme = new int[3][2];
                forme[0][0] = 1;
                forme[0][1] = 0;
                forme[1][0] = 1;
                forme[1][1] = 1;
                forme[2][0] = 1;
                forme[2][1] = 0;
                break;
            case 7:
                forme = new int[4][1];
                forme[0][0] = 1;
                forme[1][0] = 1;
                forme[2][0] = 1;
                forme[3][0] = 1;
                break;
            case 8:
                forme = new int[3][2];
                forme[0][0] = 1;
                forme[0][1] = 0;
                forme[1][0] = 1;
                forme[1][1] = 0;
                forme[2][0] = 1;
                forme[2][1] = 1;
                break;
            case 9:
                forme = new int[3][2];
                forme[0][0] = 1;
                forme[0][1] = 0;
                forme[1][0] = 1;
                forme[1][1] = 1;
                forme[2][0] = 0;
                forme[2][1] = 1;
                break;
            case 10:
                forme = new int[4][2];
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
                forme = new int[3][3];
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
                forme = new int[3][3];
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
                forme = new int[4][2];
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
                forme = new int[3][3];
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
                forme = new int[1][5];
                forme[0][0] = 1;
                forme[0][1] = 1;
                forme[0][2] = 1;
                forme[0][3] = 1;
                forme[0][4] = 1;
                break;
            case 16:
                forme = new int[2][3];
                forme[0][0] = 1;
                forme[0][1] = 1;
                forme[0][2] = 1;
                forme[1][0] = 1;
                forme[1][1] = 1;
                forme[1][2] = 0;
                break;
            case 17:
                forme = new int[3][3];
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
                forme = new int[2][3];
                forme[0][0] = 1;
                forme[0][1] = 1;
                forme[0][2] = 1;
                forme[1][0] = 1;
                forme[1][1] = 0;
                forme[1][2] = 1;
                break;
            case 19:
                forme = new int[3][3];
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
                forme = new int[3][3];
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
                forme = new int[4][2];
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
}
