// Problem Statement
//The goal is to read in 3 numbers and output the one which is most different from the other two 
//(i.e. the one with the greatest difference from the nearest number to it). 
//If there is no single outlier then output "NA".

import java.util.*;

public class luizalab22
{

     public static void main (String[]args)
     {
     	Scanner pom=new Scanner(System.in);
     	int x=pom.nextInt();
     	int y=pom.nextInt();
     	int z=pom.nextInt();

     	int av=(x+y+z)/3;

     	int x1=Math.abs(x-av);
     	int y1=Math.abs(y-av);
     	int z1=Math.abs(z-av);

     	if(x1>y1&&x1>z1){System.out.println(x);}
     	else if(y1>x1&&y1>z1){System.out.println(y);}
     	else if(z1>x1&&z1>y1){System.out.println(z);}
     	else {System.out.println("NA");
     		}
     	}

     }
