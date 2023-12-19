import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;


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
                g.setColor(Color.WHITE);
                g.drawString("Version 10.2", 10, getHeight() - 10);
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
                    JFrame Frame2 = new JFrame("Launcher - Vzlom jopi");
                    Frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    Frame2.setSize(720, 450);
//нопка читы 1 16 5
                    JButton button = new JButton("Cheats 1.16.5");
                    button.setForeground(Color.WHITE);
                    button.setOpaque(false);
                    button.setContentAreaFilled(false);
                    button.setBorderPainted(false);
                    button.setBounds(-20, 200, 150, 50);
//кнопка для скачки
                    JButton downloadButton = new JButton("Download");
                    downloadButton.setForeground(Color.WHITE);
                    downloadButton.setOpaque(false);
                    downloadButton.setContentAreaFilled(false);
                    downloadButton.setBorderPainted(false);
                    downloadButton.setBounds(100, 200, 150, 50);
                    downloadButton.setVisible(false); // Начально кнопка "Download" скрыта

                    button.addActionListener(e1 -> {
                        downloadButton.setVisible(true); // Показываем кнопку "Download" при нажатии
                    });
                    downloadButton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            try {
                                Desktop.getDesktop().browse(new URI("https://www.example.com/download")); // Замените ссылку на нужную вам
                            } catch (Exception ex) {
                                ex.printStackTrace();
                            }
                        }
                    });

                    Frame2.add(downloadButton);
                    Frame2.add(button);
                    Frame2.add(new JPanel() {
                        @Override
                        protected void paintComponent(Graphics g) {
                            super.paintComponent(g);
                            Image image = new ImageIcon("C:\\Users\\User\\Desktop\\CheatPack\\DKcUpJgAtIc.jpg").getImage();
                            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
                            g.setColor(Color.WHITE); // Устанавливаем цвет шрифта
                            g.drawString("[ + ] Добавлен хуй под твоей мамашей", 10, 10);// Отображаем строку "да да" в координатах (50, 50)
                            g.drawString("[ + ] Добавлен хуй под твоей мамашей", 10, 20);
                            g.drawString("[ + ] Добавлен хуй под твоей мамашей", 10, 30);
                            g.drawString("[ + ] Добавлен хуй под твоей мамашей", 10, 40);
                            g.drawString("[ + ] Добавлен хуй под твоей мамашей", 10, 50);
                            g.drawString("[ + ] Добавлен хуй под твоей мамашей", 10, 60);
                            g.drawString("[ + ] Добавлен хуй под твоей мамашей", 10, 70);

                            Frame2.setVisible(true);
                        }
                    });

                    Frame2.setVisible(true);
                    frame.dispose(); // Закрываем текущее окно
                } else {
                    JOptionPane.showMessageDialog(frame, "net ne plavelno idi naxyi");
                }
            }
        });

        panel.setLayout(null);
        panel.add(textField);
        panel.add(button);

        frame.add(button);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

    }
}