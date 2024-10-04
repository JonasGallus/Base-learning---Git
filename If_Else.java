
public class If_Else{
    double temperatur = 24.5;

public void doSomthing(){
    if (temperatur < 7) {
        System.out.println("Es ist kalt");
    }
    if (temperatur == 7 && temperatur < 8) {
        System.out.println("Es hat 7 grad es ist kalt");
    }
    if (temperatur == 8 || temperatur == 9) {
        System.out.println("es hat 8 oder 9 grad");
    }
    if (temperatur == 24.5 ^ temperatur == 100) {
        System.out.println("es ist heiß oder sehr heiß");
    } else {
        System.out.println("es hat garkeine Temeratur");
        
    }
}
        
}
