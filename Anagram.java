
public class Anagram {

    public static void main(String[] args)
    {

        String a = "ont";
        String b = "not";

        boolean visited[] = new boolean[b.length()];

        boolean isAnagram = false ;

        if(a.length() == b.length())
        {

                for(int i =0 ; i<a.length() ; i++)
                {
                    char c = a.charAt(i);
                    isAnagram =false;

                    for(int j =0 ; j<b.length() ; j++)
                    {
                                if(b.charAt(j)== c && visited[j]== false)
                                {
                                    visited[j] = true ;
                                    isAnagram = true ;
                                    break;

                                }
                    }  
                    if(isAnagram == false)
                    {   
                    
                        break;
                    }          

                }
    }

                if(isAnagram == true)
                {
                    System.out.println("Anagram");
                }
                else 
                {
                    System.out.println("Not Anagram");
                }
                    



    }

}