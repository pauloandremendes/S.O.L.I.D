package lsp;

public class CadastroGoverno {
	
	public static void main(String[] args) {
		
	PessoaJuridica Empresa = new PessoaJuridica();
	Empresa.setCnpj("00.000.000./0004-44");
	Empresa.setNome("GoodLab");
	
	System.out.print("O nome da pessoa Juridica é: " + Empresa.getNome());
	System.out.println("\nO CNPJ da pessoa Juridica é " + Empresa.getCnpj());
				
	PessoaFisica Humano = new PessoaFisica();
	Humano.setCpf("000.000.000-00");
	Humano.setNome("João");
	
	System.out.print("O nome da pessoa fisica é " + Humano.getNome());
	System.out.println("\nO CPF da mesma é " + Humano.getCpf());
	
	}

}
