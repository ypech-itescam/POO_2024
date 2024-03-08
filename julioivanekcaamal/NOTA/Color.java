package julioivanekcaamal.NOTA;
/**
 * Color
 */
import java.util.Scanner;


public class Color {

    private String nombre;
    private String ansi;

    public Color(String nombre, String ansi){
        setColor(nombre);
        setColorAnsi(ansi);
    }

    public String getColor(){
        return nombre;
    }
    public void setColor(String nombre){
        this.nombre = nombre.equals(" ")? "Blanco" : nombre;
    }
    public String getColorAnsi(){
        return ansi;
    }
    public void setColorAnsi(String ansi){
        this.ansi = ansi.equals(" ")? " ":ansi;
    }
    public void colores(){
        switch (nombre) {
            case String rojo:
                "\ e [0; 31m"
                break;
            default:
                break;
        }
    }


}


//color = nombre == ansi 
//Color 