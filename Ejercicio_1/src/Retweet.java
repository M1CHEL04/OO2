public class Retweet {
    private Tweet origen;

    public Retweet(Tweet origen){
        this.origen = origen;
    }

    public boolean esOrigen(Tweet t){
        return this.origen.equals(t);
    }

}
