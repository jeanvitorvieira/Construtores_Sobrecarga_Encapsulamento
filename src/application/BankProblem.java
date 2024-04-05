package application;

import entities.BankAccount;

import java.util.Locale;
import java.util.Scanner;

public class BankProblem {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        BankAccount bank; //declaração de variável do tipo BankAccount

        System.out.print("Enter account number: ");
        int account = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char option = sc.next().charAt(0);

        if ((option == 'Y') || (option == 'y')) {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            bank = new BankAccount(account, holder, initialDeposit); // atribuição de dados ao construtor com 3 atributos
        } else {
            bank = new BankAccount(account, holder); // atribuição de dados ao construtor com 2 atributos
        }
        System.out.println("\nAccount Data:");
        System.out.println(bank); // retorno das informações bancárias

        System.out.print("\nEnter a deposit value: ");
        double deposit = sc.nextDouble();
        bank.newDeposit(deposit); // função para adicionar o depósito na conta
        System.out.println("Updated account data:");
        System.out.println(bank); // retorno das informações bancárias pós depósito

        System.out.print("\nEnter a withdraw value: ");
        double withdraw = sc.nextDouble();
        bank.newWithdraw(withdraw); // função para retirar o saque da conta
        System.out.println("Updated account data:");
        System.out.println(bank); // retorno das informações bancárias pós saque
        sc.close();
    }
}