import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeWork8 extends JFrame {
    private int vaule;
    public HomeWork8 () {
        setBounds(500, 500, 300, 150);
        setTitle("Счётчик вводов");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Font font = new Font("Arial", Font.BOLD, 32);
        JTextField counterText = new JTextField();
        counterText.setFont(font);
        counterText.setHorizontalAlignment(SwingConstants.CENTER);
        add(counterText, BorderLayout.SOUTH);

        JTextField counterValueView = new JTextField();
        counterValueView.setFont(font);
        counterValueView.setHorizontalAlignment(SwingConstants.CENTER);
        add(counterValueView, BorderLayout.NORTH);
        counterValueView.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vaule++;
                counterText.setText(String.valueOf(vaule));
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new HomeWork8();
    }

}
