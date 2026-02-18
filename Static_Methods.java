/* 📌 Static Methods in Java – Quick Notes
Definition
Declared with the static keyword.

Belong to the class, not to any specific object.

Invoked using ClassName.methodName().

Key Features
Can access static variables directly.

Cannot access instance variables/methods directly.

Can be called in both static and non-static contexts.

this and super are not allowed inside static methods.

access_modifier static return_type methodName() {
    // method body
} */


/* Examples
1. Static method cannot access instance variables */


class Geeks {
    static int a = 40;   // static variable
    int b = 50;          // instance variable

    void simpleDisplay() {
        System.out.println(a);
        System.out.println(b);
    }

    static void staticDisplay() {
        System.out.println(a); // only static variable accessible
    }

    public static void main(String[] args) {
        Geeks obj = new Geeks();
        obj.simpleDisplay();   // prints 40, 50
        staticDisplay();       // prints 40
    }
}


// 2. Static methods accessed from both static & non-static methods

class Geekss {
    static int num = 100;
    static String str = "GeeksForGeeks";

    static void display() {
        System.out.println("Static number: " + num);
        System.out.println("Static string: " + str);
    }

    void nonstatic() {
        display(); // static method called inside non-static
    }

    public static void main(String[] args) {
        Geekss obj = new Geekss();
        obj.nonstatic(); // via object
        display();       // directly
    }
}

/* Why Use Static Methods?
To access/modify static variables.

For utility/helper classes (e.g., Math.sqrt(), Collections.sort()).

Restrictions
Cannot use non-static members directly.

Cannot call non-static methods without an object.

Cannot use this or super.

Why is main() Static?
JVM calls main() without creating an object.

If it were non-static, JVM would need to instantiate the class first → inefficient.

Difference: Static vs Instance Methods
Instance Method                 	Static Method
Needs object	                No object needed
Can access all attributes	          Can access only static attributes
Called via object reference	               Called via class name
Syntax: obj.method()	            Syntax: ClassName.method()


✅ Placement Prep Tip:
Interviewers often ask:

Why main() is static?

Can static methods access instance variables?

Difference between static and instance methods.

Examples of static methods in Java libraries (Math, Collections). */


