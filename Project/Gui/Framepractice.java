import java.awt.Frame;
import java.awt.Color;
import java.awt.Font;
public class Framepractice extends frame{
    public static void main(String[] args) {
        Frame f = new Frame();
        Font b = new Font("Castoro Titling",Font.BOLD, 15);
        f.setFont(b);
        f.setVisible(true);
        f.setTitle("Asif khan");
        f.setLocation(50, 100);
        f.setBackground(Color.pink);
        f.setForeground(Color.BLACK);
        f.setSize(500, 500);


    }
    Framepractice(){
        
    }
}
