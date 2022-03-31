/**
 * Created by s7331 on 3/31/2022.
 */
public class CalculateInterest {
    public double Interest(double balance){
        double interest=0;
        if(balance<0)
            throw new IllegalArgumentException("Inavalid Account !!!");

        if(balance>=0 && balance<=100)
            interest+=0.03*balance;

        if(balance>100 && balance<1000)
            interest+=0.05*balance;

        if(balance>=1000)
            interest+=0.07*balance;
        return interest;
    }
}
