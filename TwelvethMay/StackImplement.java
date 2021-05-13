//Program to implement stack

import java.util.*;
class arraystack{
	protected int arr[];
	protected int top,size,len;
	public arraystack(int n) {
		top=-1;
		size=n;
		len=0;
		arr=new int[size];
	}
	public void push(int i) {
		if(top + 1 >= size)
            throw new IndexOutOfBoundsException("Overflow Exception");
        if(top + 1 < size )
            arr[++top] = i;
        len++ ;
	}
	public int pop() {
		if( isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        len-- ;
        return arr[top--];
	}
	public int peek() {
		if( isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        return arr[top];
	}
	public boolean isEmpty() {
		return top == -1;
	}
	public boolean isFull() {
		return top == size-1;
	}
	public int getSize() {
		return len;
	}
	public void display()
    {
        System.out.print("Stack = ");
        if (len == 0)
        {
            System.out.print("Empty\n");
            return ;
        }
        for (int i = top; i >= 0; i--)
            System.out.print(arr[i]+" ");
        System.out.println();
    }  
}
public class StackImplement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of stack: ");
		int n = sc.nextInt();
		arraystack stk=new arraystack(n);
		char ch;
		do {
			System.out.println("1.Push\t\t 2.Pop\t\t 3.Peek\t\t 4.check empty\t\t 5.check full\t\t 6.size");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter integer element to push");
				try {
					stk.push(sc.nextInt());
				}
				catch(Exception e) {
					System.out.println("Error: "+e.getMessage());
				}
				break;
			case 2:
				try {
					System.out.println("popped element= "+stk.pop());
				}
				catch(Exception e) {
					System.out.println("Error: "+e.getMessage());
				}
				break;
			case 3:
				try {
					System.out.println("peek element= "+stk.peek());
				}
				catch(Exception e) {
					System.out.println("Error: "+e.getMessage());
				}
				break;
			case 4:
				System.out.println("Empty stack "+stk.isEmpty());
				break;
			case 5:
				System.out.println("Full stack "+stk.isFull());
				break;
			case 6:
				System.out.println("size= "+stk.getSize());
				break;
			default:
				System.out.println("Wrong choice");
				break;
			}
			stk.display();            
            System.out.println("\nDo you want to continue (Type Y or N) \n");
            ch = sc.next().charAt(0);
            sc.close();
		}while(ch=='Y' || ch=='N');

	}

}
