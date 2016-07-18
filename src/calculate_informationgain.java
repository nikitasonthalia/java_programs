/**
 * Created by nikitasonthalia on 7/4/16.
 */
public class calculate_informationgain {

    public static void main(String[] args){

        double n1= 3/6;
        double n2=3/6;
        System.out.print(-((n1* log(n1,2))+ (n2 * log(n2,2))));
    }
    static double log(double x, int base)
    {
        return (double) (Math.log(x) / Math.log(base));
    }
}
