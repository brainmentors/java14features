public class SwitchExpressionDemo {
    public static void main(String[] args) {
        // New Switch Expression in Java 14
        String dish = "drink";
        // Let's convert it into switch expression
        String result = switch (dish){
            case "pizza","burger","hamburger"-> // Multi cases
                "Buy One and Get One Free";


            case "drink"-> {
                int price = 100;
                String msg = "Pepsi Free of 200 ml with "+price;
                yield (msg); // Acting as a return statement
            }

            default->
                "Not Here Out of Stock";
        };
        System.out.println(result);
    }
}
