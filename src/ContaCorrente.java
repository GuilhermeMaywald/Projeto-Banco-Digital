
public class ContaCorrente extends Conta {

	@Override
	public void imprimirExtrato() {
		
		System.out.println("*** Extrato Conta Corrente ***");
		super.imprimirInfosComuns();
			
	}
	
	@Override
	public void imprimirSaldo() {
		
		System.out.println("*** Saldo Conta Corrente ***");
		super.imprimirInfosComuns();
		
	}	

}
