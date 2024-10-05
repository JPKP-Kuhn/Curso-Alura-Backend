import br.com.alura.audio.MinhasPreferidas;
import br.com.alura.audio.Musica;
import br.com.alura.audio.Podcast;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setArtista("Kiss");

        for (int i = 0; i < 3000; i++) {
            minhaMusica.reproduzir();
        }

        for (int i = 0; i < 500; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setApresentador("Marcus Mendes");

        for (int i = 0; i < 50; i++) {
            meuPodcast.reproduzir();
        }

        for (int i = 0; i < 20; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferida = new MinhasPreferidas();
        preferida.inclui(meuPodcast);
        preferida.inclui(minhaMusica);
    }
}