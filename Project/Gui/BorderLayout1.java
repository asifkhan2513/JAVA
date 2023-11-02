import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class BorderLayout1 extends Frame {
    
    private Panel east;
    private Panel west;
    private Panel north;
    private Panel south;
    private Panel center;

    BorderLayout1() {
        setSize(1350,900);
        setVisible(true);
        setTitle("Asif Chaoudhary");
        BorderLayout bl =  new BorderLayout();
        setLayout(bl);
        bl.setHgap(50);
        bl.setVgap(10);


        // setBackground(new Color(128, 128, 255));
        east = new Panel();
        west = new Panel();
        south = new Panel();
        north = new Panel();
        center = new Panel();

        east.setPreferredSize(new Dimension(150,500));
        west.setPreferredSize(new Dimension(150,500));
        south.setPreferredSize(new Dimension(200,120));
        north.setPreferredSize(new Dimension(200,100));
        center.setPreferredSize(new Dimension(200,500));
        
        east.setBackground(Color.GREEN);
        west.setBackground(Color.white);
        south.setBackground(Color.RED);
        north.setBackground(Color.PINK);
        center.setBackground(Color.YELLOW);



        
        add(east,BorderLayout.EAST);
        add(west,BorderLayout.WEST);
        add(south,BorderLayout.SOUTH);
        add(north,BorderLayout.NORTH);
        add(center,BorderLayout.CENTER);
    }
    public static void main(String[] args) {
        BorderLayout1 j = new BorderLayout1();
    }

}
