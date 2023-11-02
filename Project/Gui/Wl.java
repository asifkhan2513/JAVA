import java.awt.*;
import java.awt.event.*;
import java.awt.WindowListener;
public class Wl extends Frame implements WindowListener{
    public static void main(String[] args) {
        Wl wl = new Wl();
        wl.addWindowListener(new WindowListener(){
            public void windowActivated(WindowEvent ev){
                System.out.println("activated");
            }
        });

    }
    Wl(){
        Frame f = new Frame("Asif khan");
        f.setVisible(true);
        f.setSize(500, 500);
        f.setBackground(new Color(32   , 223, 223));
    }
}
