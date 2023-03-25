package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    
     public static void main(String[] args) {
        EvenNumbersPrinter g = new EvenNumbersPrinter();
        g.printEvenNumbers(20);
    }
    public void printEvenNumbers(int printTillInclusive) {
        int i = 0;
        while(i <= printTillInclusive){
            if (i%2 == 0){System.out.println(i);}
             i++;
        }
    }
}
