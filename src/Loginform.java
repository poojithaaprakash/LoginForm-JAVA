import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Form extends JFrame implements ActionListener{
    JPasswordField pass1;
    JTextField user1;
     
    Form(){
    setTitle("LOGIN FORM");
    setSize(400,300);
    setLocation(100,100);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    JPanel p= new JPanel();
    p.setLayout(null);
    add(p);
    
    JLabel greet=new JLabel("WELCOME!! :)");
    greet.setBounds(150,10,120,20);
    p.add(greet);
    
    Color mycolor=new Color(207,196,196);
    p.setBackground(mycolor);
    
    //user_name field
    JLabel user=new JLabel("USERNAME");
    user.setBounds(10, 50, 100, 20);
    p.add(user);
    
    user1=new JTextField();
    user1.setBounds(120,50,120,20);
    p.add(user1);
    
    //password field
    JLabel pass=new JLabel("PASSWORD");
    pass.setBounds(10, 100, 100, 20);
    p.add(pass);
    
    pass1=new JPasswordField();
    pass1.setBounds(120,100,120,20);
    p.add(pass1);
    
    //button
    JButton login=new JButton("LOGIN");
    login.setBounds(100, 150, 70, 20);
    p.add(login);

    login.addActionListener(this);
    setVisible(true);
    
    }
    public void actionPerformed(ActionEvent e) {
        System.out.println("USERNAME :"+user1.getText());
        System.out.println("PASSWORD :"+pass1.getText());

    }
}

public class Loginform{
    public static void main(String[] args){
    new Form();
}
}


