import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Color;
import java.awt.Button;
import java.awt.event.*;
import java.util.concurrent.Flow;
import java.awt.FlowLayout;
import java.awt.Font;
public class UserNamePass extends Frame {
    public static void main(String[] args) {
        UserNamePass  w = new UserNamePass();
    }
    TextField t1,t2;
    Button b;
    Label emailLabel , passLabel;
    Font f;

    UserNamePass (){
        setVisible(true);
        setSize(300, 250);
        setLayout(new FlowLayout());
        setBackground(new Color(32, 223, 223));
        t1= new TextField(20);
        t2= new TextField(20);  
        f= new Font("Libre Baskerville", Font.BOLD, E_RESIZE_CURSOR);
        setFont(f);
        emailLabel = new Label("User Name");
        passLabel = new Label("Password");


        b= new Button("Submit");
        add(emailLabel);
        add(t1);
        add(passLabel);

        add(t2);
        add(b);        

    }
    
}
