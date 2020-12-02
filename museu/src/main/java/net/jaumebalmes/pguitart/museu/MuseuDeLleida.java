/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.jaumebalmes.pguitart.museu;

import java.util.Arrays;

/**
 *
 * @author pguitart
 */
public class MuseuDeLleida {
    public static void main(String[] args) {
        
        Escultura s1 = new Escultura(0, "esc");
        Escultura s2 = s1;
        Escultura s3 = new Escultura(0, "esc");        
        
        
        
        
        
        
        Obra[] obra = new Obra[3];
        
        obra[0] = new Escultura(223, "David", "Miquel Angelo");
        obra[1] = new Quadre(10, 20, "Joan Miró");
        obra[2] = new Quadre(14, 32, "Guernica", "Pere");
        
        for(Obra o: obra){
            System.out.println(o);
        }
        
        System.out.println("N obres " + Obra.getnObres());
        
        System.out.println("Ordenen decreixent codi");
        Arrays.sort(obra);
        for(Obra o: obra){
            System.out.println(o);
        }    
        
        
        
        
    }
    
    
}
