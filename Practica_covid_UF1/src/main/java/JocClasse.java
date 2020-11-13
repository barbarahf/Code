///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package net.jaumebalmes.pguitart.practicapuntdepartida.jocs;
//
//import java.awt.Color;
//import java.awt.Point;
//
//
///**
// *
// * @author pereg
// */
//public class JocClasse extends JocProcessing {
//
//
//    IndividuClasse individu;
//    IndividuClasse individu2;
//
//    IndividuClasse[] indi = new IndividuClasse[200];
//
//    @Override
//    public void prepararJoc() {
//        setSize(600, 400);
//    }
//
//    @Override
//    public void iniciarJoc() {
//        background(0);
//        individu = new IndividuClasse(50, new Point(100, 100), Color.yellow);
//        individu2 = new IndividuClasse(50, new Point(170, 150), Color.red);
//
//        individu.dibuixa(this);
//        individu2.dibuixa(this);
//    }
//
//    @Override
//    public void jugada() {
//        noLoop();
////        background(0);
////        individu.mou(this);
////        individu.dibuixa(this);
//    }
//
//    @Override
//    public boolean esFinal() {
//        return false;
//    }
//
//    @Override
//    public void finalJoc() {
//
//    }
//
//}
