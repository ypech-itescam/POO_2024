public class Main {
    public Computadora c;

    public static void main(String[] args) {
        Computadora c=new Computadora("LENOVO", "verde", "ARM23", 34, "Windows");
        c.encender();
        c.info();
        c.reiniciar();
        c.apagar();
    }
    
}
