public class Tijera implements Elemento{

    public String juegaContra(Elemento elemento) {
        return elemento.contraTijera();
    }

    public String contraPiedra(){
        return "Gana Piedra";
    }

    public String contraPapel(){
        return "Gana Tijera";
    }

    public String contraTijera(){
        return "Empate";
    }

    public String contraSpock(){
        return "Gana Spock";
    }

    public String contraLagarto(){
        return "Gana Tijera";
    }
}
