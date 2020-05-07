import javax.swing.*;


public class GuiByText extends JFrame {

    JLabel label1 = new JLabel( "coba Input 1 ");
    JTextField textField = new JTextField();

    GuiByText(){
        setSize(  640, 480);
        setLocationRelativeTo(null);
        setTitle("Gui by Text");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    void meletakkanKomponen(){
        getContentPane().setLayout(null);

        getContentPane().add(label1);
        getContentPane().add(textField);
        label1.setBounds(16,32,100,25);
        textField.setBounds(124,32,100,25);


    }

    public static void main(String [] args){
        GuiByText guiByText = new GuiByText();
        guiByText.setVisible(true);
    }
}
