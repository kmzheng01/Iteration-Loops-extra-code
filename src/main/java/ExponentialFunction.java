public class ExponentialFunction {
    public static double eToThe(double x, double EPSILON) {
        double term = 1.0;
        double sum = term;
        int n = 1;

        while (Math.abs(term) > EPSILON) {
            term *= x / n;
            sum += term;
            n++;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(eToThe(5, 1e-10));
        System.out.println(eToThe(13, 1e-10));
        System.out.println(eToThe(9, 1e-10));
        System.out.println(eToThe(12, 1e-10));
        System.out.println(eToThe(33, 1e-10));
    }
}