public class Main{
    public static void main(String[] args) {
        fraction f1 = new fraction(25, 35);
	System.out.println(f1.toString());
	fraction f2 = new fraction(2, 7);
	fraction f3 = f1.add(f2);
	System.out.println("Result of addition of " 
                      + f1 + " and " + f2 + " is : " + f3);
	f3 = f1.subtract(f2);
	System.out.println("Result of subtraction of " 
                      + f1 + " and " + f2 + " is : " + f3);
	f3 = f1.divide(f2);
	System.out.println("Result of division of " 
                      + f1 + " and " + f2 + " is : " + f3);
	f3 = f1.multiply(f2);
	System.out.println("Result of multiplication of " 
                      + f1 + " and " + f2 + " is : " + f3);
    }
    }
