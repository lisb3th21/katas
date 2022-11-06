package prueba;

import java.awt.GridBagLayout;
import java.awt.Container;
import java.awt.GridBagConstraints;
import javax.swing.JFrame;
import javax.swing.JFrame;

public class MyWindow extends JFrame {

    public MyWindow () {
        createMiVentana();
    }
    public void createMiVentana(){
        this.setSize(800,800);
        this.setTitle("Marco Canvas");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        OtherViewer viewer = new OtherViewer();
        add(viewer);

        this.setVisible(true);
        viewer.paintBackground();
        Thread t = new Thread(viewer);
        t.start();

    }

    public static void main(String[] args) {
        MyWindow v = new MyWindow();
    }
}