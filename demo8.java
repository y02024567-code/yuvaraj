public class Main {
   public static void main(String[] args) {
    String s="madam";
    int i=0;
    int j=s.length()-1;
    boolean ispalindrome=true;
    while(i<j){
        if(s.charAt(i)!=s.charAt(j)){
             ispalindrome=false;
             break;
             }
             i++;
             j--;
             
        }
        System.out.println(s);
        }
     }

import java.util.*;
    public class Main {
        public static void main(String[] args) {
            char arr[]={'a','i','s','u','f','g'};
            Arrays.sort(arr);
             System.out.println(Arrays.toString(arr));
        }
    }
            
            