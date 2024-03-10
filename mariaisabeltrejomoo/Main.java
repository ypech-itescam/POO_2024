package mariaisabeltrejomoo;
import Perr
public class Main {
    public static void main(String[] args) {
        Perro p=new Perro()
        System.out.println(p.getNombre());
        Computadora computadora = new Computadora(" ", " ", " ", 0, " ");
        computadora.encender();
        System.out.println("Marca: " + computadora.getMarca());
        System.out.println("Color: " + computadora.getColor());
        System.out.println("Modelo: " + computadora.getModelo());
        System.out.println("Memoria RAM: " + computadora.getMemoriaRAM() + "gb");
        System.out.println("Tipo de sistema: " + computadora.getTipoSistema());
        computadora.apagar();

    }
}