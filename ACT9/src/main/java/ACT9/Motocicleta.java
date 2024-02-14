package ACT9;

/**
 *
 * @author Pau
 */
public class Motocicleta extends Vehicle {
    private int ciclindrada;
    private String tipus;
    
    //constructor
    public Motocicleta(int ciclindrada, String tipus, String marca, String model, double preu) {
        super(marca, model, preu);
        this.ciclindrada = ciclindrada;
        this.tipus = tipus;
    }
    
    //mètode
    @Override
    public double calculaImpost(){
        double impost;
        impost = this.preu * 0.05;
        return impost;
    }    

   @ Override
    public String toString(){
        return (super.toString() + "Cilindrada: " + this.ciclindrada + ". " + "Tipus: " + this.tipus + ". ");
    }
    
    //getter and setter
    public int getCiclindrada() {
        return ciclindrada;
    }

    public void setCiclindrada(int ciclindrada) {
        this.ciclindrada = ciclindrada;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }
}
