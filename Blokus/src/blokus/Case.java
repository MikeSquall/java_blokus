package blokus;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Squall
 */
public class Case extends JPanel {
    private int numCase;
    private int occupee; // -1 par défaut, 0 à 3 si occupée par une piece selon sa couleur
    
    public Case(int i){
        this.numCase = i;
        this.occupee = -1;
        this.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        this.setBackground(Color.white);
        this.setSize(20, 20);
    }

    /**
     * @return the numCase
     */
    public int getNumCase() {
        return numCase;
    }

    /**
     * @return the occupee
     */
    public int getOccupee() {
        return occupee;
    }

    /**
     * @param occupee the occupee to set
     */
    public void setOccupee(int occupee) {
        this.occupee = occupee;
    }
}
