package strings;
public class ReverseAstring{
public static void main(String[] args){
String s1="CipherSchools";
int n==s1.length();
char arr[]=new char[n];
for(int i=0;i<n;i++)
{
arr[i]=s1.charAt(n-1-i);
}
//arr has reversed string
String rev =new String(arr);
System.out.println(rev);
//what is the timecomplexity=>O(n)
//Is it in an inplace solution?=>no,we created arr[]
//what is the space complexity?=>O(n)=>for arr[n]
apporach2
String res=new String();
for(int i=n-1;i>=0;i--)
{
res=res+s1.charAt(i);//Tc=>O(n)=>but creating new objects again and again
}
System.out.println(res);
apporach3
char strArr[]=s1.tocharArray();
int l=0;
int r=n-1;
while(l<r){
char temp=strArr[l];
strArr[l]=strArr[r];
l++;
r++;
}
//swapping completed
String result=new String(strArr);
System.out.println(result);
}
}
