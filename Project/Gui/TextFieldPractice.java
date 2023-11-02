import java.awt.Frame;
import java.awt.FlowLayout;

import java.awt.TextField;
import java.awt.Color;
public class TextFieldPractice extends Frame{
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setVisible(true);
        f.setTitle("Asif khan");
        f.setBackground(Color.pink);
        f.setSize(500, 500);
        f.setLayout(new FlowLayout());
        TextField tf = new TextField("This is test field");
        TextField tf1 = new TextField("This is test field");
        TextField tf2 = new TextField("This is test field");
        TextField tf3 = new TextField("This is test field");



        f.add(tf);
        f.add(tf1);
        f.add(tf2);
        f.add(tf3);





    }
}
