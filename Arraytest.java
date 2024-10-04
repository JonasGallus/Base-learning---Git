public class Arraytest {
    public void doSomthing(){
        String[] werkzeugkasten = {"Hammer", "Meissel", "Schleifmaschine" };

        System.out.println(werkzeugkasten.length);

        int[] numbers = new int[1000];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = i + 1;
        }
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[1]);
        }
    }
    
}
