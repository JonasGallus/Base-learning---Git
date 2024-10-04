public class Schleifen {
    int counter = 10;
    boolean wahr = true;

    public void doSomthing() {
        while (counter == 10) {
            System.out.println("Die schleife laeuft bis break");
            break;
        }
        while (counter > 8) {
            System.out.println("Die schleife laeuft besser");
            counter--;
        }
        while (wahr) {
            System.out.println("Die schleife laeuft bis wahr = false");
            wahr = false;
        }
        
        for(int i = 0; i < 5; i++){
            System.out.println(i);
        }
    }

}
