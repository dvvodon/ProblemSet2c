
import java.util.Scanner;

public class FormulaDriver{
    
    public static void MySoln(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("QUADRATIC FORMULA: Find the roots of ax^2 + bx + c");
    System.out.println("Enter a:");
    double a = input.nextDouble();
    System.out.println("Enter b:");
    double b = input.nextDouble();
    System.out.println("Enter c:");
    double c = input.nextDouble();
    OrderedPair roots = Formulas.quadraticRoots(a,b,c);
    System.out.println("the answer is " + roots);

}

   public static void MySlope(String[] args){
      
      Scanner input = new Scanner(System.in); 
       System.out.println("SLOPE FORMULA: Find Slope m = y2 - y1x2 - x1  for the line between points (x1,y1) and (x2,y2)");
       System.out.println("Enter x1:");
       double a = input.nextDouble();
        System.out.println("Enter y1:");
       double b = input.nextDouble();
        System.out.println("Enter x2:");
       double c = input.nextDouble();
        System.out.println("Enter y2:");
       double d = input.nextDouble();
    OrderedPair pV1 = new OrderedPair(a,b);
       OrderedPair pV2 = new OrderedPair(c,d);
       double slope = Formulas.slope(pV1,pV2);
       System.out.println("the answer is " + slope);
   }
   
   public static void MyMidPoint(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.println("MIDPOINT FORMULA: Find the midpoint between (x1,y1) and (x2,y2)");
       System.out.println("Enter X1:");
       double x1 = input.nextDouble();
       System.out.println("Enter Y1:");
       double y1 = input.nextDouble();
       System.out.println("Enter X2:");
       double x2 = input.nextDouble();
       System.out.println("Enter Y2:");
       double y2 = input.nextDouble();
       OrderedPair pV1 = new OrderedPair(x1,y1);
       OrderedPair pV2 = new OrderedPair(x2,y2);
       OrderedPair answer = Formulas.findMidpoint(pV1,pV2);
       System.out.println("the answer is " + answer);
}
   public static void MyArthmeticSum(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.println("Finds the sum of an arithmetic series, where a is the first term, d is the difference between each term, and k is the number of terms.");
       System.out.println("Number of terms:");
       int k = input.nextInt();
       System.out.println("First term:");
       double a = input.nextDouble();
       System.out.println("Increases by");
       double d  = input.nextDouble();
       double answer = Formulas.findArithmeticSeriesSum(a,d,k);
       System.out.println("the answer is " + answer);
   }
   
   public static void MyGeometrySum(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.println(" Finds the sum of the first k terms in a geometric series, where a is the first term, r is the common ratio between terms, and k is the number of terms.");
       System.out.println("Number of terms:");
       int k = input.nextInt();
       System.out.println("First term:");
       double a = input.nextDouble();
       System.out.println("Common ratio:");
       double r = input.nextDouble();
       double answer = Formulas.findGeometricSeriesSum(a,r,k);
       System.out.println("The answer is " + answer);
   }
   
   public static void MyRoll(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.println("This is Dice");
       System.out.println("How many sides your dice have?");
       int sides = input.nextInt();
       int value = Formulas.rollDie(sides);
       System.out.println("You got " + value);
   }
}

