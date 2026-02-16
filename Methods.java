// A method is a block of code which only runs when it is called.


//Method Overloading
//With method overloading, multiple methods can have the same name with different parameters:

static int plusMethod(int x, int y) {
  return x + y;
}

static double plusMethod(double x, double y) {
  return x + y;
}

public static void main(String[] args) {
  int myNum1 = plusMethod(8, 5);
  double myNum2 = plusMethod(4.3, 6.26);
  System.out.println("int: " + myNum1);
  System.out.println("double: " + myNum2);
}



//Java Scope
//In Java, variables are only accessible inside the region where they are created. This is called scope.

//Variables declared inside a method are only accessible within that method:

// public class Methods {
//   public static void main(String[] args) {

//     // Code here CANNOT use x

//     int x = 100;

//     // Code here CAN use x
//     System.out.println(x);
//   }
// }


// //Block Scope
// A block of code refers to all of the code between curly braces { }.

// Variables declared inside a block of code are only accessible by the code between the curly braces, and only after the line in which the variable was declared:

public class Methods {
  public static void main(String[] args) {

    // Code here CANNOT use x

    {
      // Code here CANNOT use x

      int x = 100;

      // Code here CAN use x
      System.out.println(x);
    }

    // Code here CANNOT use x
  }
}