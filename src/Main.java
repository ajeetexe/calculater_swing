import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    private final JTextField jTextField;
    private boolean is_addition = false;
    private boolean is_subtraction = false;
    private boolean is_multiplication = false;
    private boolean is_division = false;
    private int num1, num2, res;

    public Main() {
        super("Calculator");
        setResizable(false);
        setSize(400, 600);
        Font a = new Font(Font.DIALOG, Font.BOLD, 18);
        jTextField = new JTextField();
        jTextField.setBounds(10, 50, 360, 50);
        jTextField.setEditable(false);
        jTextField.setText("0");
        jTextField.setForeground(Color.BLUE);
        jTextField.setBackground(Color.WHITE);
        jTextField.setHorizontalAlignment(SwingConstants.RIGHT);
        jTextField.setFont(a);
        add(jTextField);

        JButton btn_dot = new JButton(".");
        btn_dot.setBounds(10, 500, 100, 50);
        btn_dot.setFont(a);
        add(btn_dot);

        JButton btn_0 = new JButton("0");
        btn_0.setBounds(120, 500, 100, 50);
        btn_0.addActionListener(e -> set_data("0"));
        btn_0.setFont(a);
        add(btn_0);

        JButton btn_equal = new JButton("=");
        btn_equal.setBounds(230, 500, 130, 50);
        btn_equal.setFont(a);
        btn_equal.addActionListener(e -> {
            try {
                num2 = Integer.parseInt(jTextField.getText());
                if (is_addition) {
                    res = num1 + num2;
                    jTextField.setText(String.valueOf(res));
                    is_addition = false;
                } else if (is_subtraction) {
                    res = num1 - num2;
                    jTextField.setText(String.valueOf(res));
                    is_subtraction = false;
                } else if (is_multiplication) {
                    res = num1 * num2;
                    jTextField.setText(String.valueOf(res));
                    is_multiplication = false;
                } else if (is_division) {
                    res = num1 / num2;
                    jTextField.setText(String.valueOf(res));
                    is_division = false;
                }
            } catch (NumberFormatException ignored) {
            }

        });
        add(btn_equal);

        JButton btn_1 = new JButton("1");
        btn_1.setBounds(10, 440, 80, 50);
        btn_1.addActionListener(e -> set_data("1"));
        btn_1.setFont(a);
        add(btn_1);
        
        JButton btn_2 = new JButton("2");
        btn_2.setBounds(100, 440, 80, 50);
        btn_2.addActionListener(e -> set_data("2"));
        btn_2.setFont(a);
        add(btn_2);

        JButton btn_3 = new JButton("3");
        btn_3.setBounds(190, 440, 80, 50);
        btn_3.addActionListener(e -> set_data("3"));
        btn_3.setFont(a);
        add(btn_3);

        JButton btn_plus = new JButton("+");
        btn_plus.setBounds(280, 440, 80, 50);
        btn_plus.addActionListener(e -> {
            get_data();
            is_addition = true;
        });
        btn_plus.setFont(a);
        add(btn_plus);

        JButton btn_4 = new JButton("4");
        btn_4.setBounds(10, 380, 80, 50);
        btn_4.addActionListener(e -> set_data("4"));
        btn_4.setFont(a);
        add(btn_4);

        JButton btn_5 = new JButton("5");
        btn_5.setBounds(100, 380, 80, 50);
        btn_5.addActionListener(e -> set_data("5"));
        btn_5.setFont(a);
        add(btn_5);

        JButton btn_6 = new JButton("6");
        btn_6.setBounds(190, 380, 80, 50);
        btn_6.addActionListener(e -> set_data("6"));
        btn_6.setFont(a);
        add(btn_6);

        JButton btn_minus = new JButton("-");
        btn_minus.setBounds(280, 380, 80, 50);
        btn_minus.setFont(a);
        btn_minus.addActionListener(e -> {
            get_data();
            is_subtraction = true;
        });
        add(btn_minus);

        JButton btn_7 = new JButton("7");
        btn_7.setBounds(10, 320, 80, 50);
        btn_7.addActionListener(e -> set_data("7"));
        btn_7.setFont(a);
        add(btn_7);

        JButton btn_8 = new JButton("8");
        btn_8.setBounds(100, 320, 80, 50);
        btn_8.addActionListener(e -> set_data("8"));
        btn_8.setFont(a);
        add(btn_8);

        JButton btn_9 = new JButton("9");
        btn_9.setBounds(190, 320, 80, 50);
        btn_9.addActionListener(e -> set_data("9"));
        btn_9.setFont(a);
        add(btn_9);

        JButton btn_into = new JButton("*");
        btn_into.setBounds(280, 320, 80, 50);
        btn_into.setFont(a);
        btn_into.addActionListener(e -> {
            get_data();
            is_multiplication = true;
        });
        add(btn_into);

        JButton btn_del = new JButton("Del");
        btn_del.setBounds(10, 260, 100, 50);
        btn_del.setFont(a);
        add(btn_del);

        JButton btn_cancel = new JButton("Cancel");
        btn_cancel.setBounds(120, 260, 100, 50);
        btn_cancel.setFont(a);
        btn_cancel.addActionListener(e -> jTextField.setText(null));
        add(btn_cancel);

        JButton btn_by = new JButton("/");
        btn_by.setBounds(230, 260, 130, 50);
        btn_by.setFont(a);
        btn_by.addActionListener(e -> {
            get_data();
            is_division = true;
        });
        add(btn_by);


        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }

    public void set_data(String num) {
        String concat = jTextField.getText() + num;
        jTextField.setText(concat);
    }

    public void get_data() {
        num1 = Integer.parseInt(jTextField.getText());
        jTextField.setText("");
    }

    public static void main(String[] args) {
        new Main();

    }
}
