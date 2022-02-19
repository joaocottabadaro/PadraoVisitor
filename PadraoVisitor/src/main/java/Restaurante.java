public class Restaurante implements Lugar {

    String nome;
  String avaliacao;
  String localizacao;
  String categoria;
    String descricao;


    public Restaurante(String nome, String avaliacao, String localizacao, String categoria, String descricao) {
        this.nome = nome;
        this.avaliacao = avaliacao;
        this.localizacao = localizacao;
        this.categoria = categoria;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirRestaurante(this);
    }
}
