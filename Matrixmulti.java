import java.util.Scanner;

public class Matrixmulti {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Matrix Multiplication");
        System.out.println("Enter Dimensions :");
        int r = sc.nextInt(); //Taking rows
        int c = sc.nextInt(); //Taking Columns 
        
        int a[][] = new int[r][c] ; 
        System.out.println("Enter Dimensions 2 :");
        int R = sc.nextInt();
        int C = sc.nextInt();

        int b[][] = new int[R][C] ;
        int sum =0;
        if(c==R) //Value of Columns of 1 Matrix must be == to Value of rows of Second matrix
        {
        System.out.println("Enter Matrix 1 :");

        for(int i =0 ; i<r ; i++)
        {
            for(int j =0 ; j<c ; j++)
            {
                a[i][j]= sc.nextInt(); 


            }


        }

        System.out.println("Enter Matrix 2 :");

        for(int i =0 ; i<R ; i++)
        {
            for(int j =0 ; j<C ; j++)
            {
                b[i][j]= sc.nextInt();

            }


        }

        int m[][] = new int[r][C] ;

        for(int i=0 ; i<r ;i++)
        {
            for(int j =0 ; j<C ; j++)
            {
                for(int k=0 ; k<R ; k++)
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
            for(int j =0 ; j<C ; j++)
            {
                System.out.print(m[i][j] +" ");

            }

            System.out.println();

        }
    }
    else
    {
        System.out.println("Multiplication is not Possible");
    }
        sc.close();

    }


}
