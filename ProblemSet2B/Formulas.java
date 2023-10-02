import java.util.Scanner;
public class Formulas
{
   
public static OrderedPair quadraticRoots(double a,double b, double c){
    double x;
    double y;
    
    x = (-b + Math.sqrt((b*b) - (4*a*c)))/(2*a);
    y = (-b - Math.sqrt((b*b) - (4*a*c)))/(2*a);
    
  OrderedPair answer = new OrderedPair(x,y);
  return answer;
}

public static double slope(OrderedPair a, OrderedPair b){
    double x = (a.getX() - b.getX());
    double y = (a.getY() - b.getY());
    double answer = y/x;
    return answer;
}

public static OrderedPair findMidpoint(OrderedPair a, OrderedPair b){
    double x1 = a.getX();
    double x2 = b.getX();
    double y1 = a.getY();
    double y2 = b.getY();
    double answerX = ((x1+x2)/2);
    double answerY = ((y1 + y2)/2);
    OrderedPair answer = new OrderedPair(answerX,answerY);
    return answer;
}

public static double findArithmeticSeriesSum (double a, double d, int k){
    double sum = ((k/2.0)*(2*a + d*(k-1)));
    return sum;
}

public static double findGeometricSeriesSum (double a, double r, int k){
    double sum = a*((1 - (double)Math.pow(r,k))/(1-r));
    return sum;
}

public static int rollDie (int sides){
    int roll = (int) (Math.random()*sides) + 1;
    return roll;
}

}