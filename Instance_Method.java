/* An instance method belongs to an object of a class and requires an instance to be called. It can access and modify the object’s instance variables and can also call other instance or static methods.

Can access and modify instance variables (object state).
Can accept parameters and return a value.
Can call other instance methods or static methods.
Supports encapsulation and object-oriented design.
Follows the divide-and-conquer principle in larger applications.*/

class Person{
    String name = "Swati";

    void  greet(){
        System.out.println("Hello, " +name +"!");
        
    }

    public static void main(String[] args){
        Person p1 = new Person();
        p1.greet();

    }
}
// o/p hello Swati!

//Instance method with a parameter

//import java.io.*;
class GFG{
    //static method 
    public static void main(String[] args){
        GFG obj = new GFG();
        obj.add(2,3);
        System.out.println("GFG");

    }

    void add(int a, int b){
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }
}
//Types of Instance methods in javav


/*1. Accessor Methods ( Getter)
2. Mutator Methods ( Setter)

1. Accessor Methods (Getters)
Getter methods are used to retrieve the value of a private instance variable. They provide controlled access to object data without allowing modification.
 */ 

class Aaccount {
    private final int balance = 100;
    //getter
    public int getBalance(){
        return balance;
    }

    public static void main(String[]args){
        Aaccount acc = new Aaccount();
        System.out.println("Balance: " + acc.getBalance());
        //calling getter method to access private variable balance
    }
}

//o/p Balance: 100


//Mutator Methods (Setters)
//Setter methods are used to modify the value of a private instance variable. They allow controlled modification of object data while maintaining encapsulation.

class Account {
    private int balance = 100;

    // Mutator method (setter)
    public void setBalance(int amount)
    {
        balance += amount;
    }

    public int getBalance() { return balance; }

    public static void main(String[] args)
    {
        Account acc = new Account();
        acc.setBalance(50); // Updating balance
        System.out.println(
            "Balance: "
            + acc.getBalance()); // Calling getter
    }
}


