import javax.swing.*;

public class NauticalMilesInteractive {
    public static void main(String []arg){
        final float KILOMETERS_IN_NAUTICAL_MILE = 1.852f, MILES_IN_NAUTICAL_MILE = 1.150779f;
        float kilometerEqu, milesEqu;
        String userNMiles;
        userNMiles = JOptionPane.showInputDialog("Enter the number of nautical miles: ");
        kilometerEqu = Float.parseFloat(userNMiles)*KILOMETERS_IN_NAUTICAL_MILE;
        milesEqu = Float.parseFloat(userNMiles)*MILES_IN_NAUTICAL_MILE;

        JOptionPane.showMessageDialog(null,"This equals to "+kilometerEqu+" KM and "+milesEqu+ " miles.");

    }
}
