package desafio_dio_banco;

import java.util.Scanner;

public abstract class Main extends Account {
    public static void main(String[] args) {
        String name;
        int options;
        double depositValue;
        double transferValue;

        Account cc = new CheckingAccount();
        Account sc = new SavingsAccount();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to digital bank made in Java!\nPlease, tell me your name.");
        name = scanner.nextLine();
        
        System.out.println("Hello, " + name + "! What should we do now?");
        System.out.println
            ("[1] Deposit\n[2] Transfer\n[3] Show extract");
        options = scanner.nextInt();

        switch (options) {
            case 1 -> {
                System.out.println("How much do you want to deposit in your account?");
                depositValue = scanner.nextDouble();
                cc.deposit(depositValue);
                System.out.println("You have R$" + depositValue + " deposited in your account.\n");
                cc.printExtract();
                sc.printExtract();
            }
            case 2 -> {
                System.out.println("How much do you want to transfer in your account?");
                transferValue = scanner.nextDouble();
                cc.transfer(transferValue, sc);
                System.out.println("You have R$" + transferValue + " transferred in your account.\n");
                cc.printExtract();
                sc.printExtract();
            }
            case 3 -> {
                cc.printExtract();
                sc.printExtract();
            }
        }
    }
}
