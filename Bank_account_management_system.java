package com.studyopedia;
	class bank
		{
			private String acc_name;
			private int acc_num;
			private double acc_bal;
			
			bank(String acc_name, int acc_num, double acc_bal)
			{
				this.acc_name=acc_name;
				this.acc_num=acc_num;
				this.acc_bal=acc_bal;
			}
			
			public void getacc_bal()
			{
				System.out.println("Account Balance: "+acc_bal);
				
			}
			
			public void withdraw(int amount)
			{
				if(amount<acc_bal)
				{
					System.out.println("Account Balance: "+ (acc_bal-amount));
				}
				else
				{
					System.out.println("invalid");
				}
			}
			
			public void deposit(int amount)
			{
				System.out.println("Account Balance: "+ (acc_bal+amount));
			}
			
			public void update_acc_bal(int update_acc_bal)
			{
				this.acc_bal=update_acc_bal;
				System.out.println("Account Balance: "+(update_acc_bal));
			}	
		}
		public class Bank_account_management_system {
		
			public static void main(String[] args) {
				bank b1 = new bank("abc", 46512, 1000000);
				
				b1.getacc_bal();
				b1.withdraw(50000);
				b1.update_acc_bal(1500000);
				b1.deposit(10200);
				b1.getacc_bal();
		
			}
		
		}
