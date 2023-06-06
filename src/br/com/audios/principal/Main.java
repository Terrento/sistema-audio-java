package br.com.audios.principal;

import br.com.audios.modelos.MinhasPreferidas;
import br.com.audios.modelos.Musica;
import br.com.audios.modelos.Podcast;

public class Main {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();

        minhaMusica.setTitulo("Cosmic Ice Cream");
        minhaMusica.setCantor("PixelCherries");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curtir();
        }

        Podcast meuPodcast = new Podcast();

        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setHost("Marcos Mendes");

        for (int i = 0; i < 100; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 600; i++) {
            meuPodcast.curtir();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}