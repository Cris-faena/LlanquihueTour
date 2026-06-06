package model;

/**
 * Clase "Conductor" que hereda atributos de la clase "Persona"
 */
public class Conductor extends Persona
{
    private String vehiculo;           // Se agrega atributo para asignar un "Cargo"
    private double salario;            // Se agrega atributo para asignar un "salario"

    // Constructor por defecto de la clase Conductor:
    public Conductor()
    {
        super();        // Se agrega el método "super" para que "conductor" herede los atributos del constructor "Persona"
        this.vehiculo = "Sin vehículo asignado";
        this.salario = 0.0;
    }

    // Se sobreescribe el Método "Trabajo Específico" para mostrar la tarea de la Clase "Conductor":

    /**
     * Método que muestra el trabajo o tarea específica que desarrolla el objeto
     */
    @Override
    public void trabajoEspecifico()
    {
        System.out.println("Trabajo específico: Conducir el vehículo asignado y transportar pasajeros"); // tarea específica
    }

    // Se implementan los Getters:

    /**
     * Método que permite obtener el valor de la variable "vehículo"
     * @return "vehículo" asignado al objeto.
     */
    public String getVehiculo() {return vehiculo;}

    /**
     * Método que permite obtener el "salario" asignado al objeto por su trabajo específico.
     * @return "salario" que recibe el objeto
     */
    public double getSalario() {return salario;}

    // Se implementan los Setters:

    /**
     * Método para modificar el "vehículo" asignado al objeto.
     * @param nuevoVehiculo nombre del nuevo "vehículo" que se quiere asignar al objeto.
     */
    public void setVehiculo(String nuevoVehiculo) {this.vehiculo = nuevoVehiculo;}

    /**
     * Método para modificar el "salario" asignado al objeto.
     * @param nuevoSalario asigna un nuevo "salario" al objeto.
     */
    public void setSalario(double nuevoSalario) {this.salario = nuevoSalario;}

    // Se implementa un Método "toString" para mostrar información de la clase

    /**
     * Método que muestra los valores asignados el objeto en una cadena de texto.
     * Hereda atributos de la Clase padre "Persona".
     * @return nombre, apellido, dirección, Email, teléfono, vehículo y salario.
     */
    @Override
    public String toString()
    {
        return super.toString() + ", " + "Vehículo: " + vehiculo + ", salario: " + salario;
    }
}
