public record Customer(int id, String name, double balance) {
    static int count;
    public static int getCount(){
        return count;
    }
    // Compact Constructor/ Default Constructor
//    public Customer{
//        System.out.println("I am Default Cons");
//        count++;
//    }
    // Canonical Constructor / Parameterized Constructor
//    public Customer(int id, String name, double balance){
//        this.id = id;
//        this.name = name;
//        this.balance = balance;
//        count++;
//        System.out.println("Canonical Constructor Call");
//    }
    // Custom Constructor
    public Customer(String name){
        this(1001, name,9999);
    }

}
