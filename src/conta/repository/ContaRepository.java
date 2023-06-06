package conta.repository;

import conta.model.Conta;
public interface ContaRepository {
	
	//CRUD da conta(Create, Read, Update e Delete)
	
	public void procurarPorNumero(int numero);
	public void listarTodas();
	public void cadastrar(Conta Conta);
	public void atualizar(Conta conta);
	public void deletar(int numero);
	
	
	//Métodos Bancários
	
	public void sacar(int numero, float valor);
	public void depositar(int numero, float valor);
	public void transferir(int numeroOrigem, int numeroDestino, float valor);
}
