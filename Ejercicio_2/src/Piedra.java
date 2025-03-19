public class Piedra implements Elemento{

    public String juegaContra(Elemento e){
        return e.contraPiedra();
    }

    public String contraPiedra(){
        return "Empate";
    }

    public String contraPapel(){
        return "Gana Piedra";
    }

    public String contraTijera(){
        return "Gana Piedra";
    }

    public String contraSpock(){
        return "Gana Spock";
    }

    public String contraLagarto(){
        return "Gana Piedra";
    }
}
