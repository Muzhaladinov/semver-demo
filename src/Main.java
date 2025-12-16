public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        greetUser("User");
    }

    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }
public static void greetUser(String name) {
    if (name == null || name.isBlank()) {
        name = "Guest";
    }
    System.out.println("Hello, " + name + "!");
    }
public static void timeGreeting() {
    int hour = java.time.LocalTime.now().getHour();
    if (hour < 12) {
        System.out.println("Good morning!");
    } else {
        System.out.println("Good evening!");
    } 
   }   
}
