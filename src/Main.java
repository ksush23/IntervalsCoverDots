
import java.math.BigInteger;
import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        ArrayList intervals = new ArrayList();

        ArrayList dots = new ArrayList();

        for (int i  = 0; i < n; i++){

        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();
        Interval interval = new Interval(a, b);

        intervals.add(interval);
        }

        int number = 0;

        while (number < n)
        {
            BigInteger smallestB = BigInteger.valueOf(1000000000);
            int index = 0;
            Interval inter;

            for (int i = 0; i < intervals.size(); i ++)
            {
                inter = (Interval)intervals.get(i);
                BigInteger currB = inter.getB();
                if (smallestB.compareTo(currB) == 1 && inter.isMarked() == false) {
                    smallestB = currB;
                    index = i;
                }
            }

            dots.add(smallestB);
            inter = (Interval)intervals.get(index);
            inter.setMarked(true);
            number++;

            for (int i = 0; i < intervals.size(); i++)
            {
                inter = (Interval)intervals.get(i);
                BigInteger a = inter.getA();
                BigInteger b = inter.getB();

                if (smallestB.compareTo(a) >=0 && smallestB.compareTo(b) <= 0 && inter.isMarked() == false) {
                    inter.setMarked(true);
                    number++;
                }
            }

        }

        System.out.println(dots.size());
        for (int i = 0; i < dots.size(); i++)
        {
            System.out.println(dots.get(i));
        }
    }
}
