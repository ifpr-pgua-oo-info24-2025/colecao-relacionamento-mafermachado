public class LivroDigital extends Livro {
    private Double tamanhoDoArquivoMB;
    
    public LivroDigital(String titulo, Integer anoPublicacao, Autor autor, Double tamanhoDoArquivoMB) {
     super(titulo, anoPublicacao, autor);
     this.tamanhoDoArquivoMB = tamanhoDoArquivoMB;
 }
 
     public Double gettamanhoDoArquivoMB() {
         return tamanhoDoArquivoMB;
     }
 
     public void settamanhoDoArquivoMB(Double tamanhoDoArquivoMB) {
         this.tamanhoDoArquivoMB = tamanhoDoArquivoMB;
     }
     public void exibirDetalhes() {
         super.exibirDetalhes(); 
         System.out.println("Tamanho do Arquivo " + tamanhoDoArquivoMB);
     }
 }