import javax.swing.JFrame;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.Graphics;
public class Wlcomelabel1 extends Component{
    private String WelcomeMessage ;
    public Wlcomelabel1(String WelcomeMessage)
    {
        this.WelcomeMessage = WelcomeMessage;

    }
    public void paint(java.awt.Graphics g)
    {
        super.paint(g);
        g.drawString("welcome", 50, 50);
    }
}
public static void main(String[] args) {
    System.out.println("Asif");
}
