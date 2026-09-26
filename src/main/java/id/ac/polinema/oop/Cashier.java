package id.ac.polinema.oop;

public class Cashier {
  public double calculateChange(Order order, double cash){
    if (order != null){
      double total = order.getTotal();
      return cash - total;
    }
    return cash;
  }
}
