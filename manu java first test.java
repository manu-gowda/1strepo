1.Java is a platform independent because of  the java compiled code(byte code) can run on all 
operating systems. A program is written in a language that is a human-readable language.
It may contain words, phrases, etc which the machine does not understand.

2. primitive data types  primitive type is predefined by the language and is named by a reserved keyword. 
Primitive values do not share state with other primitive values. The eight primitive data types 
supported by the Java programming language are: byte: The byte data type is an 8-bit signed two's 
complement integer.
we have 8 primitive data types,
byte,short,int,long,float,boolean,double,char.
non primitive data types are..
String, array, etc... non primitive data types are N nos of data types
non primitive data types are started with lowercase.

3.class is the context of java a template used to create objects and to define object data types and methods. 
Classes are categories, and objects are items within each category. All class objects should have 
the basic class properties.
There are 5 types members in class therefore..
Member Variables (States)
Methods (Behaviors)
Constructor
Blocks (Instance or Static Blocks )
Inner Classes.
ClassName.method();
import packageName.ClassName();
ClassName c = new ClassName(); 

4.
 class percentageDataOperator 
{ 
   
    static double findTotal(int a[], int i, int n)
    {
       
        if (i == n-1)
            return a[i];    
       
        if (i == 0)
            return ((a[i] + findTotal(a, i+1, n))/n);    
      
        return (a[i] + findTotal(a, i+1, n));
    }    
   
    static double findPercentage(int a[], int n)
    {
         return findTotal(a, 0, n);
    }    
    
    public static void main(String args[]) 
    {   
       
        Scanner sc = new Scanner(System.in); 
        int n;   
        
       
        System.out.println("Enter the total subjects ");
        n=sc.nextInt();
        
      
        int arr[] = new int[n]; 
        System.out.println("Enter the marks secured in each subject ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }        
         double avg=findPercentage(arr, n);  
         double sum=avg*n;
        System.out.println("The total marks is "+sum);
        System.out.println("The total percentage is "+avg+" % ");     
    }   
}



6.The main() is the starting point for JVM to start execution of a Java program. 
Without the main() method, JVM will not execute the program.
The syntax of the main() 
    
	public static void main (String[] juice kudithiyaaaaa){
	}
	public=access specifier 
	static=non access specifier
	void=return type
	main=method Name
	
7. class ReverseNumber{  

 
     public static void main(String[] args) {  
      int number = 987654, reverse = 0;  
      while(number != 0)   
      {  
      int remainder = number % 10;  
        reverse = reverse * 10 + remainder;  
         number = number/10;  
      }  
        System.out.println("The reverse of the given number is: " + reverse);  
  }  
} 


8.
class ConversionOfMinutesToSeconds {  
  
static void conversion(float hours)  
{  
float minutes, seconds;  
  
    minutes = hours * 60;  
    seconds = hours * 3600;  
  
    System.out.println("There are " + minutes + " minutes in " + hours + " hours");  
    System.out.println("There are " + seconds + " seconds in " + hours + " hours");  
}  


9.
class ArmstrongDataOperator {

    public static void main(String[] args) {

        int number = 1634, originalNumber, remainder, result = 0, n = 0;

        originalNumber = number;

        for (originalNumber != 0; originalNumber /= 10, ++n)

        originalNumber = number;

        for (originalNumber != 0; originalNumber /= 10)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}