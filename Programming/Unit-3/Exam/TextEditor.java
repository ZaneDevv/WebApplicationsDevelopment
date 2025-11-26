import java.util.Scanner;


/**
 * @version 1.0
 * @date 2025/11/26
 * @author Álvaro Fernández Barrero
 */

public class TextEditor
{
    public static void main(String[] args)
    {
        // Defining variables
        
        Scanner input = new Scanner(System.in);
        
        String text = "";
        String helperText = "";
        String inputText = "";
        
        String selectedOption = "";
        
        boolean programFinished = false;
        
        int i = 0;
        
        int wordCount = 0;
        int wordPosition = 0;
        boolean textContainsString = false;
        
        
        
        // Starting program
        
        do
        {
            // Writing options
            
            System.out.println("--- OPTIONS MENU ---");
            System.out.println("(1) Load text\n(2) Count words\n(3) Search text\n(4) Position of a word\n(5) Replace a word\n(s) Exit and finish");
            System.out.println("------------------------");
            System.out.print("Select an option (1-5 or s): ");
            
            selectedOption = input.nextLine().trim();
            
            
            /*
            The program was originally made only with a switch, but to fulfill point 7 
            and have exception control, I will separate the numeric options from the possible 's'
            */
            
            
            
            // Executing the selected option
            
            switch (selectedOption)
            {
            case "s":
            case "S":
                programFinished = true;
                break;
                
            
            case "1":
                // Loading text
                
                System.out.println("Write a text here:");
                text = input.nextLine();

                // If the text exceeds the character limit, the extra characters are removed
                
                if (text.length() > 100)
                {
                    System.out.println("Maximum length is 100 characters");
                    text = text.substring(0, 101);
                }
                
                break;
                
                
            case "2":
                // Counting the words of the provided text
                
                if (text.length() > 0)
                {
                    wordCount = 0;
                    helperText = text.trim();
                    
                    for (i = 0; i < helperText.length() - 1; i++)
                    {
                        char character = helperText.charAt(i);
                        
                        if (i == 0 || (character == ' ' && helperText.charAt(i + 1) != ' '))
                        {
                            wordCount++;
                        }
                    }
                    
                    // Showing result
                    
                    System.out.printf("The number of words in the provided text is %d\n", wordCount);
                }
                else
                {
                    System.out.println("Text not loaded yet");
                }
                
                break;
                
                
            case "3":
                // Checking if the user's text contains a specific text: uppercase and lowercase do not matter
                
                if (text.length() > 0)
                {
                    System.out.println("Write here the text to check if it is found in the loaded text (uppercase and lowercase are ignored):");
                    helperText = input.nextLine().toUpperCase();
                    
                    textContainsString = text.toUpperCase().contains(helperText);
                    
                    if (textContainsString)
                    {
                        System.out.println("The provided text IS found in the loaded text");
                    }
                    else 
                    {
                        System.out.println("The provided text has NOT been found in the loaded text");
                    }
                }
                else
                {
                    System.out.println("Text not loaded yet");
                }
                    
                break;
                
                
            case "4":
                // Searching the position of a given word in the text 
                
                if (text.length() > 0)
                {
                    System.out.println("Write here the word to search:");
                    helperText = input.nextLine();
                    
                    wordPosition = text.indexOf(helperText);
                    
                    if (wordPosition == -1)
                    {
                        System.out.println("The word was not found in the text");
                    }
                    else
                    {
                        System.out.printf("Word found at position %d\n", wordPosition);
                    }
                }
                else
                {
                    System.out.println("Text not loaded yet");
                }
                
                break;
                
                
            case "5":
                // Replacing a given word in the text
                
                if (text.length() > 0)
                {
                    System.out.print("Write here what you want to replace: ");
                    helperText = input.nextLine();
                    
                    System.out.print("Write here what you want to replace it with: ");
                    inputText = input.nextLine();
                    
                    if (text.contains(helperText))
                    {
                        text = text.replace(helperText, inputText);
                        System.out.printf("Saved text:\n%s\n", text);
                    }
                    else
                    {
                        System.out.println("Word not found");
                    }
                }
                else
                {
                    System.out.println("Text not loaded yet");
                }
                
                break;
                
                
            default:
                System.out.println("Incorrect option");
            }
            
            
            // If the program wasn't finished, add spaces to separate results
            
            if (!programFinished)
            {
                System.out.print("\n\n");
            }
        }
        while (!programFinished);
    
        
        System.out.print("Program finished");
    }
}

