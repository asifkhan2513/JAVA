import javax.swing.JFrame;
import java.awt.Component;
import java.awt.Graphics;
public class WelcomLevel extends Component {
    
    private String WelcomeMessage;
    public WelcomLevel(String welcomeMessage){
        this.WelcomeMessage= WelcomeMessage;

    } 
    public void paint (Graphics g){
        super.paint(g);
        g.drawString(WelcomeMessage, 50, 50);
    }
}
