
/**
 * @author (Vodonenko, Daveed)
 **/

public class OrderedPair{
    //Instance Variables
    double x;
    double y;
    //Constructors
    public OrderedPair(){
        x = 0;
        y = 0;
    }

    public OrderedPair(double a, double b){
        x = a;
        y = b;
    }

    public String toString (){
        String Pair = x + "," + y;
        return Pair;
    }

    public double getX() {
        return x;
    }

    public double getY(){
        return y;
    }
}

