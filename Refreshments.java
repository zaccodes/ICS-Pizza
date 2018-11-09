// Paul Geddes 9 November 2018
import java.util.Scanner;

public class Refreshments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
String c = "Coca-Cola";
String f = "Flying fish";
String i = "Ice Tea";
String l = "Castle Lite";
String s = "Still Water";
String k = "Sparkling Water";
String e = "Milkshake";
char choice = ' ';
String items = "";
while (true) {
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
if (choice == ' ') {
System.out.println("\n\t\t\tAlready Selected: " );
}
else {
	System.out.print("\n\t\t\tAlready Selected: " );
	System.out.print(items );
	
}
	
System.out.print("\n\t\t\tEnter Choice>");
choice = sc.next().charAt(0);
switch (choice) {
case 'c':
	items += " "+ c;
System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
continue;
	
case 'f':
	items += " " + f;
	break;
case 'i':
	items += " " + i;
	System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	continue;
case 'l':
	items += " " + l;
	System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	continue;
case 's':
	items += " " + s;
	System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	continue;
case 'k':
	items += " " + k;
	System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	continue;
case 'e':
	items += " " + e;
	System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	continue;
case 'n':
	items = "";
	// go back to billing screen; 
	System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	break;
case 't' :
	items = "";
	System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	continue;
	
}
}
	}

}
