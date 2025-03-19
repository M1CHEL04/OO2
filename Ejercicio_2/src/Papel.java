public class Papel implements Elemento{

    public String juegaContra(Elemento elemento) {
        return elemento.contraPapel();
    }

    public String contraPiedra(){
        return "Gana Papel";
    }

    public String contraPapel(){
        return "Empate";
    }

    public String contraTijera(){
        return "Gana Tijera";
    }

    public String contraSpock(){
        return "Gana Papel";
    }

    public String contraLagarto(){
        return "Gana Lagarto";
    }
}
