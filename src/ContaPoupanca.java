
public class ContaPoupanca extends Conta{
	
	@Override
	public void imprimirExtrato() {
		
		System.out.println("*** Extrato Conta Poupança ***");
		super.imprimirInfosComuns();
		
	}
	
	@Override
	public void imprimirSaldo() {
		
		System.out.println("*** Saldo Conta Poupança ***");
		super.imprimirInfosComuns();

	}
}
	
