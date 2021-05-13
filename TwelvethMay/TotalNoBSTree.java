//Program to Find the Total Number of Possible Binary Search Trees with N Keys

import java.util.Scanner;
public class TotalNoBSTree {  
      
    public static class Node{  
        int data;  
        Node left;  
        Node right;  
          
        public Node(int data){  
            this.data = data;  
            this.left = null;  
            this.right = null;  
            }  
        }  
      
    public Node root;  
      
    public TotalNoBSTree(){  
        root = null;  
    }  
      
    public int factorial(int num) {  
        int fact = 1;  
        if(num == 0)  
            return 1;  
        else {  
            while(num > 1) {  
                fact = fact * num;  
                num--;  
            }  
            return fact;  
        }  
    }  
      
    public int numOfBST(int key) {  
        int catalanNumber = factorial(2 * key)/(factorial(key + 1) * factorial(key));  
        return catalanNumber;  
    }  
      
    public static void main(String[] args) {  
          
    	TotalNoBSTree bt = new TotalNoBSTree();  
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter key: ");
    	int n=sc.nextInt();          
        System.out.println("Total number of possible Binary Search Trees with given key: " + bt.numOfBST(n)); 
        sc.close();
      }  
}  
