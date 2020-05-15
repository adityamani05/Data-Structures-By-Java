package abc;

import java.util.Scanner;


public class BankManage {
		 String name;
		 int age;
		 String mobileNo;
		 int balance;
		 
		public BankManage(String name,int age,String mobileNo,int balance){
			 this.name=name;
			 this.age=age;
			 this.mobileNo= mobileNo;
			 this.balance=balance;	 
		 }
		 
		int transaction() {
			Scanner sc = new Scanner(System.in);
			boolean flag=true;
			int ch,cr,wr;
			while(flag) {
				System.out.println("1.Credit\n2.Withdraw\n3.Exit");
				ch=sc.nextInt();
				switch(ch) {
				case 1:
					System.out.println("Enter Amount:");
					cr=sc.nextInt();
					balance=balance+cr;
					break;
				case 2:
					System.out.println("Enter Amount:");
					wr=sc.nextInt();
					if(wr>balance) {
						System.out.println("Not Efficient Amount!!!");
					}
					else {
						balance=balance-wr;
					}
					break;
				case 3:
					flag=false;
					break;
				default:
					System.out.println("Entered wrong choice");
				}
			}
			return balance;
		}	
		
		static BankManage openAcc() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the name:");
			String name = sc.nextLine();
			System.out.println("Enter the age:");
			int age = sc.nextInt();
			System.out.println("Enter the Mobile no:");
			String mobileNo = sc.nextLine();
			System.out.println("Enter the balance:");
			int balance = sc.nextInt();
			return  new BankManage(name,age,mobileNo,balance);
			
		}
	 
	public static void main(String[] args) {
			
		//	BankManage bm= new BankManage("Aditya",20,"8999369649",5000);
		//	BankManage bm1= new BankManage("Sanskar",30,"9999999999",15000);
		   // BankManage obj;
			BankManage arr[] = new BankManage[3]; 
			
			//BankMange b = new BankManage();
			Scanner sc = new Scanner(System.in);
			boolean flag=true;
			int ch,i=0,ac=400;	
			while(flag) {
				System.out.println("1.Open Account\t 2.Transaction\t3.Display Details\t4.Exit");
				ch=sc.nextInt();
				switch(ch) {
					case 1:
							
						arr[i]=openAcc();
						i++;
						System.out.println("Your accouunt no:"+ ++ac);
						
						break;
					case 2:
						System.out.println("Enter your Account number");
						int a=sc.nextInt();
						int b=a-401;
						System.out.println("Total Amount:"+arr[b].transaction());	
						break;
					case 3: 
						System.out.println("Enter your Account number");
						int c=sc.nextInt();
						int d=c-401;
						System.out.println("Name:"+arr[d].name+"\nAge:"+arr[d].age+"\nMobile no:"+arr[d].mobileNo+"\nBalance:"+arr[d].balance);
						break;
					case 4:
						flag=false;
						break;
				}	
			
			}
	}
}
