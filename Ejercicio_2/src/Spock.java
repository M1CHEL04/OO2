public class Spock implements Elemento{
    @Override
    public String juegaContra(Elemento elemento) {
        return elemento.contraSpock();
    }

    public String contraPiedra(){
        return "Gana Spock";
    }

    public String contraPapel(){
        return "Gana Papel";
    }

    public String contraTijera(){
        return "Gana Spock";
    }

    public String contraSpock(){
        return "Empate";
    }

    public String contraLagarto(){
        return "Gana Lagarto";
    }
}
