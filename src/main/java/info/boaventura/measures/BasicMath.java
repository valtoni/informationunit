package info.boaventura.measures;

public final class BasicMath {

  public static double log(double n, double b) {
    if (n == 0)
      return 0;
    return Math.log(n) / Math.log(b);
  }

  public static double log2(double n) {
    return log(n, 2);
  }

  public static double log10(double n) {
    return log(n, 10);
  }

  public static double loge(double n) {
    return Math.log(n);
  }

  public static void main(String[] args) {
    System.out.println(log(1000, 1000));
    System.out.println(log(1000000, 1000));
    System.out.println(log(1000000000, 1000));
  }

  public static double mdc(double a, double b) {
    while (b != 0) {
      double r = a % b;
      a = b;
      b = r;
    }
    return a;
  }

  public static double mmc(double a, double b) {
    return a * (b / mdc(a, b));
  }

}
