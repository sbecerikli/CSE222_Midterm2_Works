/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermworks;

import com.sun.javafx.css.Combinator;
import sun.text.CompactByteArray;

/**
 *
 * @author Seyfullah Becerikli
 */
public class MidtermWorks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int a = toNumber("3ab4");
        //String s = stutter("hello");
        
     
        Integer s = 1;
        Integer y = 2;
        
        System.out.println(s.compareTo(y));
        
        
    }
    /*
    public static int length(String str){
        if(str == null || str.equals("")){
            return 0;
        }
        else{
            return 1+length(str.substring(1));
        }
    }
    */
    
    
    public static int toNumber(String str){
        if(str == null || str.equals("")){
            return 0;
        }
        else if(Character.isDigit(str.charAt(0))){
            return Integer.parseInt(str.charAt(0)+"") + toNumber(str.substring(1));
        }
        else return toNumber(str.substring(1));
        
    }
    
    
    public static String stutter(String str){
        if(str == null || str.equals("")){
            return "";
        }
        return str.charAt(0) + str.charAt(0) + stutter(str.substring(1));
        
    }
    
    public static int factorial(int value){
        if(value < 0){
            throw new IllegalArgumentException("Value negative: " + value);
        }
        if(value == 0){
            return 1;
        }
        else 
            return value * factorial(value-1);
    }
    
    public static double gcd(int n, int m){
        if(n % m == 0){
            return m;
        }
        else if(n < m){
            return gcd(m, n);
        }
        else{
            return gcd(m, n % m);
        }
    }
    
    public static double myPower(int x, int n){
        if(n == 0){
            return 1;
        }
        else if(n > 0){
            return x * myPower(x, n - 1);
        }
        else {
            return 1 / (myPower(x, -n));
        }
    }
    
    public static int binarySearch(Object[] arr, Comparable<Object> target){
        return binarySearch(arr, target, 0, arr.length - 1);
    }
    /*
    private static int binarySearch(int arr[], int target, int first, int last){
        if(first > last){
            return -1;
        }
        else if(arr[(first + last) / 2] == target){
            return (first + last) / 2;
        }
        else if(arr[(first + last) / 2] > target){
            return binarySearch(arr, target, first, (first + last) / 2);
        }
        else{
            return binarySearch(arr, target, (first + last) / 2, last);
        }
    }
*/
    private static int binarySearch(Object[] items, Comparable<Object> target,
            int first, int last) {
        if (first > last) {
            return -1; // Base case for unsuccessful search.
        } else {
            int middle = (first + last) / 2; // Next probe index.
            int compResult = target.compareTo(items[middle]);
            if (compResult == 0) {
                return middle; // Base case for successful search.
            } else if (compResult < 0) {
                return binarySearch(items, target, first, middle - 1);
            } else {
                return binarySearch(items, target, middle + 1, last);
            }
        }
    }
}
