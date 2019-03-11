public class Hordy {
  Double a = 0.5, b = 1.9, eps = 0.001, tmp;
  public Double func(Double x)
  {
    return 2-Math.pow(x, 1.5)-2*Math.log(x);
  }
  public Double result(Double a, Double b)
  {
    return a-func(a)/(func(b)-func(a))*(b-a);
  }
  Double x1 = result(a, b);
  Double x2 = result(x1, b);
  public void init()
  {
    System.out.println("Решение уравнение методом Хорд");
    System.out.println("Локализовали корень на промежутке: ["+a+";"+b+"]");
    System.out.print("Корень уравнение равен: ");
  }
  public Double solving()
  {
    while(Math.abs(x1 - x2) > eps)
    {
      if(func(x1)*func(x2) < 0)
      {
        tmp = x1;
        x1 = x2;
        x2 = result(tmp, x1);
      }
    }
    return x2;
  }
}
