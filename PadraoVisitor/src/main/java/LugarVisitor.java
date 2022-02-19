public class LugarVisitor implements  Visitor {

    public String exibir(Lugar lugar) {
        return lugar.aceitar(this);
    }

    @Override
    public String exibirAcademia(Academia academia) {
        return "Academia{" +
                "Nome = " + academia.getNome() +
                ",Descrição = " + academia.getDescricao() +
                ",Avaliação = " + academia.getAvaliacao() +
                ",Localização ='" + academia.getLocalizacao() + '\'' +
                '}';
    }

    @Override
    public String exibirRestaurante(Restaurante restaurante) {
        return "Restaurante{" +
                "Nome=" + restaurante.getNome() +
                ",Categoria = " + restaurante.getCategoria() +
                ",Descrição = " + restaurante.getDescricao() +
                ",Avaliação = " + restaurante.getAvaliacao() +
                ",Localização = '" + restaurante.getLocalizacao() + '\'' +
                '}';
    }

    @Override
    public String exibirPraca(Praca praca) {
        return "Praça{" +
                "Nome = " + praca.getNome() +
                ",Categoria = " + praca.getNome() +
                ",Descrição = " + praca.getDescricao() +
                ",Avaliação = " + praca.getAvaliacao() +
                ",Localização = '" + praca.getLocalizacao() + '\'' +
                '}';
    }
}
