package Strings;

public class Interning {
    static void main() {
        String s="Krishna";//Strings are immutable
         //if same name than point that pointer to that string too.
        String k = new String("Krishna");

        System.out.println(s);
    }
}
