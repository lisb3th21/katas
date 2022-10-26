package graficos;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;



public class MiVentana {
    public MiVentana(String titulo) {
        titulo= "GridBagLayout";
       JFrame frame = new JFrame(titulo);
       
       
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
   
       Container containerPane = frame.getContentPane();
    
       
    
       
       //cons.fill = GridBagConstraints.BOTH;
      
       
       Viewer v = new Viewer();
      
       frame.add(v);
       frame.setPreferredSize(new Dimension(v.getDimensionX(), v.getDimensionY()));
       frame.pack();
       frame.setVisible(true);
       v.paintBackground();

}

public static void main(String[] args) {
    MiVentana v= new MiVentana("fff");
}}
