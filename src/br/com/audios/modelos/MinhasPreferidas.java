package br.com.audios.modelos;

public class MinhasPreferidas {
    public void inclui(Classificacao classificacao){
        if (classificacao.getClassificacao() >= 9){
            System.out.println("É considerado sucesso absoluto e preferido por todos");
        } else {
            System.out.println("Também é um dos que todo mundo está curtindo");
        }
    }
}
