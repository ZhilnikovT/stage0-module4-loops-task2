package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    
    public static void main(String[] args) {
        PowerOfTwo g = new PowerOfTwo();
        g.printPower(-7);
    }
    
    public void printPower(int power) {
        int i = 0;
        int twoByPower = 1;
        if(power < 0){ System.out.println("too much power");}
        while(i <= power){
            if(i == 0){
                System.out.println(1);
            }else{
                twoByPower = twoByPower*2;
                System.out.println(twoByPower);
            }
            i++;   
        }
    }
}
