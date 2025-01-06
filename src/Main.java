import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
            JFrame frame = new JFrame();
            Panel panel = new Panel();

            //buttons
            JButton ACbutton = new JButton();
            JButton signButton = new JButton();
            JButton moduloButton = new JButton();
            JButton divideButton = new JButton();
            JButton addButton = new JButton();
            JButton subtractButton = new JButton();
            JButton multiplyButton = new JButton();
            JButton equalsButton = new JButton();

            //create an output field
            JTextField outputField = new JTextField();
            outputField.setEditable(false);
            outputField.setHorizontalAlignment(SwingConstants.RIGHT);
            outputField.setText("0");



            ACbutton.setText("AC");
            signButton.setText("+/-");
            moduloButton.setText("%");
            divideButton.setText("/");
            ACbutton.setSize(50,50);

            ACbutton.setVisible(true);


            frame.add(panel);
            panel.add(ACbutton);
            panel.add(signButton);
            panel.add(moduloButton);
            panel.add(divideButton);


            panel.add(outputField);

            //disable layout manager
            panel.setLayout(null);

            ACbutton.setBounds(25,110,70,70);
            signButton.setBounds(110,110,70,70);
            moduloButton.setBounds(195,110,70,70);
            divideButton.setBounds(280,110,70,70);
            outputField.setBounds(25, 40, 325, 70);

            //display frame
            frame.setSize(400, 600);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.setResizable(false);





        }
    }
