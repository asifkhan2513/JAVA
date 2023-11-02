import java.awt.Graphics;

import javax.swing.JFrame;
public final class FirstFrameCreator {
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame(" First Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,200);
        frame.setVisible(true);
    }
}


