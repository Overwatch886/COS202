import javax.swing.JOptionPane;

public class QuickInput {
    public static void main(String[] args) {
        // 1. Show an input dialog box and capture the text
        String name = JOptionPane.showInputDialog("What is your name?");

        // 2. Display the result in a simple message pop-up
        if (name != null && !name.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Welcome, " + name + "!");
        } else {
            JOptionPane.showMessageDialog(null, "You didn't enter a name!");
        }
    }
}