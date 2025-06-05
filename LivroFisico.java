public class LivroFisico extends Livro {
   private Integer numeroDePaginas;
   
   public LivroFisico(String titulo, Integer anoPublicacao, Autor autor, Integer numeroDePaginas) {
    super(titulo, anoPublicacao, autor);
    this.numeroDePaginas = numeroDePaginas;
}

    public Integer getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(Integer numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }
    public void exibirDetalhes() {
        super.exibirDetalhes(); 
        System.out.println("Número de Páginas: " + numeroDePaginas);
    }
}