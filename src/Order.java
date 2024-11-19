import java.time.LocalTime;

public class Order {
    private LocalTime hour;
    private String anddress;
    private int amount;
    private float total;
    
    public Order(String anddress) {
        this.hour = LocalTime.now();
        this.anddress = anddress;
    }

    public LocalTime getHour() {
        return hour;
    }
    public String getEnddress() {
        return anddress;
    }

    public int getAmount(){
        return amount;
    }

    public float getTotal(){
        return total;
    }

    public void setHour(LocalTime hour) {
        this.hour = hour;
    }
    public void setEnddress(String anddress) {
        this.anddress = anddress;
    }

    public void setAmount(int amount){
        this.amount = amount;
    }

    public void setTotal(){
        this.total = total;
    }

    public void data(){
        System.out.println("|================================|");
        System.out.println("Hours: " + hour);
        System.out.println("Address: " + anddress);
        System.out.println("|================================|");
    }

    public void alterAddress(String address){
        this.anddress = anddress;
    }

    public void PurchaseDate(){
            System.out.println("__________________________________");
            System.out.println("|          MY GAS COMPANY        |");
            System.out.println("|================================|");
            System.out.println("|-Unit value: R$90,00            |");
            System.out.println("|-Amount: " + amount + "           |");
            System.out.println("|-Delivery date: " + hour.plusHours(6) + " |");
            System.out.println("|__________________________________|");
            if (hour.plusHours(6).isBefore(hour)) {
                System.out.println("Your order will be delivered tomorrow!");
            }
    }
}

