public class fibb{
public static void main(String[] args)
{
int n=10;
int a=0;
int b=1;
int c;

System.out.println(a + " " + b);
for(int i=2;i<n;i++){
c = a+b;
a= b;
b= c;
System.out.println(" " + c);
}


}
}