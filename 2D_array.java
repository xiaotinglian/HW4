import java.util.*;

class Array{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("enter rows: ");
		int a = input.nextInt();
		int ind = 0;
		int temp=0;
		char[] n;
		
		char[][] arr= new char[a][];
		while(ind!=a){
			System.out.print("enter length: ");
			int b = input.nextInt();
			arr[ind]=new char[b];
			
			System.out.print("enter your characters: ");
		
			for(int j=0; j<b; j++){
				arr[ind][j]=input.next().charAt(0);
			
			}
			ind++; 
		}
		for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            	System.out.println();
        }
	}
}