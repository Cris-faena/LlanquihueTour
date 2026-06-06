package model;


/**
 * Clase que representa una persona
 */
public class Persona
{
    private String nombre;              // Atributo para asignar "nombre"
    private String apellido;            // Atributo para asignar "apellido"
    private Rut rut;                    // Atributo para asignar "RUT"
    private Direccion direccion;        // Atributo para asignar "dirección" (composición)
    private Email email;                // Atributo para asignar "Email"
    private String telefono;            // Atributo para asignar "telefono"

    // Constructor por defecto de la Clase Persona:
    public Persona()
    {
        this.nombre = "Sin nombre";
        this.apellido = "Sin apellido";
        this.rut = null;
        this.direccion =  new Direccion();
        this.email = null;
        this.telefono = "Sin teléfono";
    }

    /**
     * método para mostrar el trabajo específico o tarea que realiza el objeto.
     */
    public void trabajoEspecifico()
    {
        System.out.println("Trabajo específico: realizando trabajo sin especificar");
    }

    // Se implementan métodos "Getters":
    /**
     * Método para visualizar el "nombre" del objeto creado.
     * @return "nombre" del objeto.
     */
    public String getNombre() {return nombre;}

    /**
     * Método para visualizar el "apellido" del objeto creado.
     * @return "apellido" del objeto creado.
     */
    public String getApellido() {return apellido;}

    /**
     * Método para visualizar el "Rut" del objeto creado
     * @return "Rut" del objeto creado
     */
    public Rut getRut() {return rut;}

    /**
     * Método para visualizar "Dirección" del objeto creado.
     * @return "dirección" del objeto creado.
     */
    public Direccion getDireccion() {return direccion;}

    /**
     * Método para visualizar "Email" del objeto creado.
     * @return "email" del objeto creado
     */
    public String getEmail() {return (email == null) ? "Sin Email" : email.getEmailDireccion();}

    /**
     * Método para visualizar "teléfono" del objeto creado.
     * @return "teléfono" del objeto creado.
     */
    public String getTelefono() {return telefono;}

    // Se implementan métodos "Setters":

    /**
     * Método para modificar "nombre" del objeto creado.
     * @param nuevoNombre "nombre" nuevo que se quiere asignar.
     */
    public void setNombre(String nuevoNombre) {this.nombre = nuevoNombre;}

    /**
     * Método para modificar "apellido" del objeto creado.
     * @param nuevoApellido "apellido" nuevo que se quiere asignar.
     */
    public void setApellido(String nuevoApellido) {this.apellido = nuevoApellido;}

    /**
     * Método para modificar "Rut" del objeto creado.
     * @param nuevoRut "Rut" nuevo que se quiere asignar al objeto.
     */
    public void setRut(Rut nuevoRut) {this.rut = nuevoRut;}
    /**
     * Método para modificar "Dirección" del objeto creado.
     * @param direccion "dirección" nueva que se quiere asignar.
     */
    public void setDireccion(Direccion direccion) {this.direccion = direccion;}
    /**
     * Método para modificar "Email" del objeto creado.
     * @param email "Email" nuevo que se quiere asignar.
     */
    public void setEmail(Email email) {this.email = email;}
    /**
     * Método para modificar "teléfono" del objeto creado.
     * @param nuevoTelefono "teléfono" nuevo que se quiere asignar.
     */
    public void setTelefono(String nuevoTelefono) {this.telefono = nuevoTelefono;}

    // Se implementa un Método "toString":

    /**
     * Método para mostrar en una cadena de texto los valores del objeto creado.
     * @return nombre, apellido, dirección, email y teléfono del objeto creado.
     */
    @Override
    public String toString()
    {
        return "Nombre: " + nombre + ", " + "Apellido:  " + apellido + ", " + "Rut: " + rut + ", " + "Dirección: " + direccion + ", " + "Email: " + email + ", " + "Teléfono: " + telefono;
    }
}
