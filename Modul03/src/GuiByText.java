import javax.swing.*;
import java.awt.event.ActionEvent;


public class GuiByText extends JFrame {

    JLabel label1 = new JLabel("coba Input 1 ");
    JTextField textField = new JTextField();
    JButton button1 = new JButton("Greet");

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

        label1.setBounds(16, 32, 100, 25);
        textField.setBounds(124, 32, 100, 25);
        button1.setBounds(232, 32, 80, 25);


    }

    public static void main(String[] args) {
        GuiByText guiByText = new GuiByText();
        guiByText.meletakkanKomponen();
        guiByText.setVisible(true);
    }


void menambahkanListener() {
    button1.addActionListener(new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            String nama = textField.getText();
            JOptionPane.showInternalMessageDialog(null, "hai" + null);
        }
    });
}
}
