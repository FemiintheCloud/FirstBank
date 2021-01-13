import java.util.Scanner;

public class First_Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		String[] newname = new String[3];
		for(int i = 0; i < 3; i++)
		{
			System.out.println("Welcome, Please enter name here and Your Id " + '\n');
			newname[i] = scanner.nextLine();
		}
		
		scanner.close();
		String cname = newname[0] + " " + newname[1];
		String cid = newname[2];
		
		Account user = new Account(cname, cid);
		user.showmenu();
		
	}

}
