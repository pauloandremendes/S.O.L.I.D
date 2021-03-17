package isp;

public class Validacao {

	public static void main(String[] args) {
	
		Acessar admin = new LoginAdmin();
		admin.acessar();
		Acessar normal = new LoginNormal();
		normal.acessar();
		
		System.out.println("O usuário normal tem acessos correspondentes a: " + admin.acessar());
		System.out.println("O usuário normal tem acessos correspondentes a: " + normal.acessar());
		
	}

}
