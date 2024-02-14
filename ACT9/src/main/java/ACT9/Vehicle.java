package ACT9;

/**
 *
 * @author Pau
 */
abstract class Vehicle {
    protected String marca;
    protected String model;
    protected double preu;

    
    //constructor
    public Vehicle(String marca, String model, double preu) {
        this.marca = marca;
        this.model = model;
        this.preu = preu;
    }
    
    //mètode
    abstract double calculaImpost();
    
    @Override
    public String toString(){
        return ("Marca: " + this.marca + ". " + "Model: " + this.model+ ". " + "Preu: " + this.preu + ". ");
    }
    
    //getter and setter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }
}
