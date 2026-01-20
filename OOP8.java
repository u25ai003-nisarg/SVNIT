package OOPs.L2;

class list
{
  String part;
  String description;
  int quantity;
  double price;
  public list(String part,String description,int quantity,double price)
  {
        this.part = part;
        this.description=description;
        this.quantity=quantity;
        this.price=price;
  }
  void getInvoiceAmount(int quantity,double price)
  {
      System.out.println("invoice amount :" + (double)quantity*price);
  }
}

public class OOP8 {
   public static void main()
   {
       list l1 = new list("abcde","hello",12,899);
       System.out.println(l1.part);
       System.out.println(l1.description);
       System.out.println(l1.quantity);
       System.out.println(l1.price);
       l1.getInvoiceAmount(l1.quantity,l1.price);
   }
}
