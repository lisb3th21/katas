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
        gg.drawImage(this.image,0,0,null);
    }
   
    @Override
    public void paint(Graphics g){
        this.paintBackground();
    }

    @Override
    public void run() {
        
    }


    public int getDimensionY(){
        return  this.image.getHeight();
    }
    public int getDimensionX(){
        return  this.image.getWidth();
    }
}
