public class Newtone {
  Double a = 0.5, b = 1.9, x0 = 1.28, eps = 0.001;
  public Double func(Double x)
  {
    return 2-Math.pow(x, 1.5)-2*Math.log(x);
  }
  public Double func_1(Double x)
  {
    return -1.5*Math.sqrt(x) - 2/x;
  }
  public Double result(Double x)
  {
    return x-func(x)/func_1(x);
  }
  Double x1 = result(x0);
  public void init()
  {
    System.out.println("Решение уравнение методом Ньютона");
    System.out.println("Локализовали корень на промежутке: ["+a+";"+b+"]");
    System.out.println("x0 = "+x0);
    System.out.print("Корень уравнение равен: ");
  }
  public Double solving()
  {
    while (Math.abs(x1 - x0) > eps)
    {
      x0 = x1;
      x1 = result(x0);
    }
    return x1;
  }
}
