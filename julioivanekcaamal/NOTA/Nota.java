package julioivanekcaamal.NOTA;
/**
 * Notas
 */
public class Nota {
    private String fecha;
    private String autor;
    private String fechaLimite;
    private String tipoNota;
    private String texto;
    

    public Nota (String fecha, String autor, String fechaLimite, String tipoNota, String texto){
        setFecha(fecha);
        setAutor(autor);
        setFechaLimite(fechaLimite);
        setTipoNota(tipoNota);
        setTexto(texto);
    }
    public String getFecha(){
        return fecha;
    }
    public void setFecha(String fecha){
        this.fecha = fecha
        .equals(" ")? "00/00/00" : fecha;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor.equals(" ")? "julio" : autor;

    }
    public String getFechaLimite(){
        return fechaLimite;
    }
    public void setFechaLimite(String fechaLImite){
        this.fechaLimite = fechaLimite.equals(" ")? "sin fecha limite": fechaLimite;
    }
    public String getTipoNota(){
        return tipoNota;
    }
    public void setTipoNota(String tipoNota){
        this.tipoNota = tipoNota.equals(" ")? "normal---" : tipoNota;
    }
    public String getTexto(){
        return texto;
    }
    public void setTexto(String texto){
        this.texto = texto.equals("")? "vacioooo...." : texto; 
    }

    public void cambiarColorNota(){    
    }
    public void mostrarNota(){
    }
    public static void main(String[] args) {
        Nota n = new Nota(" ", " ", " ", " ", " ");
        System.out.println(n.getAutor());
    }

}