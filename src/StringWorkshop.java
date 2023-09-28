import java.util.Scanner;
public class StringWorkshop {
    public static String AddStrings(String mainString) {
        Scanner in = new Scanner(System.in);
        System.out.println("\nAdd your letters or whatnot");
        String newStuff = in.nextLine();
        mainString = mainString + newStuff;
        System.out.println("\nCurrent string " + mainString);
        return mainString;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a starting string");
        String mainString = in.nextLine();

        int option = 1;
        while (option != 404) {
            System.out.println
                    ("Pick an option:\n" +
                            "1. Add content\n" +
                            "2. Check if string contains substring\n" +
                            "3. Output length\n" +
                            "4. Output substring after prefix\n" +
                            "5. Output substring before suffix\n" +
                            "6. Output substring between prefix and suffix\n" +
                            "7. Exit\n");

            option = in.nextInt();
            in.nextLine();


            if (option == 1) {
                AddStrings(mainString);
                System.out.println();
            } else if (option == 2) {

            } else if (option == 3) {

            } else if (option == 4) {

            } else if (option == 5) {

            } else if (option == 6) {

            } else if (option == 7) {
                option = 404;
            } else {
                System.out.println("That was not a valid option! Try something available this time!\n");
            }
        }
    }
}