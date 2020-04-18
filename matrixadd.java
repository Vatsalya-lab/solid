import java.util.Scanner;

public class matrixadd {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter Dimensions :");

        int rows = sc.nextInt();
        int col = sc.nextInt();

        int a[][] = new int[rows][col];

        int b[][] = new int[rows][col];

        System.out.println("Enter matrix 1 :");


        for(int i = 0 ; i<rows ; i++)
        {
            for(int j =0 ; j<col ; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter matrix 2 :");
        
        for(int i = 0 ; i<rows ; i++)
        {
            for(int j =0 ; j<col ; j++)
            {
                b[i][j] = sc.nextInt();
            }
        }

       
        int c[][]= new int[rows][col];

        
        for(int i = 0 ; i<rows ; i++)
        {
            for(int j =0 ; j<col ; j++)
            {
                c[i][j] = a[i][j] +b[i][j];
            }
        }

        System.out.println("Addition of Matrices :");
        for(int i = 0 ; i<rows ; i++)
        {
            for(int j =0 ; j<col ; j++)
            {
                System.out.print(c[i][j] +" ");
            }
            System.out.println();
        }





        sc.close();
    }
    



}