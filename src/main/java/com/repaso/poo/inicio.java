package com.repaso.poo;

public class inicio {
    public static void main(String[] args) {
        //creo una insatacia de la clase zapatp
        Zapato miZapato=new Zapato();
        miZapato.setTalla(34);
        miZapato.setColor("gris");
        miZapato.setMarca("arturo calle");

        Zapato miZapatoDos=new Zapato();
        miZapatoDos.setTalla(36);
        miZapatoDos.setColor("negro");
        miZapatoDos.setMarca("aquiles");

        Estudiante nuevoEstudiante=new Estudiante("pepito","perez");

        System.out.println(miZapato.getMarca());
        System.out.println(miZapatoDos.getMarca());

    }
}
