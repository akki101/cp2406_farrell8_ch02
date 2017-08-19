import javax.swing.JOptionPane;

public class QuartsToGallonsInteractive {
    public static void main(String []arg){
        final int QUARTS_IN_GALLON = 4;
        int numGallon, numQuarts;
        String quartsNeeded;
        quartsNeeded = JOptionPane.showInputDialog("Enter the amount of paint needed(in quarts):");
        numGallon = Integer.parseInt(quartsNeeded)/QUARTS_IN_GALLON;
        numQuarts = Integer.parseInt(quartsNeeded)%QUARTS_IN_GALLON;
        JOptionPane.showMessageDialog(null,"You will be needing "+ numGallon+" gallon and "+ numQuarts+" quarts.");


    }
}
