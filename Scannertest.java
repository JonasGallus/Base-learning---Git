import java.util.Scanner;

public class Scannertest {
    String sentence;
    public void doSomthing(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte gib einen Satz ein:");
        sentence = scan.nextLine();// nextInt() oder nextDouble oder andere Sachen
        System.out.println("Dein Satz war: " + sentence);
    }
}
