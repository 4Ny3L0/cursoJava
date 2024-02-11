package Practicas;

public class Estudiante {
    public String name;
    private String lastname;
    private String carrer;

    public Estudiante(String name , String lastname , String carrer){
        this.name = name;
        this.lastname = lastname;
        this.carrer = carrer;
    }
    public String getStudenName(){
        return this.name;
    }
    public String getStudenCompleteName(){
        return this.name + " " + this.lastname;
    }
}
