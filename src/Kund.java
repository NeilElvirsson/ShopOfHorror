public class Kund {

    //initiate variables
    int items;
    double totalSum;


    public void Kund() {
        items = 0;
        totalSum = 0;


    }
    //Methods to return item and totalsum

    public int getItems() {

        return items;

    }

    public double getTotalSum() {
        return totalSum;
    }

    //Method to count the amount of items
        public void itemsTotal(Vara vara) {
            items = items + 1;
            totalSum = totalSum + vara.getPrice();



    }






}
