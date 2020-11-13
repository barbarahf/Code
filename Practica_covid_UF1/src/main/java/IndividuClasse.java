///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package net.jaumebalmes.pguitart.practicapuntdepartida.figures;
//
//import java.awt.Color;
//import java.awt.Point;
//import net.jaumebalmes.pguitart.practicapuntdepartida.utils.Utils;
//import processing.core.PApplet;
//
///**
// *
// * @author pereg
// */
//public class IndividuClasse extends Circle {
//    private int vX = 10 * Utils.atzarSigne();
//    private int vY = 10;
//
//    public IndividuClasse(int radi, Point point, Color color) {
//        super(radi, point, color);
//    }
//
//    private boolean xoquen(IndividuClasse altre){
//        return false;
//        //        sumaRadis >= distancia entre centres;
//    }
//
//    public void controlXocs(IndividuClasse altre){
//        if (xoquen(altre)){
////            si intercanviant velocitats s'allunyen
////              l'individu 1 agafa la trajectoria del 2
////              i el 2 de l'1. (intercvanvi velocitats)
//
//        }
//
//
//    }
//
//
//
//    public void mou(PApplet pApplet){
//        int x = getPoint().x;
//        int y = getPoint().y;
//
//        x += vX;
//        y += vY;
//
//        if (x  <= getRadi()){
//            //la velocitat ha de ser positiva per separar-se del x=0
//            if (vX < 0) { vX = -vX; }
//            //vX = -vX;
//                    //Math.abs(vX);
//        } else if (x >= pApplet.width){
//            vX = -vX;
//            //if (vX > 0) vX = -vX;
//        }
//
//        setPoint(new Point(x, y));
//
//    }
//
//
//
//    public static void main(String[] args) {
//        IndividuClasse ind;
//
//
//    }
//
//}
