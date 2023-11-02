import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Assigment1 extends Frame implements ActionListener {
    public static void main(String[] args) {
        Assigment1 m = new Assigment1();
       }
       TextField text1 ,text2;
       Button b;
       Font f;
       Assigment1 (){
        setVisible(true);
        setTitle("Asif khan");
        setSize(250, 500);
        setLayout(new FlowLayout());
        text1 = new TextField(20);
        text2 = new TextField(20);
        f = new Font("Bruno Ace", Font.BOLD,15);
        b= new Button("   Swap    ");
        setFont(f);
        setBackground(new Color(165, 100,35));
        b.setForeground(Color.WHITE);
        b.addActionListener(this);
        add(text1);
        add(text2);
        add(b);
       }
       public void actionPerformed(ActionEvent e){
        String t1 = text1.getText();
        String t2 = text2.getText();
        // System.out.println(t1 + "  "+t2);
        text1.setText(t2);
        text2.setText(t1);
       }
}
