package desafio_dio_banco;

public class CheckingAccount extends Account {

    public void printExtract() {
        System.out.println("== Checking account extact ==");
        super.printCommonInfos();
    }
}