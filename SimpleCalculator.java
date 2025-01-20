import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {

    private JTextField display;
    private double num1, num2, result;
    private String operator;
    private boolean newOperation = true;

    public Calculator() {
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLayout(new BorderLayout());

        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Monospaced", Font.PLAIN, 24));
        add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };
        for (String buttonLabel : buttons) {
            JButton b = new JButton(buttonLabel);
            b.addActionListener(this);
            buttonPanel.add(b);
        }
        add(buttonPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (Character.isDigit(command.charAt(0)) || command.equals(".")) {
            if (newOperation) {
                display.setText("");
                newOperation = false;
            }
            display.setText(display.getText() + command);
        } else if (command.equals("=")) {
            try {
                num2 = Double.parseDouble(display.getText());
                calculate();
                display.setText(String.valueOf(result));
                newOperation = true;
            } catch (NumberFormatException ex) {
                display.setText("Error");
                newOperation = true;
            }
        } else {
            try {
                num1 = Double.parseDouble(display.getText());
                operator = command;
                newOperation = true;
            } catch (NumberFormatException ex) {
                display.setText("Error");
                newOperation = true;
            }
        }
    }

    private void calculate() {
        try {
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        result = Double.NaN;
                    } else {
                        result = num1 / num2;
                    }
                    break;
            }
            if (Double.isNaN(result)) {
                display.setText("Error: Division by zero");
            } else {
                display.setText(String.valueOf(result));
            }
        } catch (Exception ex) {
            display.setText("Error");
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}