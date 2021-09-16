import java.util.*;
public class exp1
{
public static void main(String args[])
{
int marks[]=new int[10];
String uid[]=new String[10];
String name[]=new String[10];

int ch,i=0;
Scanner in=new Scanner(System.in);
for(i=0;i<10;i++)
{
System.out.println("enter your choice");
System.out.println("press 1 to add data of student");
System.out.println("press 2 to search data of given student");
System.out.println("press 3 to remove data of given student");
System.out.println("press 4 to view the data");
System.out.println("press 5 to give any feedback");
System.out.println("press 0 to exit");
ch=in.nextInt();
if(ch==0)
{

System.out.println("thanks for useing or service");
System.out.println("end of the program ");
break;
}
switch(ch)
{
case 1:
System.out.println("enter the data");
System.out.println("enter the name");
name[i]=in.nextLine();
in.nextLine();
System.out.println("enter the uid");
uid[i]=in.next();
System.out.println("enetr the marks");
marks[i]=in.nextInt();
i=i+1;
break;
case 2:
System.out.println("enter the name of the student");
String x=in.nextLine();
for(i=0;i<name.length;i++)
{
if(name[i]==x)
{
name[i]=name[i+1];
marks[i]=marks[i+1];
uid[i]=uid[i+1];
break;
}
}
break;
case 3:
System.out.println("enter the name of the student to search ");
int c=0;
String f=in.nextLine();
for(i=0;i<name.length;i++)
{
if(name[i]==f)
{
System.out.println("Student is found");
System.out.println("the deatils are as followed");
System.out.println("name is"+name[i]);
System.out.println("uid is "+uid[i]);
System.out.println("marks are"+marks[i]);
c=c+1;
}
}
if(c>=1)
{
System.out.println("no such student in the data plese check for right name or press 1 to add his/her details");
}
break;
case 4:
for(i=0;i<name.length;i++)
{
System.out.println("the deatils are as followed");
System.out.println("name is"+name[i]);
System.out.println("uid is "+uid[i]);
System.out.println("marks are"+marks[i]);
System.out.println("---------------------");
}
break;
case 5:
System.out.println("please enter your feedback");
String fb=in.nextLine();
break;
default:
System.out.println("please check your choice");
break;
}
}
}
}
