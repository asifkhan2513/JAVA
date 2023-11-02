import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;

public class Button1 extends Frame {
    public static void main(String[] args) {
        Button1 a = new Button1();
        
    }

    public Button1() {
        setVisible(true);
        setSize(500, 500);
        setBackground(Color.PINK);
        setTitle("Asif khan");


        setLayout(new FlowLayout());
        Button b1 = new Button("sign up");
        Button b2 = new Button(" login");
        b1.setPreferredSize(new Dimension(200, 50));
        b2.setPreferredSize(new Dimension(200, 50));
       



        Font f = new Font("Castoro Titling",Font.BOLD,15);
        setFont(f);
        add(b1);
        add(b2);

    }

}
