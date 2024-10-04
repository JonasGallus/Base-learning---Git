import java.util.Random;
public class Randomklasse {
    public void doSomthing(){
        Random random = new Random();
        int zufallszahl = random.nextInt(10) +1 ;// von 0 bis 9 dann plus 1
        System.out.println(zufallszahl);
        
        String buchstabe = "abcdefghijklmnopqrstuvwxyz";
        String word = "";
        for(int i = 0; i < 5; i++ ){
            int stelle = random.nextInt(26);
            word += buchstabe.charAt(stelle);
        }
        System.out.println(word);
    }
    
}
