public class Day02_Zoho_Questions {

    1. What is a variable in Java?
     A variable is a container used to store data values in memory.

    2. Why must every variable have a data type in Java?
     Data type specifies the type and size of data and ensures type safety.

     3. What happens if we use a variable without initialization?
     Local variables cause compile-time error.
     Instance and static variables get default values.

     4. Difference between declaration and initialization?
     Declaration: int a;
     Initialization: a = 10;

     5. Can two variables have the same name?
     Yes, in different scopes (local vs instance), not in the same scope.

     6. What are primitive data types in Java?
     byte, short, int, long, float, double, char, boolean

     7. Why is int preferred over float for counting?
     int is precise, float may cause rounding errors.

     8. When should you use long instead of int?
     When value exceeds int range (±2,147,483,647).

     9. Why is double preferred over float in Java?
     double provides more precision and accuracy.

     10. What is the size of char in Java and why?
     char is 2 bytes because Java uses Unicode.

     11. What is type casting?
     Converting one data type into another.

     12. What is implicit casting? Give example.
     Automatic conversion from smaller to larger type.
     Example: int → double

     13. What is explicit casting? Give example.
     Manual conversion from larger to smaller type.
     Example: double → int

     14. What problem occurs during narrowing casting?
     Data loss may occur.

     15. Why is casting important in real-world applications?
     Used while handling user input, calculations, and APIs.

     16. Difference between = and == ?
     = assigns value, == compares values.

     17. What is the output of:
     int a = 10, b = 20; System.out.println(a + b);
    Output: 30

     18. How to get decimal result for 10/3?
     Use type casting or double.
     Example: 10.0 / 3

     19. What is the use of % operator?
   Finds remainder of division.

     20. Difference between && and || ?
     && returns true if both conditions are true.
    || returns true if any one condition is true.

     21. What is short-circuit evaluation?
     Second condition is not checked if result is already known.

     22. Why do we use if-else statements?
     To make decisions based on conditions.

     23. When should we prefer switch over if-else?
     When comparing same variable with multiple values.

     24. What happens if we forget break in switch?
     All cases execute after matched case (fall-through).

     25. Write logic to check voting eligibility (age ≥ 18).
    public static void main(String[] args) {

        int age = 20;

        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }

        // Implicit casting example
        int a = 10;
        double b = a;
        System.out.println(b);

        // Explicit casting example
        double x = 9.8;
        int y = (int) x;
        System.out.println(y);

        // Decimal division
        System.out.println(10.0 / 3);

        // Modulus operator
        System.out.println(10 % 3);
    }
}
