/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_FavioNataren_22141210;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author favio
 */
public class bina {
    ArrayList<Carros> car=new ArrayList();
    File archivo = null;

    public bina(String path) {
        archivo = new File(path);
    }

    public ArrayList<Carros> getcar() {
        return car;
    }

    public void setcar(Carros carro) {
        this.car.add(carro);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    
    
    
    public void cargarArchivo() {
        try {            
            Carros carro;
            car = new ArrayList();
            if (archivo.exists()) {
                FileInputStream en= new FileInputStream(archivo);
                ObjectInputStream ob = new ObjectInputStream(en);
                try {
                    while ((carro = (Carros) ob.readObject()) != null) {
                        car.add(carro);
                    }
                } catch (EOFException e) {
                }
                ob.close();
                en.close();
            }            
        } catch (Exception ex) {
            
        }
    }

    
    public void escribirArchivo() {
        
        try {
            FileOutputStream fw = new FileOutputStream(archivo);
            ObjectOutputStream bw = new ObjectOutputStream(fw);
            System.out.println(car.size()+" hola");
            System.out.println(archivo.getPath());
            for (Carros t : car) {
                bw.writeObject(t);
            }
            bw.flush();
            bw.close();
            fw.close();
        } catch (Exception ex) {
        } 
    }
    
    public void escribirArchivo2() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Carros t : car) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
