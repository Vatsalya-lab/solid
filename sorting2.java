
public class sorting2 {

    public static void main(String[] args)
    {
        //Selection Sorting
        int a[] = {-1 , 0 , -9 , 7 , 4 , 2 };

        int n = a.length;
        

        for(int i =0 ; i<n-1 ; i++)
        {
            int mark =i ;

            for(int j =i ; j<n ; j++)
            {
                if(a[j]< a[mark])
                {
                    mark =j ;
                }
            }

            int temp = a[i];
            a[i]= a[mark];
            a[mark] = temp ;


        }


            for(int e : a)
            {
                System.out.print(e +" ");

            }    
    

    }
}