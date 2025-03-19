public class Tweet {
    private String texto;

    public Tweet(String t){
        this.texto = t;
    }

    public String getTexto(){
        return this.texto;
    }

    public static boolean valido (String texto){
        return texto.length() >= 1 && texto.length()<=280;
    }
}
