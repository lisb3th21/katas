package graficos;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MiVentana extends JFrame {
    public MiVentana(String titulo) {
        //titulo= "GridBagLayout";
       //JFrame frame = new JFrame(titulo);
       
       

   
       Container containerPane = this.getContentPane();
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       GridBagLayout gridbag = new GridBagLayout();
       GridBagConstraints cons = new GridBagConstraints();
       containerPane.setLayout(gridbag);

      for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                cons.gridx=i;
                cons.gridy = j;
                cons.fill = GridBagConstraints.VERTICAL;
                String text = i+ " -- "+j;
                containerPane.add(new JButton());

            }
        }
      
       
       Viewer v = new Viewer();
      /* 
       this.add(v);
       this.setPreferredSize(new Dimension(v.getDimensionX(), v.getDimensionY()));
       */
       this.pack();
       this.setVisible(true);
       v.paintBackground();



}

public static void main(String[] args) {
    MiVentana v= new MiVentana("Imagen");
}
}
