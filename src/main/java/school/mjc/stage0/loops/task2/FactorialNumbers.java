package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    
    public static void main(String[] args) {
        FactorialNumbers g = new FactorialNumbers();
        g.printFactorialRow(7);
    }
    
    public void printFactorialRow(int printToInclusive) {
        int i = 0, m = 1;;
        while(i <= printToInclusive){
            if(i == 0){System.out.println(1);}
            else{
                m = m * i;
                System.out.println(m);
            }
            i++;   
        }
    }
}
