package ACT9;

/**
 *
 * @author Pau
 */
public class Camio extends Vehicle {

    private double capacitatCarrega;
    
    //constructor
    public Camio(String marca, String model, double preu, double capacitatCarrega) {
        super(marca, model, preu);
        this.capacitatCarrega = capacitatCarrega;
    }
    
    //mètode
    @Override
    public double calculaImpost(){
        double impost;
        impost = preu*0.15;
        return impost;
    }
    
    @Override
    public String toString(){
        return super.toString() + "Capacitat de cárrega: " + this.capacitatCarrega + ". ";
    }
    
    //getter and setter
    public double getCapacitatCarrega() {
        return capacitatCarrega;
    }

    public void setCapacitatCarrega(double capacitatCarrega) {
        this.capacitatCarrega = capacitatCarrega;
    }
}
