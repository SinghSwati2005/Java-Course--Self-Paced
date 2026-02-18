/* 
Java Constructors – Placement Prep Notes

Q1. What is a constructor in Java?
- Special method called when an object is created.
- Same name as the class.
- No return type (not even void).
- Used to initialize object state.
*/

/* ---------------- Default Constructor ---------------- */
class DemoDefault {
    // Default constructor
    DemoDefault() {
        System.out.println("Default constructor called");
    }

    public static void main(String[] args) {
        DemoDefault obj = new DemoDefault(); // invokes default constructor
    }
}
/* 
Output:
Default constructor called
*/

/* ---------------- Parameterized Constructor ---------------- */
class Student {
    String name;
    int id;

    // Parameterized constructor
    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void display() {
        System.out.println("Name: " + name + ", ID: " + id);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alice", 101); // invokes parameterized constructor
        s1.display();
    }
}
/* 
Output:
Name: Alice, ID: 101
*/

/* ---------------- Copy Constructor ---------------- */
class StudentCopy {
    String name;
    int id;

    // Parameterized constructor
    StudentCopy(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Copy constructor
    StudentCopy(StudentCopy other) {
        this.name = other.name;
        this.id = other.id;
    }

    public static void main(String[] args) {
        StudentCopy s1 = new StudentCopy("Alice", 101);
        StudentCopy s2 = new StudentCopy(s1); // invokes copy constructor

        System.out.println("Original: " + s1.name + ", " + s1.id);
        System.out.println("Copied: " + s2.name + ", " + s2.id);
    }
}
/* 
Output:
Original: Alice, 101
Copied: Alice, 101
*/

/* ---------------- Private Constructor ---------------- */
class Utility {
    // Private constructor
    private Utility() {
        System.out.println("Private constructor called");
    }

    // Static method
    public static void showMessage() {
        System.out.println("Hello from Utility class!");
    }
}

public class MainPrivate {
    public static void main(String[] args) {
        // Utility obj = new Utility(); ❌ not allowed
        Utility.showMessage(); // ✅ accessed via static method
    }
}
/* 
Output:
Hello from Utility class!
*/

/* ---------------- Constructor Overloading ---------------- */
class StudentOverload {
    // Constructor with one argument
    StudentOverload(String name) {
        System.out.println("Name: " + name);
    }

    // Constructor with two arguments
    StudentOverload(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Constructor with different type
    StudentOverload(long id) {
        System.out.println("ID: " + id);
    }

    public static void main(String[] args) {
        StudentOverload s1 = new StudentOverload("Alice");
        StudentOverload s2 = new StudentOverload("Bob", 22);
        StudentOverload s3 = new StudentOverload(12345L);
    }
}
/* 
Output:
Name: Alice
Name: Bob, Age: 22
ID: 12345
*/

/* 
Q2. Difference between Constructor and Method
Constructor:
- Same name as class
- No return type
- Called automatically when object is created
- Used to initialize object

Method:
- Any name
- Must have return type
- Called explicitly
- Used to define behavior
*/

/* 
Q3. Common Interview Questions
1. Why doesn’t a constructor have a return type?
   → Because it implicitly returns the newly created object.
2. What happens if you don’t define any constructor?
   → Compiler provides a default no-argument constructor.
3. Can constructors be overloaded?
   → Yes, multiple constructors with different parameter lists are allowed.
4. Can a constructor be private?
   → Yes, used in Singleton and utility/helper classes.
5. Is copy constructor built-in in Java?
   → No, unlike C++, we must define it manually.
*/
