import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TpForm extends JFrame
{
    JPanel panel = new JPanel();
    JLabel result = new JLabel();
    JTextField textField = new JTextField(30);
    JButton submit = new JButton("Enter");

    public TpForm()
    {
        setTitle("Tutorial");
        setVisible(true);
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel.add(textField);


        textField.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String input = textField.getText();
                result.setText(input);
            }
        });

        panel.add(submit);
        submit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String input = textField.getText();
                result.setText("Name: "+input);
            }
        });

        panel.add(result);
        add(panel);

    }

    public static void main(String[] args)
    {
        TpForm t = new TpForm();
    }
}