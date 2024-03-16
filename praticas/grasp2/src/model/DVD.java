package model;

public class DVD {
    private final String titulo;
    private TipoClassificacao tipoClassificacao;

    public DVD(String titulo, TipoClassificacao tipoClassificacao) {
        this.titulo = titulo;
        this.tipoClassificacao = tipoClassificacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public TipoClassificacao getTipoClassificacao() {
        return tipoClassificacao;
    }

    public void setTipoPreco(TipoClassificacao tipoPreco) {
        this.tipoClassificacao = tipoPreco;
    }

    public double calcularPreco() {
        return tipoClassificacao.getPreco(this);
    }
}