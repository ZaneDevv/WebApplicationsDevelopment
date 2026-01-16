package com.utils;


/**
 * @version 1.0
 * @author Álvaro Fernández Barrero
 */

public abstract class Text
{
     //---------------------------
    // Constants
    //---------------------------

    private static final byte CAPITAL_CAMEL_GAP = 'A' - 'a';

    //---------------------------
    // Methods
    //---------------------------

    /**
     * Formats the given string to have only the first letter capitalized and all the rest
     * @param text Text to format
     * @return Formatted text
     * @version 1.2
     * @since 1.0
     * @author Álvaro Fernández Barrero
     */
    public static String formatString(String text)
    {
        if (text.length() == 0)
        {
            return text;
        }


        char firstCharacter = text.charAt(0);

        if (firstCharacter >= 'a' && firstCharacter <= 'z')
        {
            firstCharacter += Text.CAPITAL_CAMEL_GAP;
        }

        text = text.toLowerCase(); 

        return String.valueOf(firstCharacter) + text.substring(1);  
    }
}