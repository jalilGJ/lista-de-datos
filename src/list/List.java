/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class List {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.List<String> nombres_Isic3;
        nombres_Isic3 = new ArrayList<>();
        nombres_Isic3.add("Josefino");
        nombres_Isic3.add("Yolanda");
        nombres_Isic3.add("Bernardo");
        nombres_Isic3.add("Noemi");
        nombres_Isic3.add("Jalil");
        System.out.println("Alumnos de la carrera en ingenieria en sistemas computacionales 3A. ");
        System.out.println("Alumnos: " + nombres_Isic3.size());
        System.out.println(nombres_Isic3);
        nombres_Isic3.remove(3);
        System.out.println("Alumnos de ingreso 2019:");
        System.out.println(nombres_Isic3);
        System.out.println("El alumno Bernardo se encuentra en la lista de alumnos de 3A:");
        System.out.println(nombres_Isic3.contains("Bernardo"));
        System.out.println("Alumnos en curso en linea:");
        nombres_Isic3.add("Noemi");
        System.out.println(nombres_Isic3);
        System.out.println("Alumno en integrarse al ultimo:");
        String ultimo = nombres_Isic3.get(nombres_Isic3.size() - 1);
        System.out.println(ultimo);

    }

}
