import java.util.Scanner;

public class AscDscArray {
    public static void main(String[] args){
          Scanner obj=new Scanner(System.in);
          System.out.println("The Size of Array ?");
          int size=obj.nextInt(); 
          int[] element=new int[size];
          for(int i=0; i<size; i++){
             element[i]=obj.nextInt();
          }
          
        System.out.println("Now convert into Decending and asscending order ");


        boolean isAscending = true;

        for(int i=0; i<element.length-1; i++) { // NOTICE numbers.length - 1 as termination condition

        if(element[i] > element[i+1]) { // This is the condition for descending order
            
                isAscending = false;
            }
        }
 
 
        if(isAscending) {
            System.out.println("The array is sorted in ascending order");
        } else {
            System.out.println("The array is not sorted in ascending order");
        }
       
    }
 }




