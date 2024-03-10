package mariaisabeltrejomoo;

public class Main {
    public static void main(String[] args) {
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