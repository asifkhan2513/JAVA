import java.awt.GridLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
public class GridLayout1 extends Frame{
    public static void main(String[] args) {
        new GridLayout1();

    }
    GridLayout1(){
        setVisible(true);
        setSize(500, 900);
        GridLayout gl=new GridLayout(2,3);
        setBackground(new Color(32, 223, 223));
        setLayout(gl);
        gl.setHgap(20);
        gl.setVgap(10);
        
        add(new Button("Button 1"));
        add(new Button("Button 2"));
        add(new Button("Button 3"));
        add(new Button("Button 4"));
        add(new Button("Button 5"));
        add(new Button("Button 6"));


    }
}
