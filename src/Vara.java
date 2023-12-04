public class Vara {
//Class vara
     String name;
    double price;
    int quantity;
//Construct for variables name,price and quantity

    public Vara(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }
    //Gets the price amount

    public double getPrice(){
        return price;
    }

//Method to check if quantity is greater or equal to 0
    // else it writes out: item is not available
    public int itemQuantity() {
        if (quantity >= 0) {
            quantity = quantity - 1;
        } else{
                System.out.println("Varan är inte tillgänlig!");
            }


            return quantity;
    }
}
