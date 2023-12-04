public class RabbateradVara extends Vara{
//initiate variable rabbat
    double rabbat;

    //Class that takes parameters name,price,quantity and rabbat.

    public RabbateradVara(String name, double price, int quantity, double rabbat){
//Calls the construct of the superclass
        super(name, price, quantity);
        //intializes the rabbat instance variable
        this.rabbat = rabbat;

    }
//This class overrides the getprice method from its superclass vara
    @Override
    public double getPrice() {
        //Calls the original price to give it a  discount then returns it
        return super.getPrice() * (1 - rabbat);
    }
}

