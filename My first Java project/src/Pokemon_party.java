import java.util.Scanner;

public class Pokemon_party {
    public static void main(String[] args) {
     Scanner scan1 = new Scanner(System.in);
     
     System.out.println("First name");
     String pokemon1 = scan1.nextLine();
     
     System.out.println("Second name");
     String pokemon2 = scan1.nextLine();
     
     System.out.println("Third name");
     String pokemon3 = scan1.nextLine();
     
     scan1.close();

     System.out.println("Everything");
     System.out.println(pokemon1 + '\n' + pokemon2 + '\n' + pokemon3);
    }
}