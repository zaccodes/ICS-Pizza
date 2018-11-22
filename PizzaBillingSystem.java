import java.util.Scanner;
public class PizzaBillingSystem {
    public static void main(String[] args) {

        displayMenu1();

    }
    public static void displayMenu1() {
        System.out.println("*****************************************************************");
        System.out.println("\t\t\t\t\tMenu 1 please choose");
        System.out.println("\t\t\t\t\t...your options....");
        System.out.println("*****************************************************************");
        Scanner in = new Scanner(System.in);
        char c = in.next().charAt(0);
        switch (c) {
            case 'r':
                displayRefreshmentsMenu();
                     }
    }
    public static void displayRefreshmentsMenu() {
        Scanner in = new Scanner(System.in);
        int [] price = new int[20];
        String c = "Coca-Cola";
        String f = "Flying fish";
        String i = "Ice Tea";
        String l = "Castle Lite";
        String s = "Still Water";
        String k = "Sparkling Water";
        String e = "Milkshake";
        char choice = ' ';
        String items = "";
        Outer: while (true) {
        System.out.println("*****************************************************************");
        System.out.println("\t\t\tPIZZA PIZZAS\n\t\t===============\n\t\t\tRefreshments");
        System.out.println("(C)oca-Cola\t\tR5.00\tR7.50");
        System.out.println("(F)lying Fish\t\tR11.00\tR20.00");
        System.out.println("(I)ce Tea\t\t\tR9.00\tR16.50");
        System.out.println("Castle (L)ite\t\tR10.00\tR18.50");
        System.out.println("(S)till Water\t\tR10.00\tR15.50");
        System.out.println("Spar(k)ling Water\tR10.00\tR15.50");
        System.out.println("Milkshak(e)\t\tR16.00\tR24.00");
        System.out.println("\n\n\t\t\t(N)o more refreshments");
        System.out.println("\n\t\t\tS(t)art over");
        System.out.println("*****************************************************************");
        if (choice == ' ') {
            System.out.println("\n\t\t\tAlready Selected: " );
        }
        else {
                System.out.print("\n\t\t\tAlready Selected: " );
                System.out.print(items );
            }
        System.out.print("\n\t\t\tEnter Choice>");
        choice = in.next().charAt(0);
        switch (choice) {
            case 'c':
                items += " "+ c;
                System.out.println();
                System.out.println("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
                System.out.println();
                continue;
            case 'f':
                items += " " +f;
                System.out.println();
                System.out.println("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
                System.out.println();
                continue;
            case 'i':
                items += " "+i;
                System.out.println();
                System.out.println("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
                System.out.println();
                continue;
            case 'l':
                items += " " + l;
                System.out.println();
                System.out.println("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
                System.out.println();
                continue;
            case 's':
                items += " " + s;
                System.out.println();
                System.out.println("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
                System.out.println();
                continue;
            case 'k':
                items += " " + k;
                System.out.println();
                System.out.println("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
                System.out.println();
                continue;
            case 'e':
                items += " " + e;
                System.out.println();
                System.out.println("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
                System.out.println();
                continue;
            case 'p':
                displayOwnPizzaMenu();
            case 'n':
                displayDisplayOrderMenu();
                break Outer;
            case 't':
        }
        }
    }
    public static void displayDisplayOrderMenu() {
        System.out.println("*****************************************************************");
        System.out.println("\t\t\t\t\tDisplay Order Menu");
        System.out.println("\t\t\t\t\t...your options....");
        System.out.println("*****************************************************************");
    }
    public static void displayInHouseMenu() {

    }
    public static void displayPizzaSizeMenu() {

    }
    public static void displayOwnPizzaMenu() {
    }
    public static void displayCheckoutMenu() {

    }
}
