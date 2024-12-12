public class Menu {
    public static void menu(){ // draw the menu
            System.out.println("__________________________________");
            System.out.println("|          MY GAS COMPANY        |");
            System.out.println("|================================|");
            System.out.println("|-------------*MENU*-------------|");
            System.out.println("|================================|");
            System.out.println("|-1 Place Order------------------|");
            System.out.println("|-2 Confirm Order----------------|");
            System.out.println("|-3 Open Orders------------------|");
            System.out.println("|-4 Orders Delivered-------------|");
            System.out.println("|-5 Close------------------------|");
            System.out.println("|================================|");
            System.out.println("|    THANKS FOR THE PURCHASE     |");
            System.out.println("|________________________________|");
    }
    
    public static void clear(){
        System.out.println("\033[H\033[23");
        System.out.flush();
    }

}


