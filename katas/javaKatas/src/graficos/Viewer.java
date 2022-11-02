package graficos;

import java.awt.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Viewer  extends Canvas implements Runnable{
    private BufferedImage image;

    public Viewer() {
        try {
            this.image = ImageIO.read(new File("el-gato-con-botas.jpg"));
        } catch (IOException ex) {
           
           ex.printStackTrace();
            //Logger.getLogger(Viewer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    public void paintBackground(){
        Graphics gg = this.getGraphics();
        if(gg==null){
            System.out.println("No manejador de graficos");
            return;
        }
        gg.drawImage(this.image,1,1,null);
        
    }
   
    @Override
    public void paint(Graphics g){
        this.paintBackground();
    g.setClip(ALLBITS, ABORT, 300, 300);    }

    @Override
    public void run() {
        
    }


    public int getDimensionY(){
        return  300;
    }
    public int getDimensionX(){
        return  300;
    }
}
