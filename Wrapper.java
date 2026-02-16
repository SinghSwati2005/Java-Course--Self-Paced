// //📝 Key Interview Notes on Wrapper Classes
// 1. What are Wrapper Classes?
// They wrap primitives into objects (e.g., int → Integer, double → Double).

// Needed because Collections & Generics only work with objects.

// 👉 Memory hook: Think of wrappers as “gift boxes” for primitive values — you can put them into collections like ArrayList.

// 2. Autoboxing & Unboxing
// Autoboxing: primitive → wrapper (automatic).

// Unboxing: wrapper → primitive (automatic).

// java
// // Autoboxing
// int x = 10;
// Integer obj = x;   // int → Integer

// // Unboxing
// Integer y = 20;
// int val = y;       // Integer → int
// 👉 Memory hook: “Auto” = Java does it for you. “Unbox” = open the gift box to get the primitive back.

// 3. Why Needed?
// Collections (ArrayList, HashMap).

// Utility methods (compareTo, equals, toString).

// Can store null (primitives can’t).

// Serialization, synchronization, APIs.

// 👉 Memory hook: Wrappers = “Swiss army knife” for primitives.

// 4. Common Methods
// Method	Use	Example
// parseXxx(String)	String → primitive	int a = Integer.parseInt("100");
// valueOf()	primitive/String → wrapper	Integer b = Integer.valueOf(10);
// xxxValue()	wrapper → primitive	int c = b.intValue();
// toString()	wrapper → String	String s = Integer.toString(10);
// compareTo()	compare wrappers	a.compareTo(b);
// equals()	compare values	a.equals(b);
// 👉 Memory hook: parse = read string, valueOf = make wrapper, xxxValue = unwrap.

// 5. Primitive ↔ Wrapper Mapping
// byte → Byte

// short → Short

// int → Integer

// long → Long

// float → Float

// double → Double

// char → Character

// boolean → Boolean

// 👉 Memory hook: Just capitalize the primitive name, except int → Integer and char → Character.

// 6. Quick Example for Interviews
// java
import java.util.ArrayList;

class Wrapper {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(42);   // Autoboxing: int → Integer
        int val = list.get(0); // Unboxing: Integer → int
        System.out.println(val); // 42
    }
}
// 👉 Memory hook: “ArrayList loves objects, so primitives must wear wrapper coats.”

// 🎯 Interview Takeaway
// Be ready to explain autoboxing/unboxing with a tiny code snippet.

// Know why wrappers exist (collections, nulls, utility methods).

// Recall common methods (parseInt, valueOf, xxxValue).

// Map primitive ↔ wrapper pairs.