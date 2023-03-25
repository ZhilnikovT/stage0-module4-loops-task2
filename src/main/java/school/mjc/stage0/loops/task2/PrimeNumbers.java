package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    
    public static void main(String[] args) {
        PrimeNumbers g = new PrimeNumbers();
        g.printPrimeNumbers(31);
    }
    
    public void printPrimeNumbers(int printToInclusive) {
        int n = 2; 
        while(n <= printToInclusive){
            int c = 0;
            int i = 2;
            while(i <= printToInclusive){
                if(n%i == 0){ c++; }
                i++;
            }
            if(c == 1){ System.out.println(n);}
        n++;
        }
    }
}
