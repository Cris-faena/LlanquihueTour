package model;

/**
 * Se implementa una Clase que representa a un recepcionista
 */
public class Recepcionista extends Persona
{
    // Atributos de la Clase "Recepcionista":
    private double salario;
    private String idioma;

    // Constructor por defecto de la Clase "Recepcionista":
    public  Recepcionista()
    {
        super();
        this.salario = 0.0;
        this.idioma = "Sin idioma dominante";
    }

    // Se sobreescribe el Método "Trabajo Específico" para que muestre la tarea del objeto:
    /**
     * Método para imprimir la tarea específica del objeto
     */
    @Override
    public void trabajoEspecifico()
    {
        System.out.println("Trabajo específico: Ingresar en el sistema informático a los nuevos clientes");
    }

    // Se implementan los Métodos "Getters":
    /**
     * Método para obtener el valor asignado al "salario" del objeto.
     * @return "salario" del objeto.
     */
    public double getSalario() {return salario;}
    /**
     * Método para obtener el "idioma" dominado por el objeto.
     * @return "idioma" dominado por el objeto.
     */
    public String getIdioma() {return idioma;}

    // Se implementan los Métodos "Setters":
    /**
     * Método para modificar el "salario" del objeto
     * @param nuevoSalario nuevo "salario" que se desea asignar al objeto.
     */
    public void setSalario(double nuevoSalario) {this.salario = nuevoSalario;}
    /**
     * Método para modificar el "idioma" dominado por el objeto.
     * @param nuevoIdioma nuevo "idioma" que se quiere asignar al objeto.
     */
    public void setIdioma(String nuevoIdioma) {this.idioma = nuevoIdioma;}

    // Se implementa el Método "toString"
    /**
     * Método para visualizar en una cadena de texto los atributos del objeto.
     * Hereda algunos atributos de la Clase padre "Persona".
     * @return nombre, apellido, dirección, Email, teléfono, salario e idioma.
     */
    @Override
    public String toString()
    {
        return super.toString() + ", " + "Salario: " + salario + ", " + "Idioma: " + idioma;
    }
}
