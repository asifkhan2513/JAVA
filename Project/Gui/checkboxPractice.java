import java.awt.*;
import java.awt.event.*;

public class checkboxPractice extends Frame {

    Checkbox c1,c2,c3;
    Label mesg;
    Button ok;
    public static void main(String[] args) {
        checkboxPractice ch = new checkboxPractice();
        ch.addWindowListener(new myWindowListener());
    }
    private void init(){
        c1= new Checkbox("JAVA");
        c2= new Checkbox("Python");
        c3= new Checkbox("C++");
        ok = new Button("ok");
        mesg= new Label("Select Any Cursur");

    }
    checkboxPractice() {
        setSize(200,400);
        setVisible(true);
        setLocation(200, 300);
        init();
        setLayout(new GridLayout(5,1,10,10));
        add(mesg);
        add(c1);
        add(c2);
        add(c3);
        add(ok);
    }
}
class myWindowListener implements WindowListener {
    public void windowActivated(WindowEvent ev) {
        System.out.println("Activate");
    }
 
    public void windowDeactivated(WindowEvent ev) {
        System.out.println("Deactivate");
    }

    public void windowOpened(WindowEvent ev) {
        System.out.println("open");
    }

    public void windowIconified(WindowEvent ev) {
        System.out.println("iconFiel");
    }

    public void windowDeiconified(WindowEvent ev) {
        System.out.println("deIconfied");
    }

    public void windowClosed(WindowEvent ev) {
        System.out.println("Closed");
    }

    public void windowClosing(windowEvent ev) {
        // System.out.println("Closing");
        ev.getWindow().dispose();
    }

    @Override
    public void windowClosing(WindowEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'windowClosing'");
    }


}
