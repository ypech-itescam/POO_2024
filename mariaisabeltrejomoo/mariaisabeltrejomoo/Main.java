package mariaisabeltrejomoo;
public class Main {
    public static void main(String[] args) {
        Perr
        Computadora c = new Computadora("LENOVO", "Magenta", "rahcj", 34, "LINUX");
        System.out.println(c.getMarca());
        System.out.println(c.getColor());
        System.out.println(c.getModelo());
        System.out.println(c.getMemoriaRAM());
        System.out.println(c.getTipoSistema());
        c.encender();
        c.apagar();
    }
}
