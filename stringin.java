import javax.xml.crypto.dsig.spec.HMACParameterSpec;

public class stringin {

    public static void main(String[] args)
    {
        String name = "gpu";  // created in String poll area/memory


        String name2 = "gpu" ; // created in String poll area/memory


        String name3 = new String("gpu"); // created in Heap area/memory
        
        System.out.println(name == name2); // Both Strings are in same area

        System.out.println(name == name3); // Both Strings are in different area

        String sample = "COVID-19 OUTBREAK " ;
        String sample2 = "Hello TOI ";

        System.out.println(sample.charAt(3));
        System.out.println(sample.length());
        System.out.println(sample.substring(2, 7));
        System.out.println(sample.substring(5));
        //returns boolean value
        System.out.println(sample2.contains("TOI"));


        String sample3 = "New";
        sample3 = sample3 + " York" ;

        System.out.println(sample3);
        //another way
        System.out.println(sample3.concat(" Times"));

        System.out.println();
       
        //String split

        String cars = "Maruti ,Brezza ,Honda ,Kia ,Hector " ;
        String allcar[] = cars.split(",");

        for(String car : allcar)
        {
            System.out.println(car);
        }

        System.out.println();
        //some other cases

        String file = "Documents";
        String mac = "Computer";
        String t = "       cuts       " ; //trim

        System.out.println(file.indexOf('o')); //Finds the position of the given characters

        System.out.println(file.toUpperCase());
        System.out.println(mac.toLowerCase());

        System.out.println(t); // without triming
        System.out.println(t.trim()); //with triming

    }

}