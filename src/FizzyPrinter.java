
public class FizzyPrinter {
    public String printFizzy(int n) {
        if(n % 3 == 0 && n % 5 == 0 && n % 7 == 0) {
            return "Fizzbuzzbang";
        }
        else if(n % 3 == 0 && n % 5 == 0) {
            return "Fizzbuzz";
        }
        else if(n % 3 == 0) {
            return "Fizz";
        }
        else if(n % 5 == 0) {

            return "Buzz";
        }
        else if(n % 7 == 0) {
            return "Bang";
        }
        else
            return "Boom";
    }

    public static void main(String[] args) {
        FizzyPrinter game = new FizzyPrinter();
        game.printFizzy(25);
 }
}