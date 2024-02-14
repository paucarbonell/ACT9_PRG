package ACT9;

import java.util.ArrayList;

/**
 *
 * @author Pau
 */
public class Main {
    
    public static void main(String[] args) {
        
        ArrayList<Vehicle> vehiculos = new ArrayList<Vehicle>();
        
        Automobil chevrolet = new Automobil (2,300,"Chevrolet","Corvette",150000);
        vehiculos.add(chevrolet);
        Automobil ferrari = new Automobil (2,150,"Ferrari","F355",150000);       
        vehiculos.add(ferrari);
        Camio renault = new Camio("Renault","Bombastic",40000,2000);
        vehiculos.add(renault);
        Motocicleta honda = new Motocicleta (300,"Carreras","Honda","Ratatata",340000);
        vehiculos.add(honda);
        Motocicleta yamaha = new Motocicleta (350,"Carretera","Yamaha","Mitsubishi", 35000);
        vehiculos.add(yamaha);
        
        ArrayList<Motocicleta> motos = new ArrayList<Motocicleta>();
        ArrayList<Automobil> automobils = new ArrayList<Automobil>();
        ArrayList<Camio> camions = new ArrayList<Camio>();
        
        ConcessionariAuto concessionariA = new ConcessionariAuto(automobils,camions);
        ConcessionariMoto concessionariM = new ConcessionariMoto(motos);
        
        for (Vehicle v : vehiculos) {
            if (v instanceof Motocicleta) {
                motos.add((Motocicleta) v);
            } else if (v instanceof Automobil) {
                automobils.add((Automobil) v);
            } else if (v instanceof Camio) {
                camions.add((Camio) v);
            }
        }
        
        //informació concessionariAutos
        System.out.println("ConcessionariAutos {" + ("\n")
                + ("\t") + camions.toString() + ("\n")
                + ("\t") + automobils.toString() + "}");
        
        //información concessionariMotos
        System.out.println("ConcessionariMotos {" + ("\n")
                + motos.toString() + ("\n"));
        
        //ingressos concessionari automobils
        System.out.println(concessionariA.toString());
        
        //ingressos concessionari motos
        System.out.println(concessionariM.toString());
    }
    
}
