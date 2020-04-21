//classes
class mobile 
{
    String brand ;
    int price ;
    int model;

            public void mobo()
                {

                        System.out.println("Mobile"+ brand + " "+ price+" " + model);

                }

    


}
class Tv
{
                    int model ;
                    int price ;

                    public void  show() 
                    {
                        System.out.println("Tv " + " "+ model + " "+ price);

                    }



}


public class Class {

    public static void main(String[] args)
            {
                    Tv mi = new Tv();

                    mi.model = 8561465 ;
                    mi.price = 80000 ;

                    mi.show();

                    mobile lo = new mobile();

                    lo.brand = "One plus"; 
                    lo.price = 40000 ;
                    lo.model = 78541 ;
                    
                    lo.mobo();









            }

        }