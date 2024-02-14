package ACT9;

import java.util.ArrayList;

/**
 *
 * @author Pau
 */
public class ConcessionariAuto implements Concessionari{
    private ArrayList<Automobil> automobils;
    private ArrayList<Camio> camions;
    //constructor

    public ConcessionariAuto(ArrayList<Automobil> automobils, ArrayList<Camio> camions) {
        this.automobils = automobils;
        this.camions = camions;
    }
       
    @Override
    public double calculaIngressos() {
        double ingressos = 0;
        for (Automobil a : automobils) {
            ingressos += a.getPreu() + a.calculaImpost();
        }
        for (Camio c : camions) {
            ingressos += c.getPreu() + c.calculaImpost();
        }
        return ingressos;
    }
        
    @Override
    public String toString(){
        return ("Ingressos del concessionari d'autos són: " + calculaIngressos() + " euros.");
    }
}
