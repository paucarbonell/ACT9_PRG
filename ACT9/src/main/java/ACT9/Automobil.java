package ACT9;

import java.util.ArrayList;

/**
 *
 * @author Pau
 */
public class Automobil extends Vehicle{
    private int numPortes;
    private double capacitatMaleter;

    //constructor
    public Automobil(int numPortes, double capacitatMaleter, String marca, String model, double preu) {
        super(marca, model, preu);
        this.numPortes = numPortes;
        this.capacitatMaleter = capacitatMaleter;
    }
    
    //mètode
    @Override
    public double calculaImpost(){
        double impost;
        impost = this.preu * 0.1;
        return impost;
    }
    
    @ Override
    public String toString(){
        return (super.toString() + "Número de portes: " + this.numPortes + ". " + "Capacitat de maleter: " + this.capacitatMaleter + ". " + ("\n"));
    }
    
    
    
    //getter and setter
    public int getNumPortes() {
        return numPortes;
    }

    public void setNumPortes(int numPortes) {
        this.numPortes = numPortes;
    }

    public double getCapacitatMaleter() {
        return capacitatMaleter;
    }

    public void setCapacitatMaleter(double capacitatMaleter) {
        this.capacitatMaleter = capacitatMaleter;
    }
}
