//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static String fizzBuzz(int n){
        StringBuilder sb = new StringBuilder(n*7);
        int fizzCounter = 0;
        int buzzCounter = 0;
        for (int i =1; i<=n;i++){
            fizzCounter++;
            buzzCounter++;
            boolean isFizz = (fizzCounter == 3);
            boolean isBuzz = (buzzCounter == 5);
            if (isFizz && isBuzz){
                sb.append("FizzBuzz\n");
                fizzCounter=0;
                buzzCounter=0;
            }else if(isFizz){
                sb.append("Fizz\n");
                fizzCounter=0;
            }else if(isBuzz){
                sb.append("Buzz\n");
                buzzCounter=0;
            }else{
                sb.append(i).append("\n");
            }

        }
        return sb.toString();
    }
    public static void printFizzBuzz(int n){
        System.out.println(fizzBuzz(n));
    }

    public static void main(String[] args) {
        int n=1000000;
        long startTime = System.nanoTime();
        printFizzBuzz(n);
        long endTime = System.nanoTime();
        System.err.println("The time taken for this operation is "+(endTime-startTime)/1_000_000 + "ms");
    }
}
