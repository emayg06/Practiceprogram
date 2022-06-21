class AmountDue{
  
   public double computeAmountDue (double price)
   {
    double prices = (price * 0.12)+ price;
    return prices;
   }
	
   public double computeAmountDue (double price, double quantity)
   {
     double item = price *  quantity;
     double prices = (price * 0.12)+ item;
     return prices;
   }
  
   public double computeAmountDue (double price, double quantity, double discount)
   {
     double item = price * quantity;
     double discountAmount = item - discount;
     double prices = discountAmount + (price * 0.12);
     return prices;
   }
   


}