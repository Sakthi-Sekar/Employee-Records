import java.util.Scanner;

public class grid {

	public static void main(String[] args) {
//int[] values = {1, 5, 108};
//System.out.println(values[1]);
int[][] grid = {
		{3, 8, 1},
		{6, 7, 9},
		{2, 4}
};
//System.out.println(grid[1][1]);
//System.out.println(grid[0][0]);
		/*int[] a = new int[10];
		System.out.println(a.length);
		Scanner d = new Scanner(System.in);
		for(int i=0; i<a.length;i++)
		{
			a[i] = d.nextInt();
	
		 
	}
		for(int i=0; i<a.length;i++)
		{
			System.out.print(a[i]);
		}*/
for(int row=0; row<grid.length; row++) {
	for(int col=0;col<grid[row].length; col++) {
		System.out.print(grid[row][col]	 + "\t");
}
System.out.println();
}
}
}