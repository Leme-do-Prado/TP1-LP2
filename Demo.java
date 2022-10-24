
public class Demo {

	public static void main(String[] args) {
			LivroDeBiblioteca L1 = new LivroDeBiblioteca("Introdução à POO usando JAVA", "Rafael Santos", "Campus / SBC", (short) 2003, "g11p17");			
			if(L1.getEmprestado() == false) {
				L1.Empresta();
				System.out.println("O livro " + L1.titulo + " foi emprestado com sucesso! Devera ser devolvido em " + L1.diasemprestimo + " dias.");
			} else if (L1.getEmprestado() == true){
				System.out.println("O livro " + L1.titulo + " se encontra indisponível.");
			}
									
			if(L1.getEmprestado() == false) {
				L1.Empresta();
				System.out.println("O livro " + L1.titulo + " foi emprestado com sucesso! Devera ser devolvido em " + L1.diasemprestimo + " dias.");
			} else if (L1.getEmprestado() == true){
				System.out.println("O livro " + L1.titulo + " se encontra indisponível.");
			}
				
	}

}
