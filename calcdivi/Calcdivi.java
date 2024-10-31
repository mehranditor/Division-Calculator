import javax.swing.*;
import java.awt.*;

public class Calcdivi extends JFrame {
    JPanel panel = new JPanel();

    public Calcdivi() {
        setTitle("Division Calculation");
        setBounds(600, 400, 700, 200);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        ImageIcon icon = new ImageIcon(

                "digital-art-beautiful-mountains.png");
        setIconImage(icon.getImage());
        panel.setLayout(null);

        add(panel);
        placeComponents(panel);

        setVisible(true);
    }

    private void placeComponents(JPanel panel) {

        JLabel userLabel1 = new JLabel("First number:");
        userLabel1.setForeground(Color.yellow);
        userLabel1.setBounds(10, 20, 100, 25);
        panel.add(userLabel1);

        JTextField firstNumber = new JTextField(20);
        firstNumber.setBounds(120, 20, 165, 25);
        panel.add(firstNumber);

        JLabel userLabel2 = new JLabel("Second number:");
        userLabel2.setForeground(Color.yellow);
        userLabel2.setBounds(10, 50, 100, 25);
        panel.add(userLabel2);

        JTextField secondNumber = new JTextField(20);
        secondNumber.setBounds(120, 50, 165, 25);
        panel.add(secondNumber);

        JButton calcButton = new JButton("Calculate");
        calcButton.setFocusable(false);
        calcButton.setBounds(120, 80, 150, 25);

        calcButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        panel.add(calcButton);

        JLabel resultLabel = new JLabel("Result:");
        resultLabel.setForeground(Color.yellow);
        resultLabel.setBounds(10, 120, 100, 25);
        panel.add(resultLabel);

        JTextField resultField = new JTextField(20);
        resultField.setEditable(false);
        resultField.setBounds(120, 120, 165, 25);
        resultField.setBackground(Color.GRAY);
        resultField.setForeground(Color.YELLOW);
        panel.add(resultField);

        calcButton.addActionListener(e -> {
            try {
                int num1 = Integer.parseInt(firstNumber.getText());
                int num2 = Integer.parseInt(secondNumber.getText());
                if (num2 == 0) {
                    JOptionPane.showMessageDialog(panel, "Cannot divide by zero", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    int result = num1 / num2;
                    resultField.setText(String.valueOf(result));
                    JOptionPane.showMessageDialog(panel, "The correct answer is: " + result, "Well done!",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(panel, "Invalid input. Try again.☠", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
        ImageIcon image = new ImageIcon("digital-art-beautiful-mountains.png");
        JLabel label = new JLabel(image);
        label.setBounds(0, 0, 800, 200);
        panel.add(label);
    }

    public static void main(String[] args) {
        new Calcdivi();
    }
}
