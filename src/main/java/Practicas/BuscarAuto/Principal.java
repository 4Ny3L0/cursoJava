package Practicas.BuscarAuto;

public class Principal {
    public static void main(String[] args) {
        Concesionaria concesionaria = new Concesionaria("Yellow cars");

        concesionaria.addAuto(new Auto("ABCD1234", "Rojo", 10000));
        concesionaria.addAuto(new Auto("EFGH1234", "Azul", 10300));
        concesionaria.addAuto(new Auto("ABCD2345", "Amarillo", 1000));
        concesionaria.addAuto(new Auto("IJKL1234", "Rojo", 23123));
        concesionaria.addAuto(new Auto("OPQR6789", "Negro", 3212));
        concesionaria.addAuto(new Auto("UVWX1234", "Cafe", 50000));
        concesionaria.addAuto(new Auto("ABCD9876", "Verde", 90000));

        String patterSearch = "ABCD9876";
        Auto searchResult = concesionaria.searchCar(patterSearch);
        if (searchResult == null) {
            System.out.println("No se encontraron resultados para " + patterSearch);
        } else {
            System.out.println("Estos son los datos de tu busqueda: " + searchResult);
        }
    }
}
