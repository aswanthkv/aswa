package awt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sampleform implements ActionListener {
    private JButton button1;
    private JPanel panel1;
    JTextField textfield;
    JLabel label;



    Sampleform()
    {
        JFrame frame=new JFrame("first app");
        button1=new JButton("HIT ME");
        textfield=new JTextField();
        //textfield1=new JTextField()
        label=new JLabel("first name");
        frame.setLayout(null);
        frame.setSize(500,500);
        frame.add(button1);
        frame.add(label);
        frame.add(textfield);
        button1.setBounds(320,100,100,30);
        button1.addActionListener((ActionListener) this);
        textfield.setBounds(120,100,190,30);
        label.setBounds(70,70,90,30);

        button1.setBackground(Color.red);
        frame.setVisible(true);

    }

    public static void main(String[] args)
    {
     new  Sampleform();
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==button1)
        textfield.setText("Bhoom chikka wow wow");
        JOptionPane.showMessageDialog(null,"ashokan");
    }
}
