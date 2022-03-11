/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_FavioNatarenl_22141210;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author favio
 */
public class hilo_2 extends Thread{
    private boolean avanzar;
    private boolean vive;
    ArrayList <Carros> car=new ArrayList();
    Random r;
    
    @Override
    public void run(){
        while(vive){
            if(avanzar){
                //barra.setValue(barra.getValue()+1);
               // if(barra.getValue()==100000){
                    vive=false;
               // }                
            } //FIN IF
            
            try {
                Thread.sleep(0);
            } catch (InterruptedException ex) {
            }
        }
    }
}
