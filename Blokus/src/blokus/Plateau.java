/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blokus;

import java.util.ArrayList;

/**
 *
 * @author Squall
 */
public class Plateau {
    public ArrayList<Piece> piecesBleues;
    public ArrayList<Piece> piecesJaunes;
    public ArrayList<Piece> piecesRouges;
    public ArrayList<Piece> piecesVertes;
    
    public Plateau(){
        this.piecesBleues = this.creationPieces(0);
        this.piecesJaunes = this.creationPieces(1);
        this.piecesRouges = this.creationPieces(2);
        this.piecesVertes = this.creationPieces(3);
    }
    
    private ArrayList<Piece> creationPieces(int couleurJoueur){
        ArrayList<Piece> tmp = new ArrayList<Piece>();
        for(int i = 1; i < 22; i++){
            Piece p = new Piece(couleurJoueur, i);
            tmp.add(p);
        }
        return tmp;
    }
}
