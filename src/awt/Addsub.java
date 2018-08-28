package awt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Addsub implements ActionListener {

    private JButton button1,button2;
    private JPanel panel1;
    JTextField textfield1,textfield2,textfield3;
    JLabel label1;
    JLabel label2,label3;

    Addsub()
    {
        JFrame frame=new JFrame("first app");
        button1=new JButton("ADD");
        button2=new JButton("SUB");
        textfield1=new JTextField();
        textfield2=new JTextField();
        textfield3=new JTextField();
        //textfield1=new JTextField()
        label1=new JLabel("input 1");
        label2=new JLabel("input 2");
        label3=new JLabel("Result");

        frame.setLayout(null);
        frame.setSize(500,500);
        frame.add(button1);
        frame.add(button2);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(textfield1);
        frame.add(textfield2);
        frame.add(textfield3);
        button1.setBounds(120,300,100,30);
        button1.addActionListener((ActionListener) this);
        button2.setBounds(220,300,100,30);
        button2.addActionListener((ActionListener) this);
        textfield1.setBounds(150,100,190,30);
        textfield2.setBounds(150,150,190,30);
        textfield3.setBounds(150,200,190,30);
        label1.setBounds(60,90,90,30);
        label2.setBounds(60,150,90,30);
        label3.setBounds(60,200,90,30);

        button1.setBackground(Color.red);
        frame.setVisible(true);
    }



    public static void main(String[] args) {
        new Addsub();

    }

        @Override
        public void actionPerformed(ActionEvent e)
        {

            int a=Integer.parseInt(textfield1.getText());
            int b=Integer.parseInt(textfield2.getText());
            int r=a+b;
            int s=a-b;
            if(e.getSource()==button1)
            {
                textfield3.setText(String.valueOf(r));
            }
            else
            {
                textfield3.setText(String.valueOf(s));
            }
           // JOptionPane.showMessageDialog(null,"enter input");
        }

}
