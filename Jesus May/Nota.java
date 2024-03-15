public class Nota {
    private String importancia;
    private String fecha;
    private String texto;
    private String fechaLimite;
    private String nombre;
    private String colorHex;

    public Nota(String importancia, String fecha, String texto, String fechaLimite, String nombre, String color) {
        setImportancia(importancia);
        setFecha(fecha);
        setTexto(texto);
        setFechaLimite(fechaLimite);
        setNombre(nombre);
        setColor(color);
    }

    public String getImportancia() {
        return importancia;
    }

    public void setImportancia(String importancia) {
        this.importancia = importancia.trim().isEmpty() ? "urgente" : importancia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha.trim().isEmpty() ? "19 de febrero" : fecha;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto.trim().isEmpty() ? "Realiza la practica" : texto;
    }

    public String getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(String fechaLimite) {
        this.fechaLimite = fechaLimite.trim().isEmpty() ? "1 de febrero" : fechaLimite;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.trim().isEmpty() ? "Yaqui" : nombre;
    }

    public String getColorHex() {
        return colorHex;
    }

    public void setColor(String color) {
        switch (color.toLowerCase()) {
            case "negro":
                this.colorHex = "\033[30m";
                break;
            case "rojo":
                this.colorHex = "\033[31m";
                break;
            case "verde":
                this.colorHex = "\033[32m";
                break;
            case "amarillo":
                this.colorHex = "\033[33m";
                break;
            case "azul":
                this.colorHex = "\033[34m";
                break;
            default:
                this.colorHex = "\033[37m";
        }
    }

    public String show() {
        return (
            getColorHex() + "Importancia: " + getImportancia() + "\n" +
            "Fecha: " + getFecha() + "\n" +
            "Texto: " + getTexto() + "\n" +
            "Fecha Límite: " + getFechaLimite() + "\n" +
            "Nombre: " + getNombre() + "\n" +
            "\u001B[0m"
        );
    }

    public static void main(String[] args) {
       
        System.out.print("Importancia: ");
       
        System.out.print("Fecha: ");

        System.out.print("Texto: ");
        
        System.out.print("Fecha Límite: ");

        System.out.print("Nombre: ");
       
        System.out.print("Color (negro, rojo, verde, amarillo, azul, por defecto): ");
       
        Nota nota = new Nota ("importancia", "fecha", "texto", "fechaLimite", "nombre","color");
        System.out.println(Nota());

        
    }
}