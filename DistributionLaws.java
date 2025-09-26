public class DistributionLaws {
    public static Double[] UniformLaw (Double a, Double b, Double[] z) {
        Double[] x = new Double[z.length];

        for (int i = 0; i < x.length; i++)
            x[i] = (b - a) * z[i] + a;

        return x;
    }

    public static Double[] ExponentialLaw (Double lambda, Double[] z) {
        Double[] x = new Double[z.length];

        for (int i = 0; i < x.length; i++)
            x[i] = -1 * (Math.log(z[i]) / lambda);

        return x;
    }

    public static Double[] RayleighLaw (Double standardDeviation, Double[] z) {
        Double[] x = new Double[z.length];

        for (int i = 0; i < x.length; i++)
            x[i] = -2 * standardDeviation * Math.log(z[i]);

        return x;
    }

    public static double NormalDistribution (Double expectedValue, Double variance, int n, Double[] z) {
        double sum = 0.0;

        for (int i = 0; i < n; i++)
            sum += z[i] - 0.5;
        return Math.sqrt(variance) * Math.sqrt(12.0 / n) * sum + expectedValue;
    }
}
