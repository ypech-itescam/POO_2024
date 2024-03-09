public class Main {
    public static void main(String[] args) {
        Computadora c=new Computadora("LENOVO", "verde", "ARM23", 34, "Windows");
        c.encender();
        System.out.println("Marca: "+c.getMarca());
        System.out.println("Color: " + c.getColor());
        System.out.println("Modelo: " + c.getModelo());
        System.out.println("Memoria RAM: " + c.getMemoriaRAM() + "GB");
        System.out.println("Tipo de Sistema: " + c.getTipoSistema());
        c.reiniciar();
        c.apagar();
    }
    
}
