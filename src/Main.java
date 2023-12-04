import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);


/*Create object of the classes vara, rabbateradVara and kund.
* Values inside the parameters comes from the construct inside the Varaclass.
* */
          Vara myMask = new Vara("Mask: ", 199.0,  2);
          Vara myKnife = new Vara("Plastic knife: ", 89.50, 9);
          RabbateradVara myBlood = new RabbateradVara("Fake blood: ", 129.90, 12, 0.10);
          Kund kund = new Kund();


        //Creates a while loop so the menu continues after each choice is made.
        //Writes out the menu with system out print.

while(true) {

    System.out.printf("1: %s, %.2f SEK, %d Left\n", myMask.name, myMask.price, myMask.quantity);
    System.out.printf("2: %s, %.2f SEK, %d Left\n", myKnife.name, myKnife.price, myKnife.quantity);
    System.out.printf("3: %s, %.2f SEK, %d Left, 10 procent rabbat\n", myBlood.name, myBlood.getPrice(), myBlood.quantity);
    System.out.println("4: " + "Quit");

    //Scans input from user and uses an if statement to check what statement should run
    //Depending on which input user makes , we call upon that method
    int input = scan.nextInt();
    if (input == 1 && myMask.itemQuantity() >= 0){
        ;
        kund.itemsTotal(myMask);



    }
    else if(input == 2 && myKnife.itemQuantity() >= 0){

        kund.itemsTotal(myKnife);



    }
    else if (input == 3 && myBlood.itemQuantity() >=0){

        ;
        kund.itemsTotal(myBlood);

    }





    //If user input is 4, break loop and write out the number of items purchased and total sum of the price.
    //Calls upon the methods to show items and total sum in kund class
    else if(input == 4){
        System.out.println("Antal varor köpta: " + kund.getItems());
        System.out.println("Totala priset för köpta varor: " + kund.getTotalSum());
        break;


        //else statement to catch if user types wrong number
    }else{
        System.out.println("Ogiltligt val");
    }
}





    }
}