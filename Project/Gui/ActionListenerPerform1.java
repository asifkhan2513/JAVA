import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class ActionListenerPerform1 extends Frame {

    ActionListenerPerform1() {
        setVisible(true);
        setSize(500, 500);
        setBackground(Color.PINK);
        setPreferredSize(new Dimension(200, 60));
        Button b1 = new Button("Hello");
        Font f = new Font("Castoro Titling", Font.BOLD, E_RESIZE_CURSOR);
        b1.setFont(f);
        b1.setPreferredSize(new Dimension(150, 60));
        setLayout(new FlowLayout());
        b1.addActionListener(new MyActionListener());
        add(b1);

    }

    public static void main(String[] args) {
        ActionListenerPerform1 m = new ActionListenerPerform1();
    }
}

class MyActionListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.out.println("Ab bs kro kitna dabaoge");
    }
}
