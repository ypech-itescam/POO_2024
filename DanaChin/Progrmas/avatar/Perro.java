package DanaChin.Progrmas.Animal;

public class Perro {
    private String nombre;
    private String raza;
    private double edad;
    private double altura;
    private double peso;
    private int estado;

    public Perro(String nombre) {
        setNombre(nombre);
        this.estado = 1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.equals("") ? "Chucho" : nombre;
    }

    public int getEstado() {
        return estado;
    }

    private void changeEstado(int valor) {
        this.estado = this.estado > 0 ? valor : 0;
    }

    public void ladrar() {
        if (getEstado() > 0) {
            System.out.println("Guau, guau, guau, guau, guau");
        } else {
            System.out.println("Estoy con diosito");
        }
    }

    public void oir(int instruccion) {
        if (instruccion == 0) {
            ladrar();
        } else if (instruccion == 1) {
            morder();
        } else if (instruccion == 2) {
            saltar();
            comer("panucho");
        }
    }

    public void morder() {
        System.out.println("usdhuisdaoj hsidhsihdao ishcojsoda");
    }

    public void saltar() {
        System.out.println("Estoy saltando");
    }

    public void comer(String comida) {
        System.out.println("Que rico " + comida);
    }

    public void morir() {
        System.out.println("Adios mundo cruel");
        changeEstado(0);
    }
}