//import
import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        Menu menu = new Menu();
        ArrayList<Order> orders = new ArrayList<Order>();
        Scanner scanner = new Scanner(System.in);
        int opc;
        String address;
        boolean close = false;
        String confirm;
        int amount;
    
        do{ 
            menu.menu();

            opc = Integer.parseInt(scanner.nextLine());

            switch (opc) {
                case 1:
                System.out.println(" Enter an address: ");
                address = scanner.nextLine();
                System.out.println("----------------------------------");;
                Order newOrder = new Order(address);
                newOrder.data();
                System.out.println("Confirm? (Y/N): ");
                confirm = scanner.nextLine().toUpperCase();

                while (confirm.equals("N")) {
                    System.out.println(" Enter an new address: ");
                    address = scanner.nextLine();
                    newOrder.alterAddress(address);
                    newOrder.data();  
                    System.out.println("Confirm? (Y/N): ");
                    confirm = scanner.nextLine().toUpperCase();  
                }
            
                System.out.println(" Enter an amount: ");
                amount = Integer.parseInt(scanner.nextLine());
                newOrder.setAmount(amount);
                
                newOrder.PurchaseDate();;
                
                orders.add(newOrder);

                
                    break;

                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    close=true;
                    break;
                default:
                System.out.println("__________________________________");
                System.out.println("|          Invalid Opition       |");
                System.out.println("|================================|");
                    break;
            }
        }while(!close);
    }
}
