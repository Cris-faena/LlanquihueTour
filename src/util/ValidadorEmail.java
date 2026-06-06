package util;

/**
 * Clase que permite validar un Email
 */
public class ValidadorEmail
{
    // Se implementa un String con una "Expresión Regular" para validar el formato de un Email
    public static final String REGEX_EMAIL = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,63}$";

    /**
     * Método booleano para validar un Email
     * @param email variable "email" que se quiere validar
     * @return "false" si el formato no es validado, y "true" junto a cadena de texto recortada y en minúscula con el "email" validado
     */
    public static boolean validar(String email)
    {
        if (email == null || email.trim().isEmpty())
        {
            return false;
        }
        String Limpio = email.trim().toLowerCase();

        return Limpio.length() <= 254 && Limpio.matches(REGEX_EMAIL);
    }
}
