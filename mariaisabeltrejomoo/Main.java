package mariaisabeltrejomoo;

public class Main {
    public static void main(String[] args) {
        Perro miPerro= new Perro(" ", 0, 0, " ", " ");
        System.out.println("Nombre: "+miPerro.getNombreI());
        System.out.println("Edad: "+ miPerro.getEdadI()+" meses");
        System.out.println("Peso: "+ miPerro.getPesoI()+ " kg");
        System.out.println("Raza: "+miPerro.getRazaI());
        miPerro.comer("Croquetas");

        Computadora c = new Computadora(" ", " ", " ", 0, " ");
        c.encender();
        System.out.println("Marca: " + c.getMarca());
        System.out.println("Color: " + c.getColor());
        System.out.println("Modelo: " + c.getModelo());
        System.out.println("Memoria RAM: " + c.getMemoriaRAM() + "gb");
        System.out.println("Tipo de sistema: " + c.getTipoSistema());
        c.apagar();
        
    }
}