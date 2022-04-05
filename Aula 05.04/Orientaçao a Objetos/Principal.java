public class Principal{
    public static void main(String[] args) {
        //Objeto
        Livro livroCheio = new Livro("a", "a", "a", 1);
        Livro livroVazio = new Livro();
        //Método SET sempre armazena uma informação no atributo do objeto.
        livroVazio.setNome("Orientação a Objetos");
        livroVazio.setAutor("Diogo");
        livroVazio.setGenero("Ficção");
        livroVazio.setPaginas(32);
        //Método GET sempre retorna uma informção guardada no atributo do objeto.
        System.out.println(livroVazio.getNome()); 
        System.out.println(livroVazio.getAutor()); 
        System.out.println(livroVazio.getGenero());
        System.out.println(livroVazio.getPaginas());
        System.out.println(livroVazio);
        //Método SET sempre armazena uma informação no atributo do objeto.
        livroCheio.setNome("Orientação a Objetos");
        livroCheio.setAutor("Diogo");
        livroCheio.setGenero("Ficção");
        livroCheio.setPaginas(32);
        //Método GET sempre retorna uma informção guardada no atributo do objeto.
        System.out.println(livroCheio.getNome()); 
        System.out.println(livroCheio.getAutor()); 
        System.out.println(livroCheio.getGenero());
        System.out.println(livroCheio.getPaginas());
        System.out.println(livroCheio);

        // if (livroVazio == livroCheio) {
        //     System.out.println("Classes Iguais");
  
        // }
        // else {
        //     System.out.println("Classes diferentes");
        // }

        System.out.println(livroVazio);
        System.out.println(livroCheio);






        //Pesquisar Arraylist


    }
}

    