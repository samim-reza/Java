import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class TemperatureConverter extends JFrame {
    private JTextField fahrenheitTextField;
    private JTextField celsiusTextField;

    public TemperatureConverter() {
        setTitle("Temperature Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contentPane = new JPanel();
        contentPane.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets(10, 10, 10, 10);

        JLabel fahrenheitLabel = new JLabel("Fahrenheit:");
        fahrenheitTextField = new JTextField(10);

        JLabel celsiusLabel = new JLabel("Celsius:");
        celsiusTextField = new JTextField(10);
        celsiusTextField.setEditable(false);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateCelsius();
            }
        });

        JButton backspaceButton = new JButton("Backspace");
        backspaceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                backspace();
            }
        });

        constraints.gridx = 0;
        constraints.gridy = 0;
        contentPane.add(fahrenheitLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 0;
        contentPane.add(fahrenheitTextField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        contentPane.add(celsiusLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 1;
        contentPane.add(celsiusTextField, constraints);

        constraints.gridwidth = 2;
        constraints.gridx = 0;
        constraints.gridy = 2;
        contentPane.add(calculateButton, constraints);

        constraints.gridx = 0;
        constraints.gridy = 3;
        contentPane.add(backspaceButton, constraints);

        setContentPane(contentPane);
        pack();
        setLocationRelativeTo(null);
    }

    private void calculateCelsius() {
        try {
            double fahrenheit = Double.parseDouble(fahrenheitTextField.getText());
            double celsius = (fahrenheit - 32) * 5 / 9;

            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            String formattedCelsius = decimalFormat.format(celsius);

            celsiusTextField.setText(formattedCelsius);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter a valid temperature in Fahrenheit.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void backspace() {
        String currentText = fahrenheitTextField.getText();
        if (!currentText.isEmpty()) {
            String newText = currentText.substring(0, currentText.length() - 1);
            fahrenheitTextField.setText(newText);
        }
    }

    public static void main(String[] args) {
        new TemperatureConverter().setVisible(true);
    }
}
