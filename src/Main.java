public class Main {
  public static void main(String[] args)
  {
    Newtone newtone = new Newtone();
    newtone.init();
    System.out.format("%.3f\n", newtone.solving());
    Hordy hordy = new Hordy();
    hordy.init();
    System.out.format("%.3f\n", hordy.solving());
  }
}
