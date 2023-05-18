/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package software1;
import java.util.*;
import java.lang.String;
/**
 *Fetch Demo
 * @author Nehal Patel
 */
public class ReverseString {
    public static void main(String[] args) {
     System.out.print("FETCH DEMO");

        Scanner read=new Scanner(System.in);
                System.out.print("Enter any String to Reverse: ");
        String str=read.next();
        char ar[]=new char[str.length()];
        
        for(int i=0;i<str.length();i++)
        {
            ar[i]=str.charAt(i);
        }
        //System.out.println(ar);

        for(int i=ar.length-1;i>=0;i--)
        {
            System.out.print(ar[i]);
        }
        
        
        
    }
}
