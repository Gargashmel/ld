import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Launcher nedelnoi davnosti");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Image image = new ImageIcon("C:\\Users\\User\\Desktop\\CheatPack\\DKcUpJgAtIc.jpg").getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };

        panel.setPreferredSize(new Dimension(720, 450));

        JTextField textField = new JTextField(20);
        textField.setBounds(250, 250, 200, 30);

        JButton button = new JButton("Enter");
        button.setForeground(Color.WHITE);
        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
        button.setBounds(300, 300, 100, 30);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = textField.getText();
                if (inputText.equals("lazzyz") || inputText.equals("excellent")) {
                    JFrame newFrame = new JFrame("Launcher - Vzlom jopi");
                    newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    newFrame.setSize(720, 450);
                    newFrame.add(new JPanel() {
                        @Override
                        protected void paintComponent(Graphics g) {
                            super.paintComponent(g);
                            Image image = new ImageIcon("C:\\Users\\User\\Desktop\\CheatPack\\DKcUpJgAtIc.jpg").getImage();
                            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
                            g.setColor(Color.WHITE); // Устанавливаем цвет шрифта
                            g.drawString("[+} Добавлен хуй под твоей мамашей", 10, 50);// Отображаем строку "да да" в координатах (50, 50)
                            g.drawString("[+} Добавлен хуй под твоей мамашей", 10, 60);
                            g.drawString("[+} Добавлен хуй под твоей мамашей", 10, 70);
                            g.drawString("[+} Добавлен хуй под твоей мамашей", 10, 80);
                            g.drawString("[+} Добавлен хуй под твоей мамашей", 10, 90);
                            g.drawString("[+} Добавлен хуй под твоей мамашей", 10, 100);
                            g.drawString("[+} Добавлен хуй под твоей мамашей", 10, 110);
                        }
                    });

                    newFrame.setVisible(true);
                    frame.dispose(); // Закрываем текущее окно
                } else {
                    JOptionPane.showMessageDialog(frame, "net ne plavelno");
                }
            }
        });

        panel.setLayout(null);
        panel.add(textField);
        panel.add(button);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}