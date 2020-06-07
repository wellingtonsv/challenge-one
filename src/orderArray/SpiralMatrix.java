package orderArray;

import java.util.Scanner;

public class SpiralMatrix {
	
    public static void main(String args[])
    {
        System.out.println("Enter com valor :");
         
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
         
        int n = sc.nextInt();
         
        int[][] spiral = new int[n][n];
         
        int valor = 1;
         
        int minCol = 0;
         
        int maxCol = n-1;
         
        int minRow = 0;
         
        int maxRow = n-1;
         
        while (valor <= n*n)
        {
            for (int i = minCol; i <= maxCol; i++)
            {
                spiral[minRow][i] = valor;
                     
                valor++;
            }
             
            for (int i = minRow+1; i <= maxRow; i++) 
            { 
                spiral[i][maxCol] = valor; 
                 
                valor++; 
            } 
             
            for (int i = maxCol-1; i >= minCol; i--)
            {
                spiral[maxRow][i] = valor;
                             
                valor++;
            }
             
            for (int i = maxRow-1; i >= minRow+1; i--) 
            {
                spiral[i][minCol] = valor;
                 
                valor++;
            }
             
            minCol++;
             
            minRow++;
             
            maxCol--;
             
            maxRow--;
        }
         
        for (int i = 0; i < spiral.length; i++)
        {
            for (int j = 0; j < spiral.length; j++)
            {
                System.out.print(spiral[i][j]+ "\t");
            }
            System.out.println();
        }
    }
}