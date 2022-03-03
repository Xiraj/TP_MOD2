import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TpForm extends JFrame {
    private JTextField userField;
    private JPanel panel1;
    private JButton submitButton;

    public TpForm() {
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(submitButton, userField.getText());
            }
        });
    }

    public static void main(String[]args) {
        TpForm frame = new TpForm();
        frame.setContentPane(frame.panel1);
        frame.setTitle("Tp Data");
        frame.setBounds(600, 200, 200, 200);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
