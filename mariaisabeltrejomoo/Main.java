public class Main {
    public static void main(String[] args) {
        Computadora c=new Computadora("LENOVO", "verde", "ARM23", 34, "Windows");
        c.encender();
        System.out.println(c.toString());
        c.reiniciar();
        c.apagar();
    }
    
}
