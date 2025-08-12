package JavaBasics;

interface cycle{
     void cycleBreak(int decrement);
     void cycleSpeed(int increment);
}

class runCycle implements cycle{
    public void cycleBreak(int decrement){
        System.out.println("decrement the speed of cycle by "+decrement);
    }

    @Override
    public void cycleSpeed(int increment) {
        System.out.println("increment the speed of cycle by "+increment);
    }
}
public class Interfaces {
    public static void main(String[] args) {
        runCycle run=new runCycle();
        run.cycleBreak(10);
        run.cycleSpeed(100);
    }
}
