import javax.swing.*;

public class Eggs {
    public static void main(String []arg){
        final int DOZEN = 12;
        final float RATE_PER_EGG = 0.45f, RATE_PER_DOZEN=3.25f;
        float priceDozen, pricePerEgg;
        int numDozen, numEgg;
        int eggCount;
        String inputEgg;
        inputEgg = JOptionPane.showInputDialog("Enter the number of you want to buy.");
        eggCount = Integer.parseInt(inputEgg);
        numDozen = eggCount/DOZEN;
        numEgg = eggCount%DOZEN;
        priceDozen = numDozen*RATE_PER_DOZEN;
        pricePerEgg = numEgg*RATE_PER_EGG;

        JOptionPane.showMessageDialog(null,"You ordered "+inputEgg+" eggs. That's "+numDozen+" at $"+RATE_PER_DOZEN+
        " per dozen and "+numEgg+" loose eggs at $45 cents each for a total of $"+(priceDozen+pricePerEgg)+".");
    }
}
