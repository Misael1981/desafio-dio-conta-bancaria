public class Main {

    public static void main(String[] args) {

        Cliente misael = new Cliente();
        misael.setNome("Misael");

        Conta cc = new ContaCorrente(misael);
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(misael);
        cc.transferir(60, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        System.out.println("=== Pedir empréstimo ===");
        Cliente.pedirEmprestimo(poupanca, 1000.00);
        poupanca.imprimirExtrato();

    }
}
