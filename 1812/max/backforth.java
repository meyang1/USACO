//Max Yang
//2 hours 
//Unfinished
//I started with creating a class and trying out every value in each day, but using strings and arrays to 
  simulate it failed because vectors would be a better way to add and take out values.
import java.io.*;
import java.util.*;

public class backforth{
        public static void main(String[] args)throws IOException{

                Scanner scan = new Scanner(new File("backforth.in"));
                int[] Barn1 = new int[25];
                int[] Barn2 = new int[25];
                for(int i=0; i<10; i++) Barn1[i]=scan.nextInt();
                for(int i=0; i<10; i++) Barn2[i]=scan.nextInt();
		String Tues1="", Tues2="", Wed1="", Wed2="", Thur1="", Thurs2="", Fri1="",Fri2="";
        	int count=0;
		int sum_possible="";
	//without a class
		for(int i=0; i<10; i++){
                        for(int j=0; j<Tues1.length(); i++){
                                if(b1[i] == Tues.substring(j, j+1));
                                        count++;
                        }
                        if(count==0){
                                Tues1 += b1[i] + " ";
                        }
                        count=0;
		}
		Scanner scanner = new Scanner(Tues1);

		int[] unique = new int[21];
		for(int i=0; i<10; i++){
			if(scanner.hasNext()!= Boolean.FALSE)
				unique[i]=nextInt(); ;
		}
	
		for(int i=0; i<sizeof(unique); i++)
			sum_possible += total(b1)-unique(i)+" ";
        }

}

public class Week{
        public String Day = "";
        public String Tues2 = "";
        public String Wed1 = "";
        public String Wed2 = "";
        public String Thurs1 = "";
        public String Thurs2 = "";
        public String Fri1 = "";
        public String Fri2 = "";
        private count=0;
	public sum_possible="";

        public Week{ }

        public int FindVal(int[] b1){
		for(int i=0; i<20; i++){
                        for(int j=0; j<Tues1.length(); i++){
                                if(b1[i] == Tues1.substring(j, j+1));//find unique values
                                        count++;
                        }
                        if(count==0){
                                Day += b1[i] + " ";
                        }
                        count=0;
		}
		Scanner scanner = new Scanner(Day);

		int[] unique = new int[21];
		for(int i=0; i<20; i++){
			if(scanner.hasNext()!= Boolean.FALSE)
				unique[i]=nextInt(); //add all unique values to array
		}
	
		for(int i=0; i<sizeof(unique); i++)
			sum_possible += total(b1)-unique(i)+" "; //Finds sum lf
			
                
        }

	public int total(int[] barn){
		int sum;
		for(int i=0; i<sizeof(barn); i++)
			sum+=barn(i);		
		return sum;		
	}
