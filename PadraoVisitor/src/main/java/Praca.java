public class Praca implements  Lugar{


    String nome;
    String avaliacao;
    String localizacao;
    String descricao;


    public Praca(String nome, String avaliacao, String localizacao, String descricao) {
        this.nome = nome;
        this.avaliacao = avaliacao;
        this.localizacao = localizacao;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirPraca(this);
    }
}
