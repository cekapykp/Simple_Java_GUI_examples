package FileIO;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileExamples {

	public static void main(String[] args) throws IOException
	{
		
		//addProduct();
		//copy();
		//readFile();
		findCost();
	//FileExamples f=new FileExamples(); static olmasayd� nesne �retip �a��rabilirdik
	}

	public static void addProduct() throws IOException {
		FileWriter f=new FileWriter("C:\\Users\\Lab\\eclipse-workspace\\BabulHavaic\\src\\Product",true);
		PrintWriter p=new PrintWriter(f);
		
		Scanner input=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println("Product");
			String product=input.next();
			System.out.println("Price");
			int price=input.nextInt();
			p.print(product+"\t"+price+"\n");
		}
		p.close();
	}
	
	public static void readFile() throws FileNotFoundException
	{
		File f=new File("C:\\Users\\Lab\\eclipse-workspace\\BabulHavaic\\src\\Product");
		Scanner input=new Scanner(f);
		
		System.out.println("Product\tPrice\n");
		while(input.hasNext()) //dosyada okunacak bir �ey varsa i�ine girip okur.
		{
			String row=input.nextLine();
			System.out.println(row);
		}
		input.close();
	}
	
	public static void copy() throws IOException
	{
		File f=new File("C:\\Users\\Lab\\eclipse-workspace\\BabulHavaic\\src\\Product");
		Scanner input=new Scanner(f);
		ArrayList<String> fileRecords=new ArrayList<String>();
		
		while(input.hasNext()) 
		{
			String row=input.nextLine();
			fileRecords.add(row);
		}
		
		FileWriter f1=new FileWriter("C:\\Users\\Lab\\eclipse-workspace\\BabulHavaic\\src\\Product2",true);
		PrintWriter p=new PrintWriter(f1);
		for(String row:fileRecords) 
		{
			p.println(row);
		}
		p.close();
	}
	
	public static void findCost() throws FileNotFoundException 
	{
		File f=new File("C:\\Users\\Lab\\eclipse-workspace\\BabulHavaic\\src\\Product");
		Scanner input=new Scanner(f);
		
		int sum=0;
		while(input.hasNext())
		{
			String row=input.nextLine();
			String[] parts=row.split("\t");
			
			int price=Integer.parseInt(parts[1]);
			sum+=price;
		}
		System.out.println("Cost:"+sum);
		
	}
	
}












