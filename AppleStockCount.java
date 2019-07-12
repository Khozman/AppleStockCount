public class AppleStockCount {
  public static void main(String[] args) {


    //Check whether an argument is present...
    if (args.length == 0) {
        System.out.println("Please give me a qty!");
        return;
    }

    //Check the number of arguments given...
    if (args.length > 1){
    	System.out.println("Please put in one number with no spaces inbetween, eg (1,99 or 100)");
	return;
    }

    //variable declaration...
    int qty = Integer.parseInt(args[0]);
    double cost = 4.50;
    double total;

    if (qty < 1) {
        System.out.println("Out of stock.");
    }
    else {
      total = qty * cost;

      StringBuilder message = new StringBuilder();
      message.append("You have bought ");

      if(qty % 12 == 0){
	
	int counter = qty / 12;
        	
	if(counter == 1){
      		message.append("a dozen");
      } else {
      	message.append(counter);
	message.append(" dozens");
      }

      } else{
      	message.append(qty);
      }
      message.append(" apple");
      if (qty > 1) {
        message.append("s");
      }
      message.append(" for a total cost of R");
      message.append(total);
      
      //Output with the total... 
      System.out.println(message.toString());

    }

  }
}
