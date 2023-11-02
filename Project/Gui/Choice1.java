import java.awt.Frame;
import java.awt.Choice;
import java.awt.*;
import java.awt.event.*;
public class Choice1 {
    public static void main(String[] args) {
        new MyFrame();
    }

}

class MyFrame extends Frame {
    Choice c;
    Button b;
    Font f;


    MyFrame(){
        setVisible(true);
        setLayout(new GridLayout(2,1));
        setBackground(new Color(32,223,223));

        setSize(500, 600);
        setLocation(100,200);
        setFont(f);

        c= new Choice();
        f= new Font("Libre Baskerville", Font.BOLD, 15);
        b= new Button("Show");
    
        c.add("Asif");
        c.add("thanos");
        c.add("mukesh");
        c.add("Ramesh");
        add(c);
        add(b);
        b.addActionListener(new ActionListener() {
            public void ActionPerformed(ActionEvent w){
               String s = c.getSelectedItem();
               System.out.println(s);
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
        });
        // c.setBackground(new Color(255,255,255));
        // add(f);


    }

}
