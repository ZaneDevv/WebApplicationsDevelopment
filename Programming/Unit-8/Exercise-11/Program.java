import java.util.HashMap;

/**
 * Dictionary Spanish-English: HashMap tester
 * @version 1.0
 * @author Álvaro Fernández Barrero
 */
public class Program
{
    //----------------------------------------
    // Attributes
    //----------------------------------------

    public static HashMap<String, String> dictionary = new HashMap<>();

    //----------------------------------------
    // Methods
    //----------------------------------------

    /**
     * Sets all the words into the dictionary if and only if the dictionary is empty
     * @version 1.0
     * @since 1.0
     * @author Álvaro Fernández Barrero
     */
    public static void setWords()
    {
        if (dictionary.isEmpty())
        {
            dictionary.put("Perro", "Dog");
            dictionary.put("Centro", "Center");
            dictionary.put("Traductor", "Translator");
            dictionary.put("Diccionario", "Dictionary");
            dictionary.put("Idioma", "Languaje");
            dictionary.put("Mar", "See");
        }
    }

    /**
     * Main program
     * @version 1.0
     * @since 1.0
     * @author Álvaro Fernández Barrero
     */
    public static void main(String[] args)
    {
        setWords();

        // Translating "Idioma" into English
        String englishTranslation = dictionary.get("Idioma");

        // Removing the word "Centro"
        dictionary.remove("Centro");

        // Showing dictionary
        System.out.println(dictionary);
    }
}