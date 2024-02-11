package Practicas.BuscarAuto;

import java.util.ArrayList;
import Practicas.BuscarAuto.Auto;

public class Concesionaria {
    private String name;
    private ArrayList<Auto> autos;
    public Concesionaria(String name){
        this.name = name;
        this.autos = new ArrayList<>();
    }
    public void addAuto(Auto auto){
        this.autos.add(auto);
    }

    public int autosSize(){
        return this.autos.size();
    }
    public Auto searchCar(String patenteSearch){
        //System.out.println(this.autos.size());
        Auto carFinding = null;
        int i = 0;
        while (i < this.autos.size() && !autos.get(i).getPatente().equalsIgnoreCase(patenteSearch)){
            i++;
        }
        if(i < autosSize()){
            System.out.println("Aqui");
            carFinding = this.autos.get(i);
        }

        return carFinding;
    }
}
