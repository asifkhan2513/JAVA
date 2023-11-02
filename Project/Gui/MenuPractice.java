import java.awt.Frame;
import java.awt.MenuBar;
import java.awt.Menu;
import java.awt.*;
import java.awt.Color;
import java.awt.Font;

public class MenuPractice {

    MenuPractice(){
        Frame   f = new Frame("Asif khan");
        Font ff= new Font("Libre Baskerville", Font.BOLD, 15);
        MenuBar mb= new MenuBar();
        Menu m = new Menu("Menu");

        f.setVisible(true);
        f.setSize(900, 650);
        f.setFont(ff);

        Menu submenu=new Menu("Sub Menu");  
        MenuItem i1=new MenuItem("Item 1");  
        MenuItem i2=new MenuItem("Item 2");  
        MenuItem i3=new MenuItem("Item 3");  
        MenuItem i4=new MenuItem("Item 4");  
        MenuItem i5=new MenuItem("Item 5");  

        // m.setBackground(Color.BLACK);
        // m.setfore

        m.add(i1);
        m.add(i2);
        m.add(i3);
        m.add(submenu);
        submenu.add(i4);
        submenu.add(i5);
        m.add(submenu);
        mb.add(m);
        f.setMenuBar(mb);
        // f.setBackground(Color.PINK);



 }

    public static void main(String[] args) {
        new MenuPractice();
    }
}
