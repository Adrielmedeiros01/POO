public class Main {

    public static void main(String[] args){

        Conta_corrente c1 = new Conta_corrente();

        c1.exibir_saldo();
        c1.depositar(100);
        c1.exibir_saldo();
        c1.sacar(200);
        c1.exibir_saldo();
        c1.depositar(500);
        c1.exibir_saldo();


    }
}
