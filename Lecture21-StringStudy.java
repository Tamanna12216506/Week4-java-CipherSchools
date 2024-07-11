// package strings;
public class StringStudy{
  public static void main(String[] args){
   String name = "CipherSchools"; // created string using literals
   String name2 = "CipherSchools";
   String name3 = new String("CipherSchools");//created string using literals
   String name4 = new String("CipherSchools");
    System.out.println(name == name2);  //// == operator compares refernce for object and value
    System.out.println(name3 == name4);
    System.out.println(name == name3);

    //Strig are immutable
    //1.Concatention
    String s1 = "hello";
    s1 = s1+"Peeps";
    System.out.println(s1);
    System.out.println(s1+", How are you?");
    System.out.println(s1); // s1 remain same

    //Another way to concantenate
    String s2 = new String("Hello");
    String s3 = new String("People");
    String s4 = s2.concat(s3);
    System.out.println(s4);
    System.out.println(s2); // remin same

    System.out.println("Checking string equal or not");
    System.out.println(name.equals(name2));
    System.out.println(name.equals(name3));

    System.out.println("Creating new String object from each character array");
    char arr[] = {'c','i','p','h','e','r'};
    String strFromArr = new String(arr);
        System.out.println(strFromArr);
  }
}






    




    
  
