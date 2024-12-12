//import
import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayList<Order> orders = new ArrayList<Order>();
        Scanner scanner = new Scanner(System.in);
        int opc;
        String address;
        boolean close = false;
        String confirm;
        int amount;
        int cardNumber;
        int search;
    
        do{ 
            Menu.menu();

            opc = Integer.parseInt(scanner.nextLine());

            switch (opc) {
                case 1:
                System.out.println(" Enter an address: ");
                address = scanner.nextLine();
                System.out.println("----------------------------------");;
                Order newOrder = new Order(address);
                newOrder.PurchaseDate();
                System.out.println("Confirm? (Y/N): ");
                confirm = scanner.nextLine().toUpperCase();

                while (confirm.equals("N")) {
                    System.out.println(" Enter an new address: ");
                    address = scanner.nextLine();
                    newOrder.setAnddress(address);
                    newOrder.PurchaseDate();  
                    System.out.println("Confirm? (Y/N): ");
                    confirm = scanner.nextLine().toUpperCase();  
                }
            
                System.out.println(" Enter an amount: ");
                amount = Integer.parseInt(scanner.nextLine());
                
                newOrder.setAmount(amount);
                newOrder.CalcTotal();

                newOrder.data();

                System.out.println("Enter your card number: ");
                cardNumber = Integer.parseInt(scanner.nextLine());
                newOrder.Payment(cardNumber);
                newOrder.data();
                orders.add(newOrder);
                    break;

                case 2:
                System.out.println("Enter the order code: ");
                search = Integer.parseInt(scanner.nextLine());
                boolean found = false;
            
                for (Order order : orders) { // Corrigido para usar "order"
                    if (order.getOrderCode() == search) { // Adicionado parênteses
                        found = true;
                        order.ConfirmOrder(); // Atualiza o status para "Delivered"
                        System.out.println("Order status updated to 'Delivered'.");
                        order.data(); // Mostra os dados atualizados
                        break; // Encerra o loop após encontrar
                    }
                }
            
                if (!found) {
                    System.out.println("Order with code " + search + " not found.");
                }
                    break;
                case 3:
                System.out.println("Confirmed Orders:");
                for (Order order : orders) {
                    if (order.getStatus().equals("confirmed")) {
                        order.data();
                    }
                }
                    break;
                case 4:
                System.out.println("Delivered Orders:");
                    for (Order order : orders) {
                        if (order.getStatus().equals("Delivered")) {
                            order.data();
                        }
                    }
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

        scanner.close();
    }
}
