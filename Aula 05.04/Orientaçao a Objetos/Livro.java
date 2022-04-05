//Classe de modelo

//Atributos ou propriedades
/*
    id -> string
    páginas -> string
    autor -> string
    editora -> string
    nome -> string
    genero -> string
    data lançamento -> string
    edição -> string
    material capa -> string
    isbn -> string
*/
public class Livro {

    //Construtor
    //Deve ter o mesmo nome da classe
    public Livro(String nome, String autor, String genero, int paginas){
        this.nome = nome;
        this.autor = autor;
        this.genero = genero;
        this.paginas = paginas;

    }
    public Livro(){

    }




    //Propriedades ou atributos
    private String nome;
    private String autor;
    private String genero;
    private int paginas;

    //Métodos de acesso ao atributo NOME
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return "Livro: " + this.nome;
    }
    //Métodos de acesso ao atributo AUTOR
    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getAutor(){
        return "Autor: " + this.autor;
    }
    //Métodos de acesso ao atributo GENERO
    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getGenero(){
        return "Genero: " + this.genero;
    }
    //Métodos de acesso ao atributo PÁGINAS
    public void setPaginas(int paginas){
        this.paginas = paginas;
    }
    public String getPaginas(){
        return this.paginas + " Páginas";
    }
    // // @Override
    // // public String toString() {
    // //     return "Nome: " + nome + "\nAutor: " + autor + "\nGenero: " + genero + "\n" + paginas + " Páginas" ;
    // }
    @Override
    public boolean equals(Object obj) {
        Livro outroLivro = (Livro) obj;
        if (getNome().equals(outroLivro.getNome()))  {
            return true;            
        }
        return false;

        // System.out.println(obj);
    }

    

}
