package model;

public abstract class DVD {
    private String titulo;
    private boolean ehBonus = false;


    public DVD(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean ehBonus() {
        return ehBonus;
    }

    // Método setter para modificar o atributo ehBonus
    protected void setEhBonus(boolean ehBonus) {
        this.ehBonus = ehBonus;
    }

    public abstract double calcularPreco(int diasAlugados);
}