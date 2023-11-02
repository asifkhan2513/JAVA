import java.awt.Frame;
import java.awt.color.*;
import org.w3c.dom.Text;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextField;

public class TextComponanat extends Frame{
    public static void main(String[] args) {
     new TextComponanat();

    }
    public TextComponanat(){
        setVisible(true);
        setSize(500, 500);
        setLayout(new FlowLayout());
        TextField tf = new TextField();
        Font f = new Font(getName(), ABORT, E_RESIZE_CURSOR);
        add(tf);
        tf.setText("Asif khan");
        
        tf.setBackground(Color.PINK);
        System.out.println(tf.isEditable());
        tf.setText("This is your text Area");
        System.out.println(tf.isCursorSet());     
        System.out.println(tf.getText());
        // System.out.println(tf.setFont(f));

    }
 
}
