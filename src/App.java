import java.util.Scanner;

import DAO.LivroDAO;
import entity.Livro;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitura = new Scanner(System.in);
        Livro u = new Livro();

        // System.out.println("Digite o ID do livro:");
        // int codigo = leituraint.nextInt();
        // u.setCodigo(codigo);

        System.out.println("Digite o nome do Livro: ");
        String nome = leitura.nextLine();
        u.setNomeLivro(nome);

        System.out.println("Digite o tema do livro: ");
        String tema = leitura.nextLine();
        u.setTemaLivro(tema);

        System.out.println("Digite o estado do livro (Disponível/Indisponível):");
        String estado = leitura.nextLine();
        u.setEstadoLivro(estado);

        new LivroDAO().cadastrarLivro(u);
    }
}
