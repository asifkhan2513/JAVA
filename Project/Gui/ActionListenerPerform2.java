import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Frame;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
class ActionListenerPerform2 extends Frame implements ActionListener {
    Button b, c;

    ActionListenerPerform2() {
        b = new Button(" Click me ");
        c = new Button(" Login ");
        Font f = new Font("Castoro Titling", Font.BOLD, E_RESIZE_CURSOR);

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(500, 500);
        setBackground(Color.PINK);
        b.setFont(f);
        c.setFont(f);
        b.addActionListener(this);
        c.addActionListener(this);
        add(b);
        add(c);
    }

    public static void main(String[] args) {
        ActionListenerPerform2 w = new ActionListenerPerform2();
    }

    public void actionPerformed(ActionEvent e) {
    Object source = e.getSource();
        // System.out.println("Button Clicked");
        if (source == b) {
            System.out.println("you Clicked on Click me");

        }
       else if (source == c) {
            System.out.println("you Clicked on Login");
        }

    }

}
