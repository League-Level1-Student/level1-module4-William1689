package _05_fortune_teller;
import javax.swing.SwingUtilities;

public class FortuneTellerRunner {
    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(new FortuneTeller());
        begin();
    }

    static void begin() {
        // Welcome the user. Give them a hint for the secret location.
    	System.out.println("Welcome nerd, their a special location u need to find but idk where it is goodbye");

    }
}
