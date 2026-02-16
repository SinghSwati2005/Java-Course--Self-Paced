// java uses scanner word to take input we use java.util to use the scaner function
import java.lang.*;
import java.util.*;

class Input{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
int x = sc.nextInt(); // read an integer 
float y = sc.nextFloat(); //read a float value
String s = sc.next(); // read a string value fisrt word only
// String s1 = sc.nextLine(); reads entire line of a string
System.out.println(x);
System.out.println(y);
System.out.println(s);
        
    }
}