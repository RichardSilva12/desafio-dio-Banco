
public class Main {
    public static void main(String[] args) {
		Cliente richard = new Cliente();
		richard.setNome("Richard");
		
		Conta cc = new ContaCorrente(richard);
		Conta poupanca = new ContaPoupanca(richard);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
