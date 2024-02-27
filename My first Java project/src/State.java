public class State {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        if(a > 2 || b == 65 || c == 100) {
            System.out.println(a + b + c +" You win!");
        }
        if(a == 1) {
            System.out.println("You lose.");
        }
        
    }
}
