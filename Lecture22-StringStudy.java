public class StringStudy{
  public static void main(String[] args){
   String name = "CipherSchools"; // created string using literals
   String name2 = "CipherSchools";
   String name3 = new String("CipherSchools");//created string using literals
   String name4 = new String("CipherSchools");
    System.out.println(name == name2);  //// == operator compares refernce for object and value
    System.out.println(name3 == name4);
    System.out.println(name == name3);
    char arr[] = {'C','I','J','K'};

  //Creating partial String object from character array
  System.out.println("Creating partial String object from character array : ");
    String partialStrFromArr = new String(arr,1,3);
    System.out.println(partialStrFromArr);

   String partialStrFromArr2 = new String(arr,2,3);
   System.out.println(partialStrFromArr2);

    //Changing the case
    System.out.println("Changing the case");
    System.out.println(name.toLowerCase());
    System.out.println(name.toUpperCase());
    System.out.println(name);

    //Splitting
    System.out.println("Splitting");
    System.out.println("Please enter your full name: ");
    Scanner sc = new Scanner(System.in);
    String fullName = sc.nextLine();
    String strArr[] = fullName.split(" ");
    for(int i=0;i<strArr.length;i++){
      System.out.println(strArr[i]);
    }
    
    System.out.println("Enter something separated by commas :");
    String csvText = sc.nextLine();
    String csvArr[] = csvText.split(",");
    for(int i=0;i<csvArr.length;i++){
      System.out.println(csvArr[i]);
    }
    System.out.println("Enter something separated by dots :");
    String dotText = sc.nextLine();
    String dotArr[] = dotText.split("[.]");
    for(int i=0;i<dotArr.length;i++){
      System.out.println(dotArr[i]);
    }

    String backSlashText = "Hello, I attend\"Java\"class";
    String backSlashArr[] = backSlashText.split("\"");
    for(int i=0;i<backSlashArr.length;i++){
      System.out.println(backSlashArr[i]);
    }

    //Length of string
    System.out.println("Length of String");
    int len = name.length();
    System.out.println("Length of: "+name+" is: "+len);
  }
}
    

    
