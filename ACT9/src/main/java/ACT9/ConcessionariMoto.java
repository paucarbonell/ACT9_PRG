package ACT9;

import java.util.ArrayList;

/**
 *
 * @author Pau
 */
public class ConcessionariMoto implements Concessionari{
    private ArrayList<Motocicleta> motos;

    //constructor
    
    public ConcessionariMoto(ArrayList<Motocicleta> motos) {
        this.motos = motos;
    }

    @Override
    public double calculaIngressos() {
        double ingressos = 0;
        for (Motocicleta m : motos) {
            ingressos += m.getPreu() + m.calculaImpost();
        }
        return ingressos;
    }
    
    @Override
    public String toString(){
        return ("Ingressos del concessionari de motos són: " + calculaIngressos() + " euros." + ("\n"));
    }
}
