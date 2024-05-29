
public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }

    @Override
    public void pedirEmprestimo() {
        System.out.println("=== Pedir empréstimo ===");
        imprimirInfosComuns();
    }

}
