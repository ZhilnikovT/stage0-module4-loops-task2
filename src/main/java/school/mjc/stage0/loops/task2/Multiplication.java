package school.mjc.stage0.loops.task2;

public class Multiplication {
    
    public static void main(String[] args) {
        Multiplication g = new Multiplication();
        g.printMultiplied(5);
    }
    
    public void printMultiplied(int multiplyByAndToInclusive) {
        long m = 0;
        long b = multiplyByAndToInclusive * multiplyByAndToInclusive;
        boolean d = true;
        while(d){
            System.out.println(m);
            m = m + multiplyByAndToInclusive;
            d = multiplyByAndToInclusive < 0 ? -m <= b : m <= b;
        }
    }
}
