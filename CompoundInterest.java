public class CompoundInterest {
    public static void main(String[] args) {
        double principal = 10000, rate=2, time =4;
        double CI=principal *(Math.pow((1 + rate / 100), time));
        System.out.println("Compound Interest: "+ CI);
    }
    
}
