public class Main {
    public static final double A = 4.5;
    public static final double B = 23;
    public static final double M = 87;

    public static Integer LENGTH_SEQUENCY = 100;

    public static void main(String[] args) {
        Double[] y = new Double[LENGTH_SEQUENCY + 1]; //Псевдослучайная последовательность
        y[0] = 3.0;
        for (int i = 1; i < y.length; i++)
            y[i] = (A * y[i - 1] + B) % M;

        System.out.println("Псевдослучайная последовательность:");
        for(Double number : y)
            System.out.println(number);

        Double[] z = new Double[LENGTH_SEQUENCY]; //Равномерно распределенные числа на (0, 1)
        for (int i = 0; i < LENGTH_SEQUENCY; i++)
            z[i] = y[i + 1] / (M - 1);

        System.out.println("\nРавномерно распределенные числа на (0, 1):");
        for(Double number : z)
            System.out.println(number);

        Double[] UniformLawNumbers = DistributionLaws.UniformLaw(3.0, 7.0, z); //Случайные величины, распределенные по равномерному закону на интервале [3, 7]
        System.out.println("\nСлучайные величины, распределенные по равномерному закону на интервале [3, 7]:");
        for(Double number : UniformLawNumbers)
            System.out.println(number);

        Double[] ExponentialLawNumbers = DistributionLaws.ExponentialLaw(8.0, z); //Случайные величины, распределенные по показательному закону с lambda = 8
        System.out.println("\nСлучайные величины, распределенные по показательному закону с lambda = 8:");
        for(Double number : ExponentialLawNumbers)
            System.out.println(number);

        Double[] RayleighLawNumbers = DistributionLaws.RayleighLaw(3.0, z); //Случайные величины, распределенные по закону Релея со стандартным отклонением 3
        System.out.println("\nСлучайные величины, распределенные по закону Релея со стандартным отклонением 3:");
        for(Double number : RayleighLawNumbers)
            System.out.println(number);

        //Случайная величина смоделированная по нормальному закону с мат. ожиданием 1 и дисперсией 9. Сумма по первым 12 членам последовательности
        double x = DistributionLaws.NormalDistribution(1.0, 9.0, 12, z);
        System.out.println("\nСлучайная величина смоделированная по нормальному закону с мат. ожиданием 1 и дисперсией 9. Сумма по первым 12 членам последовательности: " + x);
    }
}
