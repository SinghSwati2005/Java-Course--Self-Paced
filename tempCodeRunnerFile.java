import java.util.ArrayList;

class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(42);   // Autoboxing: int → Integer
        int val = list.get(0); // Unboxing: Integer → int
        System.out.println(val); // 42
    }
}