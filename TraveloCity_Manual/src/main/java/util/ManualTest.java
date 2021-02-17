package util;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static org.junit.Assert.assertEquals;

public class ManualTest {

    public static void validate(String step, String nameScenario) {
        int YES = 1;
        String reason = "";
        String[] options = {"No", "Yes"};
        int optionSelected = JOptionPane.showOptionDialog(new JFrame(), "The step \"" + step + "\" was executed correctly?",
                nameScenario, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, options, options[0]);
        if(optionSelected == 0) {
            reason = JOptionPane.showInputDialog("Enter the reason why the test did not run correctly");
        }
        assertEquals(reason, YES, optionSelected);
    }
}
