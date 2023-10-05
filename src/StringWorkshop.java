import java.util.Scanner;
public class StringWorkshop {
    public static String additionToString(String mainString, Scanner sc) {

        //prompts user for input of additional string content
        System.out.println("\nAdd your letters or whatnot");
        String newStuff = sc.nextLine();

        //combines new content with original string
        mainString = mainString + newStuff;

        //outputs changes to the string and returns to main
        System.out.println("\nUr new string is: " + mainString + "\n");
        return mainString;
    }
    public static void detectSubstring(String mainString, Scanner sc) {

        //prompts user to input desired substring
        System.out.println("Detect substring:");
        String substring = sc.nextLine();

        //Takes index of the substring and checks if it is present in the original string
        int indexOfSubstring = mainString.indexOf(substring);

        //uses index output to return an answer to the user
        if (indexOfSubstring == -1) {
            //easier to detect if the substring doesn't exist, gives user feedback
            System.out.println("\nUnfortunately, what you are looking for just doesn't exist...\n");
        }
        else {
            //if the substring is anywhere else in the main string, feedback and no details
            System.out.println("\nThe substring is real!\n");
        }
    }
    public static void stringLength(String mainString) {

        //turns length of the string into an integer to display
        int stringLength = mainString.length();

        //outputs the length
        System.out.println("\nThe length of the string is " + stringLength);
        System.out.println();
    }

    public static void postPrefix(String mainString, Scanner sc) {

        //user prompt for prefix
        System.out.println("\nPrefix:");
        String prefix = sc.nextLine();

        //converts main string and prefix length into integers
        int stringLength = mainString.length();
        int lengthOfPrefixInput = prefix.length();

        //takes the length of the prefix relative to the main string
        int indexOfPrefix = mainString.indexOf(prefix);

        //declares all the characters following the last position of the prefix as a substring and outputs them
        String value = mainString.substring(indexOfPrefix + lengthOfPrefixInput, stringLength);
        System.out.println("\nThe substring is, " + value);
        System.out.println();
    }
    public static void preSuffix(String mainString, Scanner sc) {

        //prompts user for desired suffix
        System.out.println("\nSuffix:");
        String suffix = sc.nextLine();

        //takes index of suffix relative to main string
        int indexOfSuffix = mainString.indexOf(suffix);

        //declares all characters from the 0th position and before the suffix as a substring and outputs them
        String value = mainString.substring(0, indexOfSuffix);
        System.out.println("\nThe substring is, " + value);
        System.out.println();
    }
    public static void containedSubstring(String mainString, Scanner sc) {
        //prompts user for prefix input
        System.out.println("\nPrefix:");
        String prefix = sc.nextLine();

        //prompts user for suffix
        System.out.println("Suffix:");
        String suffix = sc.nextLine();

        //takes the length of prefix and index of prefix relative to the main string
        int lengthOfPrefix = prefix.length();
        int indexOfPrefix = mainString.indexOf(prefix);

        //index of suffix relative to main string
        int indexOfSuffix = mainString.indexOf(suffix);

        //defines all the characters following the last letter of the prefix to prior the first letter of the suffix as a substring and outputs them
        String value = mainString.substring(indexOfPrefix + lengthOfPrefix, indexOfSuffix);
        System.out.println("\nThe substring is, " + value);
        System.out.println();
    }
    public static void main(String[] args) {

        //initializes Scanner
        Scanner sc = new Scanner(System.in);

        //user prompt and input for a string
        System.out.println("Enter a starting string:");
        String mainString = sc.nextLine();

        //declares a boolean variable to run a 'while' loop
        boolean repeat = true;
        while (repeat) {

            //prints options available for user to choose from
            System.out.println("Pick an option:\n" +
                    "1. Add content\n" +
                    "2. Check if string contains substring\n" +
                    "3. Output length\n" +
                    "4. Output substring after prefix\n" +
                    "5. Output substring before suffix\n" +
                    "6. Output substring between prefix and suffix\n" +
                    "7. Exit\n");

            //option input and clears extra input from nextInt
            int option = sc.nextInt();
            sc.nextLine();

            if (option == 1) {
                //runs a method to add content to the primary string
                mainString = additionToString(mainString, sc);
            }
            else if (option == 2) {
                //uses method to detect a substring in the main string
                detectSubstring(mainString, sc);
            }
            else if (option == 3) {
                //method that outputs the length of the main string
                stringLength(mainString);
            }
            else if (option == 4) {
                //uses a method to determine the substring following a prefix
                postPrefix(mainString, sc);
            }
            else if (option == 5) {
                //uses a method to determine the substring prior to a suffix
                preSuffix(mainString, sc);
            }
            else if (option == 6) {
                //uses a method to determine characters in between a prefix and suffix
                containedSubstring(mainString, sc);
            }
            else if (option == 7) {
                //redefines repeat to end the loop and outputs message letting the user know they have exited the program
                System.out.println("\nDarn, looks like you escaped the loop");
                repeat = false;
            }
            else {
                //outputs message informing the user they made a mistake
                System.out.println("\nThat was not a valid option! Try something actually available this time!\n");
            }
        }
    }
}