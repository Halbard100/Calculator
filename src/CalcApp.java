import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.Predicate;

public class CalcApp extends JFrame{

    private static boolean DEBUG = true;

    private JLabel lableData;
    private JButton a1Button;
    private JButton a3Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton a4Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a0Button;
    private JPanel mainPanel;
    private JButton clearButton;
    private JPanel panelBtns;
    private JPanel panelData;
    private JButton btnDiv;
    private JButton btnAdd;
    private JButton btnMult;
    private JButton btnSub;
    private JButton btnRes;
    private Calc calculator;
    private String currentFunct = "";
    private boolean newDigit = true; //control setting for when the next input is the start of a new number (true)

    public CalcApp() {

        calculator = new Calc();


        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lableData.getText().equalsIgnoreCase("0") || newDigit){
                    lableData.setText(a1Button.getText());
                    newDigit = false;
                } else {
                    lableData.setText(lableData.getText()+a1Button.getText());
                }
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lableData.getText().equalsIgnoreCase("0") || newDigit){
                    lableData.setText(a2Button.getText());
                    newDigit = false;
                } else {
                    lableData.setText(lableData.getText() + a2Button.getText());
                }
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lableData.getText().equalsIgnoreCase("0") || newDigit){
                    lableData.setText(a3Button.getText());
                    newDigit = false;
                } else{
                    lableData.setText(lableData.getText()+a3Button.getText());
                }
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lableData.getText().equalsIgnoreCase("0")  || newDigit){
                    lableData.setText(a4Button.getText());
                    newDigit = false;
                } else {
                    lableData.setText(lableData.getText()+a4Button.getText());
                }
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lableData.getText().equalsIgnoreCase("0") || newDigit){
                    lableData.setText(a5Button.getText());
                    newDigit = false;
                } else {
                    lableData.setText(lableData.getText()+a5Button.getText());
                }
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lableData.getText().equalsIgnoreCase("0") || newDigit){
                    lableData.setText(a6Button.getText());
                    newDigit = false;
                } else lableData.setText(lableData.getText()+a6Button.getText());
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lableData.getText().equalsIgnoreCase("0")  || newDigit){
                    lableData.setText(a7Button.getText());
                    newDigit = false;
                } else {
                    lableData.setText(lableData.getText()+a7Button.getText());
                }
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lableData.getText().equalsIgnoreCase("0") || newDigit){
                    lableData.setText(a8Button.getText());
                    newDigit = false;
                } else lableData.setText(lableData.getText()+a8Button.getText());
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lableData.getText().equalsIgnoreCase("0") || newDigit){
                    lableData.setText(a9Button.getText());
                    newDigit = false;
                } else {
                    lableData.setText(lableData.getText()+a9Button.getText());
                }
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lableData.getText().equalsIgnoreCase("0") || newDigit){
                    lableData.setText(a0Button.getText());
                    newDigit = false;
                } else {
                    lableData.setText(lableData.getText()+a0Button.getText());
                }
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lableData.setText("0");
                newDigit = true;
            }
        });

        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // perform current funct if there is one saved


                if (!currentFunct.equals("")){
                    // take the current value entered and do the function
                    calculator.Calculate(Double.parseDouble(lableData.getText()), currentFunct);
                    // set the current display to the new result
                    lableData.setText(calculator.RESULT()+"");
                } else {
                    calculator = new Calc(Double.parseDouble(lableData.getText()));
                }
                // save function that user pressed
                currentFunct = "+";
                newDigit = true;

            }
        });

        btnDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!currentFunct.equals("")){
                    // take the current value entered and do the function
                    calculator.Calculate(Double.parseDouble(lableData.getText()), currentFunct);
                    // set the current display to the new result
                    lableData.setText(calculator.RESULT()+"");
                } else {
                    calculator = new Calc(Double.parseDouble(lableData.getText()));
                }
                // save function that user pressed
                currentFunct = "/";
                newDigit = true;
            }
        });

        btnMult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!currentFunct.equals("")){
                    // take the current value entered and do the function
                    calculator.Calculate(Double.parseDouble(lableData.getText()), currentFunct);
                    // set the current display to the new result
                    lableData.setText(calculator.RESULT()+"");
                } else {
                    calculator = new Calc(Double.parseDouble(lableData.getText()));
                }
                // save function that user pressed
                currentFunct = "*";
                newDigit = true;
            }
        });

        btnSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!currentFunct.equals("")){
                    // take the current value entered and do the function
                    calculator.Calculate(Double.parseDouble(lableData.getText()), currentFunct);
                    // set the current display to the new result
                    lableData.setText(calculator.RESULT()+"");
                } else {
                    calculator = new Calc(Double.parseDouble(lableData.getText()));
                }
                // save function that user pressed
                currentFunct = "-";
                newDigit = true;
            }
        });

        btnRes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculator.Calculate(Double.parseDouble(lableData.getText()), currentFunct); // do the current saved funct
                lableData.setText(""+calculator.res); // display the result
                newDigit = true; // set number display to start a new number next button
                currentFunct = ""; // clear out saved function
            }
        });
    }


    public static void main(String[] args){
        System.out.println("This is a calculator. It will ask you to enter numbers and math functions (+, -, /, *)");

        CalcApp calc = new CalcApp();
        calc.setContentPane(calc.mainPanel);
        calc.setTitle("Calculator App");
        calc.setSize(300, 450);
        calc.setVisible(true);
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
