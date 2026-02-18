

 /* Q1. What are access modifiers in Java?  
Answer: 
They define the scope/visibility of classes, methods, and variables.  
Types: `private`, `default` (no modifier), `protected`, `public`.



 Q2. Explain each access modifier with full code.

1. private → accessible only inside the same class  
 */
// Example of private members
class DemoPrivate {
    private final int number = 10;   // private variable
    private void showMessage() {   // private method
        System.out.println("Private method called");
    }

    public static void main(String[] args) {
        DemoPrivate obj = new DemoPrivate();
        System.out.println(obj.number); // ✅ allowed inside same class
        obj.showMessage();              // ✅ allowed inside same class
    }
}
// Outside this class → ❌ not allowed


// 2. default (no modifier) → accessible only within the same package 

// Example of default members
class DemoDefault {
    int number = 20;   // default variable
    void showMessage() {   // default method
        System.out.println("Default method called");
    }
}

// Another class in SAME package
@SuppressWarnings("unused")
class TestDefault {
    public static void main(String[] args) {
        DemoDefault obj = new DemoDefault();
        System.out.println(obj.number); // ✅ allowed (same package)
        obj.showMessage();              // ✅ allowed
    }
}
// If in DIFFERENT package → ❌ not allowed




// 3. protected → accessible in same package + subclasses in other packages**  

// Example of protected members
class Parent {
    protected void showMessage() {
        System.out.println("Protected method called");
    }
}

class Child extends Parent {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.showMessage(); // ✅ allowed (subclass access)
    }
}




// 4. public → accessible everywhere**  

// Example of public members
public class AccessModifiers {
    public void showMessage() {
        System.out.println("Public method called");
    }

    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        obj.showMessage(); // ✅ allowed
    }
}
// Any other class/package → ✅ allowed


 /* Q3. Difference between `default` and `protected`?  
 
- default → accessible only within the same package.  
protected → accessible within the same package **and** by subclasses in other packages.  



Q4. Can a class be declared `private` or `protected`?  
 
Top-level class → only `public` or `default`.  
Inner classes → can be `private`, `protected`, or `public`.  



 Q5. Why are access modifiers important?  
 
- They enforce **encapsulation**.  
- Protect data from unwanted access.  
- Allow controlled exposure of methods/variables.  



 📌 Access Modifiers – Quick Reference Table

| Context                         | Default | Private | Protected | Public |
|---------------------------------|---------|---------|-----------|--------|
| Same Class                      | Yes     | Yes     | Yes       | Yes    |
| Same Package Subclass           | Yes     | No      | Yes       | Yes    |
| Same Package Non-Subclass       | Yes     | No      | Yes       | Yes    |
| Different Package Subclass      | No      | No      | Yes       | Yes    |
| Different Package Non-Subclass  | No      | No      | No        | Yes    |

 */