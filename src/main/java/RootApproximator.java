public class RootApproximator {
    public static double approximateRoot(double a, double MAXEPSILON) {
        double x = 1;
        
        if (a < 0) {
            throw new IllegalArgumentException("Cannot calculate the square root of a negative");
        }
        if (a == 0) {
            return 0;
        }

        while (Math.abs(a/x - x) > MAXEPSILON) {
            x = (x  + a / x) / 2;
            System.out.println(String.format("Guess: %f, %f/Guess: %f, Epsilon: %f", x, a, a/x, a/x - x));
        }
        return x;
    }

    public static double approximateRoot(double a) {
        double MAXEPSILON = 0.000000000000001;
        double x = 1;
        
        if (a < 0) {
            throw new IllegalArgumentException("Cannot calculate the square root of a negative");
        }
        if (a == 0) {
            return 0;
        }

        while (Math.abs(a/x - x) > MAXEPSILON) {
            x = (x  + a / x) / 2;
            System.out.println(String.format("Guess: %f, %f/Guess: %f, Epsilon: %f", x, a, a/x, a/x - x));
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println(approximateRoot(115, 0.0001));
    }
}