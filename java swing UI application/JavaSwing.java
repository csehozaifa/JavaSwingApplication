import javax.swing.*;
import java.awt.*;//awt is a father of swing.awt is  a ui application for desktop
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaSwing implements ActionListener {
        JFrame window; //jframe is a class in java swing
    JButton button;
        JavaSwing(){
            window=new JFrame();
            window.setLayout(null);
            window.setVisible(true);
            window.setSize(500,500);//500 in pixel
            window.getContentPane().setBackground(Color.blue);
            button=new JButton("Accijob");
            button.setSize(100,100);
            button.addActionListener(this);
            button.setLocation(200,225);
            window.add(button);
        }
        public static void main(String[] args){
            JavaSwing obj=new JavaSwing();
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        window.getContentPane().setBackground(Color.black);
    }
}

