import javax.swing.*;
import java.awt.event.ActionEvent;


public class GuiByText extends JFrame {

    JLabel label1 = new JLabel("coba Input 1 ");
    JTextField textField = new JTextField();
    JButton button1 = new JButton("Greet");

    JLabel label2 = new JLabel("Panjang");
    JLabel label3 = new JLabel("Lebar");
    JLabel label4 = new JLabel("Hasil");
    JTextField tPanjang = new JTextField();
    JTextField tLebar = new JTextField();
    JTextField tHasil = new JTextField();
    JButton bHitung = new JButton("Hitung Luas");

    GuiByText() {
        setSize(640, 480);
        setLocationRelativeTo(null);
        setTitle("Gui by Text");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    void meletakkanKomponen() {
        getContentPane().setLayout(null);

        getContentPane().add(label1);
        getContentPane().add(textField);
        getContentPane().add(button1);
        getContentPane().add(label2);
        getContentPane().add(label3);
        getContentPane().add(label4);
        getContentPane().add(tPanjang);
        getContentPane().add(tLebar);
        getContentPane().add(tHasil);
        getContentPane().add(bHitung);

        label1.setBounds(16, 32, 100, 25);
        textField.setBounds(124, 32, 100, 25);
        button1.setBounds(232, 32, 80, 25);
        label2.setBounds(16, 80, 100, 25);
        tPanjang.setBounds(124, 80, 100, 25);
        label3.setBounds(16, 113, 100, 25);
        tLebar.setBounds(124, 113, 100, 25);
        bHitung.setBounds(16, 146, 208, 25);
        label4.setBounds(16, 179, 100, 25);
        tHasil.setBounds(124, 179, 100, 25);


    }

    public static void main(String[] args) {
        GuiByText guiByText = new GuiByText();
        guiByText.meletakkanKomponen();
        guiByText.menambahkanListener();
        guiByText.setVisible(true);
    }


    void menambahkanListener() {

        button1.addActionListener(actionEvent -> {

            JOptionPane.showMessageDialog(null,
                    "Hai");
        });
        bHitung.addActionListener(actionEvent -> {
            int panjang = Integer.parseInt(tPanjang.getText());
            int lebar = Integer.parseInt(tLebar.getText());

            int hasil = panjang * lebar;
            String sHasil = String.valueOf(hasil);


        });

    }

}