import java.awt.*;
// import java.awt.ActionListner;
// import java.awt.Button.ActionListener;
import java.awt.ActiveEvent;
// import java.awt.ac;
import java.awt.event.*;

public class GroupBoxExample1 extends Frame {
    Checkbox c1 ;
    Checkbox c2;
    Button ok;
    Label msg ;
    public static void main(String[] args) {
        GroupBoxExample1 cb = new GroupBoxExample1();
        cb.addWindowListener(new myWindowListener());

    }

    private void init() {
      c1 = new Checkbox();
      c2 = new Checkbox();
      ok= new Button("Ok");
      msg = new Label();
    //   Object ok;
   ok.addActionListener(new ActionListner() {
    public void ActionPerformed(ActionEvent ev){
        System.out.println(" Button Clicked");
    }
   });
   
        
    }

    GroupBoxExample1() {
        setVisible(true);
        setSize(500, 650);
        setBackground(new Color(32, 223, 223));
    }
}
