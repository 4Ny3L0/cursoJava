package Practicas.BuscarAuto;

public class Auto {
    private String patente, color;
    private int kmOverRoad;

    public Auto(String patente, String color, int kmOverRoad){
        this.patente = patente;
        this.color = color;
        this.kmOverRoad = kmOverRoad;

    }

    public int getKms(){
        return this.kmOverRoad;
    }

    public String getPatente(){
        return this.patente;
    }
    @Override
    public String toString(){
        return "Auto{" + " patente: " + this.patente + ", color: "+ this.color + ", kilometros_recorridos: "+ this.kmOverRoad + "}";
    }
}
