import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência:");
        int agencia = scanner.nextInt();

        // Limpeza do buffer após a leitura do número da agência
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        String numero = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        // Criando o objeto ContaBanco com os dados fornecidos
        ContaBanco conta = new ContaBanco(numero, agencia, nomeCliente, saldo);

        // Exibindo os dados da conta
        System.out.println("Olá " + conta.getNomeCliente() + ", obrigada por criar sua conta em nosso banco!"); 
        System.out.println("o número da conta é: " + conta.getNumero());
        System.out.println("Agência: " + conta.getAgencia());
        System.out.println("Saldo: " + conta.getSaldo());

        scanner.close();
    }
}

class ContaBanco {
    private String numero;
    private int agencia;
    private String nomeCliente;
    private double saldo;

    // Construtor
    public ContaBanco(String numero, int agencia, String nomeCliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    // Getters e Setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
