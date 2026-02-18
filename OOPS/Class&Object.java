/* Q1. What is the difference between a class and an object?
Answer:

Class → Blueprint/template that defines data (fields) and behavior (methods).

Object → Instance of a class, representing a real-world entity. */

class Student {
    int id;
    String name;

    // Constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Alice"); // object created
        System.out.println(s1.id);    // prints 101
        System.out.println(s1.name);  // prints Alice
    }
}


// Q2. How do you create objects in Java?
// Answer:  
// There are four main ways:

// Using new keyword (most common)

class Test {}
public class Main {
    public static void main(String[] args) {
        Test obj = new Test(); // ✅ object created
    }
}

// Using Reflection

class Student { public Student() {} }
public class Main {
    public static void main(String[] args) throws Exception {
        Class<?> c = Class.forName("Student");
        Student s = (Student) c.getDeclaredConstructor().newInstance();
        System.out.println("Object created: " + s);
    }
}

// Using clone() method


class Demo implements Cloneable {
    String name = "Clone Example";
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public static void main(String[] args) throws Exception {
        Demo d1 = new Demo();
        Demo d2 = (Demo) d1.clone(); // ✅ cloned object
        System.out.println(d2.name);
    }
}


// Using Deserialization



class Student implements Serializable {
    String name;
    Student(String name) { this.name = name; }
    public String toString() { return "Student: " + name; }
}

public class Main {
    public static void main(String[] args) throws Exception {
        // Serialize
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"));
        out.writeObject(new Student("Alice"));
        out.close();

        // Deserialize
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"));
        Student s = (Student) in.readObject();
        in.close();

        System.out.println(s); // prints Student: Alice
    }
}


/* Q3. What are the main components of an object?
Answer:

State → values stored in fields.

Behavior → actions defined by methods.

Identity → unique reference that distinguishes objects.

Q4. What is an anonymous object?
Answer:

Object created without a reference variable.

Used immediately for one-time operations. */

class Dog {
    String name;
    Dog(String name) { this.name = name; }
    void bark() { System.out.println(name + " is barking!"); }
}

public class Main {
    public static void main(String[] args) {
        new Dog("Max").bark(); // ✅ anonymous object
    }
}

/* Q5. Why are classes and objects important in Java?
Answer:

They implement OOP principles (encapsulation, abstraction).

Help model real-world entities.

Improve code reusability, readability, and maintainability.

✅ Placement Prep Tip:  
Interviewers usually ask:

Difference between class and object.

Ways to create objects in Java.

What is an anonymous object?

Components of an object (state, behavior, identity). */