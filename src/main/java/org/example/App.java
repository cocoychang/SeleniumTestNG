package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        String str ="level";
        String result ="";

        for(int i = str.length() - 1; i>=0; i-- ){
            result += str.charAt(i);
        }
        System.out.println(result);
        if(str.equals(result)){
            System.out.println("String is polindrome");
        }else{
            System.out.println("String is not polindrome");
        }
    }
}
