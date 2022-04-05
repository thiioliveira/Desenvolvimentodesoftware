public class ComparacaoObjeto {

    public static void main(String[] args) {
        
        Livro livro1 = new Livro();
        Livro livro2 = new Livro();

        livro1.setNome("Orientação a Objetos");
        livro1.setAutor("Diogo");

        livro2.setNome("Orientação a Objetos");
        livro2.setAutor("Diogo");

        System.out.println(livro1);
        System.out.println(livro2);


    }
}
