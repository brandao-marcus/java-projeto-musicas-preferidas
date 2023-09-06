package br.com.alura.minhasmusicas.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " É considerada sucesso absoluto ao redor do mundo!");
        } else {
            System.out.println(audio.getTitulo() + " Está entre as mais tocadas da Billboard");
        }
    }


}
