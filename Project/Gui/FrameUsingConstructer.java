import java.awt.Frame;
import java.awt.TextField;
import java.awt.Color;
// import java.*;
import java.awt.FlowLayout;

public class FrameUsingConstructer {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }

}
class MyFrame extends Frame {
   private TextField m = new TextField("Text 1");
   private TextField m1 = new TextField("Text 2");
   private TextField m2 = new TextField("Text 3");

    
    
         MyFrame() {
        this.setSize(900, 300);
        this.setVisible(true);
        this.setLocation(100,50);
        FlowLayout layout = new FlowLayout(FlowLayout.LEFT,50,50);
            // m.setName("this is text Area");
            // m.setLocation(100, 200);
            // this.add(m);
        setLayout(layout);
        setTitle("Asif khan");
        setBackground(Color.PINK);
        add(m);
        add(m1);
        add(m2);

    }
}