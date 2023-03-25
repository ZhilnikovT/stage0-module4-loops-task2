package school.mjc.stage0.loops.task2;

public class NaturalNumbers {
    
    public static void main(String[] args) {
        NaturalNumbers g = new NaturalNumbers();
        g.naturalNumbersPrinter(20);
    }
    
    public void naturalNumbersPrinter(int lastPrinted) {
        for(int i = 0; i <= lastPrinted; i++){
            System.out.println(i);
        }
    }
}
