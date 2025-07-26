import java.lang.String;
class StringDemo
{
public static void main(String []args)
{
String s1=new String("welcome");
String s2="polytechnic";
String s3="POLYTECHNIC";
System.out.println("the String s1 is:"+s1);
System.out.println("the String s2 is:"+s2);
System.out.println("the String s3 is:"+s3);
System.out.println("the length in string s1 is:"+s1.length());
System.out.println("the length in String s2 is:"+s2.length());
System.out.println("the s1 in uppercase :"+s1.toUpperCase());
System.out.println("the s2 in lowercase:"+s3.toLowerCase());
System.out.println("the first occurence of m is at position:"+s1.indexOf('m'));
System.out.println("s1 equal to s2:"+s1.equals(s3));
System.out.println("s1 ignore case to s2:"+s1.equalsIgnoreCase(s3));
System.out.println("character at an index of 6 is:"+s1.charAt(6));
String s4=s1.substring(3,6);
System.out.println("excated substring is:"+s4);
System.out.println("After replacing m with is s1:"+s1.replace('m','t'));
System.out.println("After string concat:"+s1.concat("to gpt mirle"));
System.out.println("the String s1 is:"+s1);
String s5="this is java string";
System.out.println("the string is:"+s5);
System.out.println("After String trim:"+s5.trim());
int result=s2.compareTo(s3);
System.out.println("After comparre to:");
if(result==0)
System.out.println(s2+"is equal to"+s3);
else if(result>0)
System.out.println(s2+"is greater than"+s3);
else
System.out.println(s2+"is smaller than"+s3);
}
}

