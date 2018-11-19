import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        System.out.println("pasta".equals("pasta")); //comparing strings use equal method
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the VIP lounge");
        System.out.print("Age: ");
        int age = scanner.nextInt();

//        System.out.print("Do you have a VIP pass? yes/no:");
//        String userInput = scanner.next();

        if(age>=18){
            System.out.print("Do you have a VIP pass? yes/no:");
            String userInput = scanner.next();
            if(userInput.equals("yes") || age>=70){
                System.out.println("Thanks, go on in.");
            }else{
                System.out.println("Sorry, you must have a VIP or be older than 70");
            }
        }else{
            System.out.println("You must be 18 and over");
        }
//        if (age>=70 || (age >= 18 && userInput.equals("yes"))) {
//            System.out.println("Thanks, go on in. ");
//        } else {
//            System.out.println("Sorry no can do");
//        }

    }
}
