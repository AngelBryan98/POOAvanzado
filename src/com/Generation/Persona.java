package com.Generation;

public class Persona {
    //    String nombre;
//    int edad;
// //    void  saludar() {
//        System.out.println("Hola");
//    }
    private String name;
    private int age;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void mostrarPersona() {
        System.out.println("Nombre: " + this.name);
        System.out.println("Edad: " + this.age);
        System.out.println("ID: " + this.id);
    }
}


