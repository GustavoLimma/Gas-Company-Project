import java.time.LocalTime;
import java.util.Random;

public class Order {

    Random random = new Random();
    private LocalTime hour;
    private String anddress;
    private int amount;
    private float total;
    private float unitprice;
    private int cardNumber;
    private String status;
    private int orderCode;
    
    public Order(String anddress) {
        this.hour = LocalTime.now();
        this.anddress = anddress;
        this.unitprice = 90;
        this.status = "Not paid";    
    }
    
    public void setRandom(Random random) {
        this.random = random;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setOrderCode(int orderCode) {
        this.orderCode = orderCode;
    }

    public Random getRandom() {
        return random;
    }

    public String getStatus() {
        return status;
    }

    public int getOrderCode() {
        return orderCode;
    }

    public void setUnitprice(float unitprice) {
        this.unitprice = unitprice;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public float getUnitprice() {
        return unitprice;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public LocalTime getHour() {
        return hour;
    }
    public String getAnddress() {
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
    public void setAnddress(String anddress) {
        this.anddress = anddress;
    }

    public void setAmount(int amount){
        this.amount = amount;
    }

    public void setTotal(){
        this.total = total;
    }

    public void PurchaseDate(){
        System.out.println("|================================|");
        System.out.println("Hours: " + hour);
        System.out.println("Address: " + anddress);
        System.out.println("|================================|");
    }

    public void data(){
            System.out.println("__________________________________");
            System.out.println("|          MY GAS COMPANY        |");
            System.out.println("|================================|");
            System.out.println("|-Unit value:" + unitprice + "                |");
            System.out.println("|-Amount: " + amount + "                      |");
            System.out.println("|-Total value:" + total + "              |");
            System.out.println("|-Delivery date: " + hour.plusHours(6) + "   |");
            System.out.println("|-Status: " + status + "                |");
            System.out.println("|-Form of payment: " + cardNumber + "                |");
            System.out.println("|-Order code: " + orderCode + "                |");
            System.out.println("|__________________________________|");
            if (hour.plusHours(6).isBefore(hour)) {
                System.out.println("Your order will be delivered tomorrow!");
            }
    }

    public void CalcTotal(){
        this.total = amount * unitprice;
    }

    public void Payment(int cardNumber){
        this.cardNumber = cardNumber;
        this.status = "confirmed";
        orderCode = random.nextInt(1000000); // Gera um número inteiro aleatório
    }

    public void ConfirmOrder() {
        this.status = "Delivered";
    }
    
}

