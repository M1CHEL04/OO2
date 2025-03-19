public class Lagarto implements Elemento{

    public String juegaContra(Elemento elemento) {
        return elemento.contraLagarto();
    }

    public String contraPiedra(){
        return "Gana Piedra";
    }

    public String contraPapel(){
        return "Gana Lagarto";
    }

    public String contraTijera(){
        return "Gana Tijera";
    }

    public String contraSpock(){
        return "Gana Lagarto";
    }

    public String contraLagarto(){
        return "Empate";
    }
}
