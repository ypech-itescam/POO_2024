package julioivanekcaamal.MAIN;

import julioivanekcaamal.ANIMAL.*;
import julioivanekcaamal.AVATAR.*;
import julioivanekcaamal.HOLAMUNDO.*;
import julioivanekcaamal.NOTA.*;
import julioivanekcaamal.OBJETO.*;
import julioivanekcaamal.PERRO1.*;
import julioivanekcaamal.TERMOMETRO_DIGITAL.*;
/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Nota n = new Nota("ninguna ", "julio ", "ninguna ", "normal", "alas 6 tengo basket");
        System.out.println(n.getAutor());
    }
}
