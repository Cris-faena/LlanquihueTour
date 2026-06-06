package model;

/**
 * Se crea la Clase "Guía de Montaña"
 */
public class GuiaDeMontaña extends Persona
{
    private double salario;
    private String idioma;

    // Constructor por defecto. Hereda el constructor de la Clase padre "Persona" y se agregan dos atributos adicionales:
    public GuiaDeMontaña()
    {
        super();
        this.salario = 0.0;
        this.idioma = "Sin dominio de idioma";
    }

    // Se sobreescribe el Método "Trabajo Específico" para que muestre la tarea del objeto:
    /**
     * Método que imprime la tarea específica o trabajo que desarrolla el objeto.
     */
    @Override
    public void trabajoEspecifico()

    {
        System.out.println("Trabajo específico: Subir el volcán junto a los clientes");
    }

    // Se implementan los Métodos "Getters":

    /**
     * Método para obtener el "salario" del objeto"
     * @return "salario" del objeto.
     */
    public double getSalario() {return salario;}

    /**
     * Método para obtener el "idioma" de dominio del objeto.
      * @return "idioma" dominado por el objeto.
     */
    public String getIdioma() {return idioma;}

    // Se implementam los Métodos "Setters":

    /**
     * Método para modificar el valor del "salario" del objeto.
     * @param nuevoSalario nuevo "salario" que se desea asignar al objeto.
     */
    public void setSalario(double nuevoSalario) {this.salario = nuevoSalario;}

    /**
     * Método para modificar el "idioma" dominado por el objeto.
     * @param nuevoIdioma nuevo "idioma" que se desea asignar al objeto.
     */
    public void setIdioma(String nuevoIdioma) {this.idioma = nuevoIdioma;}

    // Se implementa el Método "ToString":

    /**
     * Método que muestra una cadena de texto con los valores asignados al objeto.
     * Hereda los atributos de la Clase padre "Persona".
     * @return nombre, apellido, dirección, Email, teléfono, salario e idioma.
     */
    @Override
    public String toString()
    {
        return super.toString() + ", " + "Salario: " + salario + ", " + "Idioma: " + idioma;
    }
}
