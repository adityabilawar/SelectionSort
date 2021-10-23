
//selection sort example 

import static java.lang.System.*;

public class Selection
{
	public static void selectionSort(int[] ray)
	{
		for(int i=0; i< ray.length-1; i++)
		{
			int min = i;
			for(int j = i+1; j< ray.length; j++)
			{
			   if(ray[j] < ray[min])  //flip the symbol - what happens??
					min = j;    //find location of smallest
			}
			if( min != i)	{
				int temp = ray[min];
				ray[min] = ray[i];
				ray[i] = temp;   //put smallest in pos i
			}
		}
		for(int i = 0; i<ray.length; i++) {
			System.out.print(" " + ray[i]);
		}
	}
	public static void main(String[] args) {
		int ray[] = {1,3,4,5,6,3,1,5,4};
		
		Selection sele = new Selection();
		sele.selectionSort(ray);
	}
	}
