import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Livro> biblioteca = new ArrayList<>();

        Autor autor1 = new Autor("Matt Haig", "Britânico");            
        Autor autor2 = new Autor("Jenna Evans Welch", "Americana");    
        Autor autor3 = new Autor("J.K. Rowling", "Britânica");         
        Autor autor4 = new Autor("Lucy Maud Montgomery", "Canadense"); 

       
        LivroFisico livroFisico1 = new LivroFisico("A Biblioteca da Meia-Noite", 2020, autor1, 304);
        LivroFisico livroFisico2 = new LivroFisico("Amor e Gelato", 2016, autor2, 368);

        
        LivroDigital livroDigital1 = new LivroDigital("Harry Potter e a Pedra Filosofal", 1997, autor3, 7.2);
        LivroDigital livroDigital2 = new LivroDigital("Anne of Green Gables", 1908, autor4, 5.7);

        biblioteca.add(livroFisico1);
        biblioteca.add(livroFisico2);
        biblioteca.add(livroDigital1);
        biblioteca.add(livroDigital2);

        for (Livro livro : biblioteca) {
            livro.exibirDetalhes();
            
        }
    }
}
