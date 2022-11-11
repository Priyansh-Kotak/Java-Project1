import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

class library
{
	
	Scanner sc =new Scanner(System.in);	
	
	int n=0 ;	
	int i=0;    // Addbooks array 
	int j=0;	// Returnbook array
	//int u =0 ;   // Updated array 


	public void addbook(String addbooks [] , int n)
	{
		
		System.out.println("Value of i :- " + i);
		while(true)
		{

			for(int k=0 ; k < n; k++)
			{
				System.out.println("Enter book name  :- ");
				String bname = sc.nextLine();
				addbooks[i] = bname;
				i++;
			}
			
			break;
		}
			System.out.println("Value of i :- " + i);
	
	}


	public void issuebook(String issuebooks [] ,String addbooks [] ,int n)
	{
		if(i>0)
		{

			System.out.println("Enter book you want to issue :- ");
			String issue = sc.nextLine();
			
			for(int m =0 ; m < i ;m++)						// For loop for the updation of issuebooks array
			{
				if( addbooks[m].equals(issue))
				{
					issuebooks[j]= issue;
					j++;
				}
			}
	
		
			int u = 0;

			for(int m =0 ;m< i ;m++)						// For loop for the updation of addbooks array
			{
				if( ! addbooks[m].equals(issue))
				{
					addbooks[u]= addbooks[m];
					u++;
				}
			}
		
			i = u;
		}
		
		else
		{
			System.out.println("Opps there is no book left in the library");
		}
		
		

	}


	
	public void returnbook(String issuebooks [] , String addbooks [] , int n)
	{
		int v=0;
		while(true)
		{
			System.out.println("Enter the book name you want to return :- ");
			String returns = sc.nextLine();
			++i;
			addbooks[i] = returns;
			
			for(int r=0; r<j; r++)
			{
				if( ! issuebooks[r].equals(returns))
				{
					issuebooks[v] = issuebooks[r];
					v++;
				}
			}
			
			j=v;
			
			System.out.println("Do you want to return any other book ?");
			String choice = sc.nextLine();
			if(choice.equals("yes"))
			{
				continue;
			}

			else
			{
				System.out.println("You have successfully returned the book");
				break;
			}
		}

	}
		
	


	public void display(String issuebooks [] , String addbooks [] , int n)
	{
		System.out.println("Display avaible books present in the library :- ");		
		
		if( i>0 )
		{
			for(int m =0 ; m < i ; m++)	
			{
				System.out.println(addbooks[m]);
			}
		}		
		else	
			System.out.println("Opps no books avaible ");



		//********************************************//




		System.out.println("Display issue books present in the library :- ");	

		if(j>0)
		{	
			for(int m =0 ; m < j ; m++)	
			{
			
				System.out.println(issuebooks[m]);
			}
		}
		else
			System.out.println("Opps no book is issued ");
		
	}

}



class Java_library
{
	public static void main(String [] args)
	{
		
		Scanner sc =new Scanner(System.in);
		String [] addbooks = new String[100];
		String [] issuebooks = new String[100];
		int n = 0;
		
		library lib = new library();
		while(true)
		{	
			
			

			System.out.println("\n************************ Hello To Periyar Central Library ************************ \n\nWhat do you like to perform :- \n(1) Addbook\n(2) Issuebook\n(3) Returnbook\n(4) ShowAvaibleBooks \n(5) Exit");
			int choice = sc.nextInt();
		
			switch( choice)
			{
				case 1:
				{
					System.out.println("Enter how many books do you want to entre ? ");
					n =sc.nextInt();
					lib.addbook(addbooks,n);
					break;	
				}	

			
				case 2:
				{
					lib.issuebook(issuebooks, addbooks,n);
					break;
				}

		
				case 3:
				{
					lib.returnbook(issuebooks, addbooks,n);
					break;
				}


				case 4:
				{
					lib.display(issuebooks,addbooks ,n);
					break;
				}
					
								
			}

			if(choice == 5)
			{
				System.out.println("You sure want to exit : - ");
				String c =sc.next();
				if( c.equals("no"))
				{
					continue;
				}
				else 
				{	
					System.out.println(" *************** Thank you for coming *************** \n *************** Keep learning ***************");
					break;
				}		
		
			}

		}	
	}	

}




























