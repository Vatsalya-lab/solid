import java.util.Scanner;

public class matrixmul {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Matrix Multiplication");
        System.out.println("Enter Dimensions :");
        int r = sc.nextInt(); //Taking rows
        int c = sc.nextInt(); //Taking Columns 
        
        int a[][] = new int[r][c] ; 

        int b[][] = new int[r][c] ;
        int sum =0;

        System.out.println("Enter Matrix 1 :");

        for(int i =0 ; i<r ; i++)
        {
            for(int j =0 ; j<c ; j++)
            {
                a[i][j]= sc.nextInt(); 


            }


        }

        System.out.println("Enter Matrix 2 :");

        for(int i =0 ; i<r ; i++)
        {
            for(int j =0 ; j<c ; j++)
            {
                b[i][j]= sc.nextInt();

            }


        }

        int m[][] = new int[r][c] ;

        for(int i=0 ; i<r ;i++)
        {
            for(int j =0 ; j<c ; j++)
            {
                for(int k=0 ; k<c ; k++)
                {
                        sum = sum + a[i][k]*b[k][j] ;
                }
                m[i][j] =sum;
                sum=0 ;


            }
        }

        System.out.println("Answer");

        for(int i =0 ; i<r ; i++)
        {
            for(int j =0 ; j<c ; j++)
            {
                System.out.print(m[i][j] +" ");

            }

            System.out.println();

        }
        sc.close();

    }


}