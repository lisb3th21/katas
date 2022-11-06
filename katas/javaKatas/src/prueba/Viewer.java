package prueba;

import java.awt.Canvas;
import java.awt.image.BufferedImage;
import java.awt.Graphics;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Viewer extends Canvas implements Runnable {

    private int posicionX = 0;
    private int posicionY = 0;

    private BufferedImage fondo;
    private BufferedImage item;

    private static final String PATHFONDO =
            "katas\\javaKatas\\clouds.jpg";
    private static final String PATHITEM =
            "katas\\javaKatas\\descarga.jpeg";

    public Viewer() {

        // Cargar una imagen del disco
        try {

            this.fondo = ImageIO.read(new File(PATHFONDO));
            this.item = ImageIO.read(new File(PATHITEM));

        } catch (IOException e) {
            System.out.println("Img Error");
        }


    }

    public void paintBackground(Graphics graphics) {

        if (graphics == null) {
            System.out.println("No hay manejador de gráficos");
            return;
        }

        graphics.drawImage(this.fondo, 0, 0, null);
        graphics.drawImage(this.item, this.posicionX, this.posicionY, null);

    }



    @Override
    public void paint(Graphics graphics) {}

    @Override
    public void run() {

        while (true) {

            this.paintBackground(getGraphics());

            this.posicionX += 1;
            this.posicionY += 1;

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}