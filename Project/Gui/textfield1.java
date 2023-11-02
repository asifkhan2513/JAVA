import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Color;
public class textfield1 extends Frame {
    public static void main(String[] args) {
        textfield1 a = new textfield1();

    }
    public textfield1(){
        this.setTitle("TRING TO CREATE FIRST WEB PAGE");
        Font f = new Font("consolas",Font.BOLD, 15);

        TextField tf =new TextField();
        Label l = new Label("UserName");
        //second value 
        TextField tf1 =new TextField();
        Label l1 = new Label("PassWord");
        

        l1.setBounds(50,150, 100,50);
        tf1.setBounds(150,150, 200, 40);
        l1.setFont(f);
        tf1.setFont(f);
        l1.setForeground(Color.white);
        tf1.setBackground(Color.pink);

        this.add(l1);
        this.add(tf1);


        l.setBounds(50,100, 100,50);
        tf.setBounds(150,100, 200, 40);
        //second laval
     

        
        this.add(l);
        this.add(tf);
        this.add(l1);
        this.setLayout(null);
        this.setVisible(true);

        this.setBackground(Color.DARK_GRAY);
        tf.setBackground(Color.pink);
        tf.setFont(f);
        l.setForeground(Color.white);
        l.setFont(f);
      
        this.setSize(500, 500);
        
    }
}
