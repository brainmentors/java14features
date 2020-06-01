public class CallingRecord {
    public static void main(String[] args) {
        Customer ram = new Customer("Ram");
        //Customer ram= new Customer(1001, "Ram",9999);
        System.out.println(ram);
        System.out.println(Customer.getCount());
    }
}
