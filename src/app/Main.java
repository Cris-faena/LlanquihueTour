package app;

import model.*;

/**
 * Clase Main para ejecutar el programa
 */
public class Main
{
    public static void main(String[] args)
    {
        // Se implementa un bloque "Try-Catch" para manejar excepciones:
        try {
            // Se crea una "dirección 1" para asignarla a un objeto:
            Direccion direccion1 = new Direccion();
            direccion1.setCalle("La travesía 7414");
            direccion1.setCiudad("Llanquihue");
            direccion1.setRegion("XIII Región de Los Lagos");

            // Se crea un "Email 1" para asignarlo a un objeto:
            Email email1 = new Email("JohnDoe@gmail.com");

            // Se crea un "Rut1" para asignarlo a un objeto:
            Rut rut1 = new Rut("21345678-3");

            // Se crea un nuevo objeto de la Clase "Persona" con sus respectivos atributos:
            Persona persona1 = new Persona();
            persona1.setNombre("John");
            persona1.setApellido("Doe");
            persona1.setRut(rut1);
            persona1.setDireccion(direccion1);
            persona1.setEmail(email1);
            persona1.setTelefono("+56945678910");

            // Se imprime el Método "toString" para obtener la información del objeto "Persona 1":
            System.out.println(persona1.toString());

            // Se imprime el Método "Trabajo Específico" para saber cuál es la tarea específica que "Persona 1" desarrolla:
            persona1.trabajoEspecifico();
            System.out.println();

            // Se crea una nueva instancia de la Clase "Dirección", llamada "Dirección 2":
            Direccion direccion2 = new Direccion();
            direccion2.setCalle("Los Curacas 2130");
            direccion2.setCiudad("Llanquihue");
            direccion2.setRegion("XIII Región de Los Lagos");

            // Se asigna un nuevo "Email" para la Clase "Conductor 1":
            Email email2 = new Email("Ramirez.teresita7@gmail.com");

            // Se asigna un nuevo "Run2" para la clase "Conductor 1":
            Rut rut2 = new Rut("19786543-2");

            // Se crea un objeto llamado "Conductor 1", con sus respectivos atributos:
            Conductor conductor1 = new Conductor();
            conductor1.setNombre("Teresita");
            conductor1.setApellido("Ramírez");
            conductor1.setRut(rut2);
            conductor1.setDireccion(direccion2);
            conductor1.setEmail(email2);
            conductor1.setTelefono("+56941334568");
            conductor1.setVehiculo("Toyota Cross");         // Se asigna un vehículo al conductor.
            conductor1.setSalario(1000000);                 // Se asigna un salario.

            // Se imprime el Método "toString" para obtener la información de "Conductor 1":
            System.out.println(conductor1.toString());

            // Se imprime el Método "Trabajo Específico" para saber cuál es la tarea específica que desarrolla:
            conductor1.trabajoEspecifico();
            System.out.println();

            // Se implementa una nueva dirección para asignarla a otro objeto:
            Direccion direccion3 = new Direccion();
            direccion3.setCalle("Los Volcanes 3030");
            direccion3.setCiudad("Llanquihue");
            direccion3.setRegion("XIII Region de Los Lagos");

            // Se implementa un nuevo "Email" para asignarlo a un nuevo objeto:
            Email email3 = new Email("MiltonCabrera@gmail.com");

            // Se implementa un nuevo "Rut3" para asignarlo a un nuevo objeto:
            Rut rut3 = new Rut("25657354-3");

            // Se implementa un nuevo objeto "Guia de Montaña":
            GuiaDeMontaña guia1 = new GuiaDeMontaña();
            guia1.setNombre("Milton");
            guia1.setApellido("Cabrera");
            guia1.setRut(rut3);
            guia1.setDireccion(direccion3);
            guia1.setEmail(email3);
            guia1.setTelefono("+5699874532");
            guia1.setSalario(1200000);
            guia1.setIdioma("inglés");      // Se asigna un idioma principal

            // Se implementa el Método "toString" para obtener la información de "Guía de Montaña":
            System.out.println(guia1.toString());

            // Se imprime el Método "Trabajo Específico" para conocer cuál es la tarea específica del "Guia de Montaña":
            guia1.trabajoEspecifico();
            System.out.println();

            // Se crea un nuevo "Email" para el objeto "Recepcionista":
            Email email4 = new Email("AlonsoFernandez.77@gmail.com");

            // Se crea un nuevo "Rut4" para el objeto "Recepcionista":
            Rut rut4 = new Rut("16387456-k");

            // Se crea un objeto llamado "Recepcionista 1"
            Recepcionista recepcionista1 = new Recepcionista();
            recepcionista1.setNombre("Alonso");
            recepcionista1.setApellido("Fernandez");
            recepcionista1.setRut(rut4);
            recepcionista1.setDireccion(direccion2);
            recepcionista1.setEmail(email4);
            recepcionista1.setTelefono("+5699846754");
            recepcionista1.setSalario(700000);
            recepcionista1.setIdioma("Portugués");

            // Se imprime el método toString para obtener información del objeto "Recepcionista"
            System.out.println(recepcionista1.toString());

            // Se imprime el método "Trabajo específico" para conocer cuál es su responsabilidad:
            recepcionista1.trabajoEspecifico();
            System.out.println();
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("No se pudo asignar los valores ingresados: " + e.getMessage());
        }
    }
}