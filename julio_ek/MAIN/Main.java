package julio_ek.MAIN;

import julio_ek.ANIMAL.*;
import julio_ek.AVATAR.*;
import julio_ek.HOLAMUNDO.*;
import julio_ek.NOTA.*;
import julio_ek.OBJETO.*;
import julio_ek.PERRO1.*;
import julio_ek.TERMOMETRO_DIGITAL.*;
/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Nota n = new Nota("ninguna ", "julio ", "ninguna ", "normal", "alas 6 tengo basket");
        System.out.println(n.getAutor());
    }
}
