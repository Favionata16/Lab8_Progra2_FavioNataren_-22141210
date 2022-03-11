/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_FavioNataren_22141210;

import javax.swing.JProgressBar;

/**
 *
 * @author favio
 */
public class hilo extends Thread {

    private JProgressBar barra;
    private boolean avanzar;
    private boolean vive;
    Object ob;

    public hilo(JProgressBar barra, Object ob) {
        this.barra = barra;
        avanzar = true;
        vive = true;
    }

    public boolean getVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public boolean getAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    @Override
    public void run() {
        while (vive) {
            if (avanzar) {
                barra.setValue(barra.getValue() + 1);
                if (barra.getValue() == 10) {
                    vive = false;
                }
            }

            try {
                Thread.sleep(0);
            } catch (InterruptedException ex) {
            }
        }
    }

}
