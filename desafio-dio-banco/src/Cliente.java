
public class Cliente {

    // Atributos
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void pedirEmprestimo(Conta conta, double valorEmprestimo) {
        conta.saldo -= valorEmprestimo;
        System.out.println(String.format("Valor do Empréstimo: R$ %.2f", valorEmprestimo));

    }
}
