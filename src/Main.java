import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Constructor
 */
public class Main extends functions {

        //create an output field
        public static JTextField outputField;
        public static double secondNumber = 0;
        private static String operator = "";
        private static double firstNumber = 0;
        private static boolean isOperatorSet = false;




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
            JButton developerButton = new JButton();
            JButton dotButton = new JButton();


            //number buttons
            JButton one = new JButton();
            JButton two = new JButton();
            JButton three = new JButton();
            JButton four = new JButton();
            JButton five = new JButton();
            JButton six = new JButton();
            JButton seven = new JButton();
            JButton eight = new JButton();
            JButton nine = new JButton();
            JButton zero = new JButton();

            outputField = new JTextField();
            outputField.setEditable(false);
            outputField.setHorizontalAlignment(SwingConstants.RIGHT);





            ACbutton.setText("AC");
            signButton.setText("+/-");
            moduloButton.setText("%");
            divideButton.setText("/");
            multiplyButton.setText("X");
            equalsButton.setText("=");
            subtractButton.setText("-");
            addButton.setText("+");
            one.setText("1");
            two.setText("2");
            three.setText("3");
            four.setText("4");
            five.setText("5");
            six.setText("6");
            seven.setText("7");
            eight.setText("8");
            nine.setText("9");
            zero.setText("0");
            dotButton.setText(".");
            developerButton.setText("Beren Akpinar");



            ACbutton.setVisible(true);


            frame.add(panel);
            panel.add(ACbutton);
            panel.add(signButton);
            panel.add(moduloButton);
            panel.add(divideButton);
            panel.add(multiplyButton);
            panel.add(subtractButton);
            panel.add(addButton);
            panel.add(equalsButton);
            panel.add(one);
            panel.add(two);
            panel.add(three);
            panel.add(four);
            panel.add(five);
            panel.add(six);
            panel.add(seven);
            panel.add(eight);
            panel.add(nine);
            panel.add(zero);
            panel.add(dotButton);
            panel.add(developerButton);


            panel.add(outputField);

            //disable layout manager
            panel.setLayout(null);

            ACbutton.setBounds(25,110,70,70);
            signButton.setBounds(110,110,70,70);
            moduloButton.setBounds(195,110,70,70);
            divideButton.setBounds(280,110,70,70);
            outputField.setBounds(25, 40, 325, 70);
            seven.setBounds(25, 190, 70, 70);
            eight.setBounds(110, 190, 70, 70);
            nine.setBounds(195, 190, 70, 70);
            multiplyButton.setBounds(280,190,70,70);
            four.setBounds(25,270,70,70);
            five.setBounds(110,270,70,70);
            six.setBounds(195,270,70,70);
            subtractButton.setBounds(280,270,70,70);
            one.setBounds(25,350,70,70);
            two.setBounds(110,350,70,70);
            three.setBounds(195,350,70,70);
            addButton.setBounds(280,350,70,70);
            developerButton.setBounds(25,430,70,70);
            zero.setBounds(110,430,70,70);
            dotButton.setBounds(195,430,70,70);
            equalsButton.setBounds(280,430,70,70);




            //display frame
            frame.setSize(400, 600);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.setResizable(false);




            one.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        //1+...
                        if (isOperatorSet) {
                            outputField.setText(""); // Clear the field for second input
                            isOperatorSet = false;
                        }
                        appendNumber(1); // For button 'one'

                    }
            });



            two.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (isOperatorSet) {
                            outputField.setText("");
                            isOperatorSet = false;
                        }
                        appendNumber(2);

                    }
            });

            three.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (isOperatorSet) {
                        outputField.setText("");
                        isOperatorSet = false;
                    }
                    appendNumber(3);
                }
            });

            four.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (isOperatorSet) {
                        outputField.setText("");
                        isOperatorSet = false;
                    }
                    appendNumber(4);
                }
            });

            five.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (isOperatorSet) {
                        outputField.setText("");
                        isOperatorSet = false;
                    }
                    appendNumber(5);
                }
            });

            six.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (isOperatorSet) {
                        outputField.setText("");
                        isOperatorSet = false;
                    }
                    appendNumber(6);
                }
            });

            seven.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (isOperatorSet) {
                        outputField.setText("");
                        isOperatorSet = false;
                    }
                    appendNumber(7);
                }
            });

            eight.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (isOperatorSet) {
                        outputField.setText("");
                        isOperatorSet = false;
                    }
                    appendNumber(8);
                }
            });

            nine.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (isOperatorSet) {
                        outputField.setText("");
                        isOperatorSet = false;
                    }
                    appendNumber(9);
                }
            });

            zero.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (isOperatorSet) {
                        outputField.setText("");
                        isOperatorSet = false;
                    }
                    appendNumber(0);
                }
            });

            addButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        firstNumber = Double.parseDouble(outputField.getText());
                        operator = "+";
                        isOperatorSet = true;
                    }
            });

            subtractButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    firstNumber = Double.parseDouble(outputField.getText());
                    operator = "-";
                    isOperatorSet = true;
                }
            });

            multiplyButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    firstNumber = Double.parseDouble(outputField.getText());
                    operator = "X";
                    isOperatorSet = true;
                }
            });

            moduloButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    firstNumber = Double.parseDouble(outputField.getText());
                    operator = "%";
                    isOperatorSet = true;
                }
            });

            ACbutton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    outputField.setText("");
                }
            });







            equalsButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        double secondNumber = Double.parseDouble(outputField.getText());
                        double result = 0;

                        switch (operator) {
                            case "%":
                                result = secondNumber % firstNumber;
                                break;
                            case "X":
                                result = firstNumber * secondNumber;
                                break;
                            case "/":
                                result = secondNumber / firstNumber;
                                break;
                            case "-":
                                result = firstNumber - secondNumber;
                                break;
                            case "+":
                                result = firstNumber + secondNumber;
                                break;

                        }
                        outputField.setText(String.valueOf(result));

                    }

            });





        }


        private static void appendNumber(int number) {
            outputField.setText(outputField.getText() + number);
        }




}
