package br.com.audios.modelos;

public class Audio {
    private int totalDeReproducoes;
    private int curtidas;
    private int classificacao;
    private String titulo;

    public void curtir(){
        this.curtidas++;
    }

    public void reproduz(){
        this.totalDeReproducoes++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

}
