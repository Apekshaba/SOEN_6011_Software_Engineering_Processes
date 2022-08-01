package Main;

public class Util {

    public static boolean inValidRange(double x){
        boolean valid = false;
        if (x<=Double.MAX_VALUE && x>=-Double.MAX_VALUE){
           valid=true;
        }
        return valid;
    }
}
