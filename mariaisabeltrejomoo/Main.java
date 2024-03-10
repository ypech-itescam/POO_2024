package mariaisabeltrejomoo;

public class Main {
    public static void main(String[] args) {
        computadora.encender();
        System.out.println("Marca: " + computadora.getMarca());
        System.out.println("Color: " + computadora.getColor());
        System.out.println("Modelo: " + computadora.getModelo());
        System.out.println("Memoria RAM: " + computadora.getMemoriaRAM() + "gb");
        System.out.println("Tipo de sistema: " + computadora.getTipoSistema());
        computadora.apagar();

    }
}