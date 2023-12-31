package com.javahongkong.bootcamp.exercise;

import java.util.LinkedHashMap;
import java.util.Map;

public class Bank implements BankInterface {
	private LinkedHashMap<Long, Account> accounts; // object reference

	public Bank() {
		// complete the function
		accounts = new LinkedHashMap<>();
	}

@Override
	public Account getAccount(Long accountNumber) {
    return accounts.get(accountNumber);
}

@Override
	public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
		Long accountNumber = (long) accounts.size();
		CommercialAccount account = new CommercialAccount(company, accountNumber, pin, startingDeposit);
		accounts.put(accountNumber, account);
		return accountNumber;
	}

	@Override
	public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
		Long accountNumber = (long) accounts.size();
		ConsumerAccount account = new ConsumerAccount(person, accountNumber, pin, startingDeposit);
		accounts.put(accountNumber, account);
		return accountNumber;
	}

	@Override
	public boolean authenticateUser(Long accountNumber, int pin) {
		// complete the function
		return accounts.get(accountNumber).validatePin(pin);
	}

	@Override
	public double getBalance(Long accountNumber) {
		// complete the function
		return accounts.get(accountNumber).getBalance();
	}

	@Override
	public void credit(Long accountNumber, double amount) {
		// complete the function
		accounts.get(accountNumber).creditAccount(amount);
	}

	@Override
	public boolean debit(Long accountNumber, double amount) {
		// complete the function

		return accounts.get(accountNumber).debitAccount(amount);
	}
}
