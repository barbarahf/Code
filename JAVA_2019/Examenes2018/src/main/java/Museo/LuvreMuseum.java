package Museo;

import processing.core.PApplet;
import processing.core.PImage;

import java.io.File;
import java.util.ArrayList;

public class LuvreMuseum extends PApplet implements VisitanteInterface {
    public static ArrayList<Obra> obras = new ArrayList<Obra>();
    PImage img;
    PImage bgroundImg;

    public  void puntoAleatorios() {
        if (this.width > 0) {

        }

    }

    @Override
    public void settings() {
        setSize(1000, 500);

    }

    @Override
    public void setup() {
        //LuvreMuseum.obras.get(0).getImage()

        bgroundImg = loadImage("/home/barbara/Documentos/Dev/Java/Examenes2018/src/main/data/luvrewallpaper.jpg");
        bgroundImg.resize(1000, 500);
        //  mona = loadImage("/home/barbara/Documentos/Dev/Java/Examenes2018/src/main/data/monalisa.jpg");


    }


    @Override
    public void draw() {
        background(bgroundImg);
        for (int i = 0; i < obras.size(); i++) {
            img = loadImage(obras.get(i).getImage());
            img.resize(100, 160);
            image(img, 0, 0);
//            textSize(12);
//            text(obras.get(i).getAutor(), 10, 30);
//            fill(0, 102, 153);
        }

    }

    @Override
    public void acceptarVistante() {

    }

    @Override
    public void venderEntradas() {

    }

    public static void main(String... args) {
        Obra monalisa = new Cuadro("La Gioconda", "Leonardo da Vinci", 77, 53, new File("/home/barbara/Documentos/Dev/Java/Examenes2018/src/main/data/monalisa.jpg"));
        Obra victoriaalada = new Escultura("Victoria de Samotracia", new File("/home/barbara/Documentos/Dev/Java/Examenes2018/src/main/data/victoriaalada.png"), 50);
        obras.add(monalisa);
        obras.add(victoriaalada);
        System.out.println(monalisa.toString());
        System.out.println(victoriaalada.toString());
        LuvreMuseum pt = new LuvreMuseum();
        PApplet.runSketch(new String[]{"ProcessingTest"}, pt);
    }


}
