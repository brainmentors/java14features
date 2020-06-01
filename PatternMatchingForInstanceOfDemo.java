public class PatternMatchingForInstanceOfDemo {
    public static void main(String[] args) {
        String object = "Java 14 features by brain mentors";
        // Now i want to print on upper case
//        if(object instanceof  String){
//            String str =(String) object ; // Downcast it
//            System.out.println(str.toUpperCase());
//        }
        // New Way Java 14 Style
        if(object instanceof String msg){
            System.out.println(msg.toUpperCase());
        }
    }
}
