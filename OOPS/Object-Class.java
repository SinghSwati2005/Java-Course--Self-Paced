/* 
Object Class in Java – Placement Prep Notes

Q1. What is Object class in Java?
- Root of the Java class hierarchy (in java.lang).
- Every class directly or indirectly extends Object.
- Provides essential methods: toString(), equals(), hashCode(), clone(), getClass(), finalize(), wait(), notify(), notifyAll().
- Supports comparison, hashing, debugging, cloning, and thread communication.
*/

/* ---------------- Example: toString() and hashCode() ---------------- */
class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    // Override toString for custom representation
    @Override
    public String toString() {
        return "Person{name:'" + name + "'}";
    }

    public static void main(String[] args) {
        Person p = new Person("Geek");
        System.out.println(p.toString());   // custom string
        System.out.println(p.hashCode());   // default hash code
    }
}
/* 
Output:
Person{name:'Geek'}
321001045

Explanation:
- toString() overridden to give readable string.
- hashCode() prints default hash value of object.
*/

/* ---------------- 1. toString() Method ---------------- */
class Student {
    String name = "Vishnu";
    int age = 21;

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.toString()); // calls overridden toString
    }
}
/* 
Output:
Student{name='Vishnu', age=21}

Explanation:
- toString() gives human-readable string instead of default memory address.
*/

/* ---------------- 2. hashCode() Method ---------------- */
class Employee {
    int id = 101;

    @Override
    public int hashCode() {
        return id * 31; // custom hash
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println(e.hashCode());
    }
}
/* 
Output:
3131

Explanation:
- hashCode() returns integer used in hashing collections.
- If two objects are equal, they must have same hashCode.
*/

/* ---------------- 3. equals(Object obj) Method ---------------- */
class Book {
    String title;

    Book(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object obj) {
        Book b = (Book) obj;
        return this.title.equals(b.title);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java");
        Book b2 = new Book("Java");
        System.out.println(b1.equals(b2)); // true
    }
}
/* 
Output:
true

Explanation:
- equals() compares content instead of reference.
- Must override for custom equality logic.
*/

/* ---------------- 4. getClass() Method ---------------- */
public class Geeks {
    public static void main(String[] args) {
        Object o = new String("GeeksForGeeks");
        Class c = o.getClass();
        System.out.println("Class of Object o is: " + c.getName());
    }
}
/* 
Output:
Class of Object o is: java.lang.String

Explanation:
- getClass() returns runtime class of object.
*/

/* ---------------- 5. finalize() Method ---------------- */
public class DemoFinalize {
    public static void main(String[] args) {
        DemoFinalize t = new DemoFinalize();
        System.out.println(t.hashCode());

        t = null;
        System.gc(); // request garbage collector

        System.out.println("end");
    }

    @Override
    protected void finalize() {
        System.out.println("finalize method called");
    }
}
/* 
Output:
1510467688
end
finalize method called

Explanation:
- finalize() runs before object is destroyed.
- Used for cleanup, but discouraged in modern Java.
*/

/* ---------------- 6. clone() Method ---------------- */
class StudentClone implements Cloneable {
    int id = 1;
    String name = "Vishnu";

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // shallow copy
    }

    public static void main(String[] args) throws Exception {
        StudentClone s1 = new StudentClone();
        StudentClone s2 = (StudentClone) s1.clone();

        System.out.println(s1.name); // Vishnu
        System.out.println(s2.name); // Vishnu
    }
}
/* 
Output:
Vishnu
Vishnu

Explanation:
- clone() creates copy of object.
- Must implement Cloneable interface.
*/

/* ---------------- 7. Concurrency Methods ---------------- */
/* 
wait(), notify(), notifyAll() are used in multithreading for communication:
- wait(): makes thread wait until notified.
- notify(): wakes up one waiting thread.
- notifyAll(): wakes up all waiting threads.
*/

/* 
Q2. Common Interview Questions
1. Why is Object class important?
   → It is the root of all classes and provides default implementations for essential methods.
2. Difference between == and equals()?
   → == compares references, equals() compares content (when overridden).
3. Why override hashCode() when overriding equals()?
   → To maintain consistency in hash-based collections (HashMap, HashSet).
4. What does getClass() return?
   → Runtime class of the object.
5. Why is finalize() discouraged?
   → Unpredictable execution, modern Java uses try-with-resources instead.
6. What is clone() in Java?
   → Creates a shallow copy of object; requires Cloneable interface.
7. What are wait(), notify(), notifyAll() used for?
   → Thread communication in concurrency.
*/
