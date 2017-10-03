import javax.swing.*;

public class AssociatesWindows {
    private JButton Register_associate;
    private JList Names;
    private JList IDS;
    private JTextArea nameTextArea;
    private JTextArea IDTextArea;
    private JPanel AssociateManager;


    public static void main(String[] args) {
        JFrame frame = new JFrame("AssociatesWindows");
        frame.setContentPane(new AssociatesWindows().AssociateManager);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
