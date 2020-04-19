
public class sorting {

    public static void main(String[] args)
    {   
        //Bubble  Sorting
        int a[] = {-1 , 8 , -8 , 3 ,-5  };
        boolean sort = true ;

        int n = a.length ;
        for(int i =0 ; i <n-1 ; i++)
        {
            for(int j=0 ; j<n-1-i; j++)
            {
                if(a[j+1]<a[j])
                {
                    int temp = a[j+1] ;
                    a[j+1]= a[j];
                    a[j] = temp;
                    sort = false ;
                    
                }    
            }
           if(sort) break;
        }
        for (int item : a)
        {
            System.out.print(item +" ");
        }

        



    }

}