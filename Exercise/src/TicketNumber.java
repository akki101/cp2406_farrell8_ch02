import javax.swing.*;

public class TicketNumber {
    public static void main(String []arg){
        int tNumber, verifier = 7, dropNum, remainder;
        boolean isValid;
        String userNum;
        userNum = JOptionPane.showInputDialog("Enter the ticket number for verification.");
        tNumber = Integer.parseInt(userNum);
        dropNum = tNumber/10;
        remainder = tNumber%10;
        isValid = (remainder == (dropNum % verifier));
        JOptionPane.showMessageDialog(null, isValid);
    }
}
