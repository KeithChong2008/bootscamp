package com.javahongkong.bootcamp.exercise;


public abstract class Account implements AccountInterface  {
	private AccountHolder accountHolder;
	private Long accountNumber;
	private int pin;
	private double balance;

	public Account(){};

		protected Account(AccountHolder accountHolder, Long accountNumber, int pin, double startingDeposit) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.pin =pin;
		this.balance = startingDeposit;
	}


@Override
	public AccountHolder getAccountHolder() {
		return this.accountHolder;
	}



@Override
	public boolean validatePin(int attemptedPin) {
		if(pin == attemptedPin){
			return true;
		}
		return false;
	}

	@Override
	public double getBalance() {
		// complete the function
		return this.balance;
	}

	@Override
	public double getPin() {
		// complete the function
		return this.pin;
	}

	@Override
	public Long getAccountNumber() {
		// complete the function
		return this.accountNumber;
	}

	@Override
	public void creditAccount(double amount) {
    this.balance += amount;
}

@Override
	public boolean debitAccount(double amount) {
		if(amount<balance){
			return true;
		}else{
			return false;
		}
	}
}
