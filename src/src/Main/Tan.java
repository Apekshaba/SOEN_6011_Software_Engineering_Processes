package Main;

public class Tan {
    public static double tan(double angle) {
        double PI = 3.141592653589793;
        double radians = angle * PI / 180 ;

//        System.out.println(radians);

        double res = Tan.sin(radians)/Tan.cos(radians);

        return res;
    }

    public static double cos(double radians) {

        double cosX = 0.0;
        int pow2 = 0;

        for (int i = 0; i <= 15; i++) {
            double currentTerm = 0.0;
            if (i % 2 == 0) {
                currentTerm = Tan.power(radians, pow2) / getFact(pow2);
            } else {
                currentTerm = -Tan.power(radians, pow2) / getFact(pow2);
            }
            cosX = cosX + currentTerm;
            pow2 = pow2 + 2;
        }
 //       System.out.println(cosX);
        return cosX;
    }

    public static double sin(double radians) {
        int pow = 1;
        double sinX = 0.0;
        try{
            for (int i = 1; i <= 15; i++) {
                double currentTerm = 0.0;
                if (i % 2 == 0) {
                    currentTerm = -Tan.power(radians, pow) / getFact(pow);
                } else {
                    currentTerm = Tan.power(radians, pow) / getFact(pow);
                }
                sinX = sinX + currentTerm;
                pow = pow + 2;
            }
//            System.out.println(sinX);
            return sinX;
        }
        catch (Exception e) {
            e.printStackTrace();
        }

//        System.out.println(sinX);
        return sinX;
    }

    public static int getFact ( int pow){
        int fact = 1;
        try {
            for (int i = 1; i <= pow; i++) {
                fact = fact * i;
            }
            return fact;
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return fact;
    }


    public  static  double power(double radians, double exponent){
        double res = 1;
        try {
            while (exponent != 0) {
                res *= radians;
                --exponent;
            }
            return res;
        }
        catch (Exception e){
            System.out.println("Something went wrong!");
        }
        return res;
    }
}
