package graficos;

import java.awt.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Viewer  extends Canvas implements Runnable{
    private BufferedImage image;
    BufferedImage resizeImage(BufferedImage image, int targetWidth, int targetHeight) throws IOException {
        BufferedImage resizedImage = new BufferedImage(targetWidth, targetHeight, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics2D = resizedImage.createGraphics();
        graphics2D.drawImage(image, 0, 0, targetWidth, targetHeight, null);
        graphics2D.dispose();
        return resizedImage;
    }
    public Viewer() {
        try {
            
            this.image = ImageIO.read(new File("el-gato-con-botas.jpg"));
            this.image = resizeImage(image, 300, 200);
            Graphics2D g2d = image.createGraphics();
    g2d.drawImage(image, 0, 0, null);
    g2d.dispose();

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
      }

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
