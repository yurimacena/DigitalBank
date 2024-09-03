package desafio_dio_banco;

public interface InterfaceAccount {
    void withdraw(double value);
    void deposit(double value);
    void transfer(double value, Account destineAccount);
    void printExtract();
}
