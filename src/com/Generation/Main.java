package com.Generation;


import com.Generation.Banco.CuentaBancaria;
import com.Generation.Paquete2.Animal;

public class Main {

    public static int numerador = 10;
    public static int denominador = 0;
    public static float division;

    public static void main(String[] args) {

        try {
            division = numerador / denominador;
        } catch (NullPointerException ex) {
            System.out.println("Nullpointer");
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Exception)";
            System.out.println(ex.getMessage());
        } finally {
        System.out.println("Finally es opcional");
    }

    /*

        System.out.println("Antes de hacer la division");
        division = numerador / denominador;
        System.out.println("Despues de hacer la division");

     */

/*
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setNombre("Ángel");
        cuenta.setClave("020898");
        cuenta.setSaldo(999999);

        System.out.println(cuenta.getNombre());
        cuenta.mostrarSaldo();

*/

        /*

        Animal animal = new Animal();
        animal.nombre = "Iguana";

         */

        /*
        Persona persona = new Persona();
        persona.setName("Ángel");
        persona.setAge(23);
        persona.setId("2020123");
        persona.mostrarPersona();

         */

    }

}

