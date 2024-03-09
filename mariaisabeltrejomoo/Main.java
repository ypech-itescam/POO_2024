public class Main {
    public static void main(String[] args) {
        Computadora c=new Computadora("Lenovo", "verde", "ARM", 34, "Windows");
        System.out.print(c.toString());
        c.encender();
        c.reiniciar();
        c.apagar();
    }
    
}
