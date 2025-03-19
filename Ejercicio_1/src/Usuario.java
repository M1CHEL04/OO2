import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nickName;
    private List<Tweet> tweets;
    private List<Retweet> retweets;

    public Usuario(String nickName){
        this.nickName = nickName;
        this.tweets = new ArrayList<Tweet>();
        this.retweets = new ArrayList<Retweet>();
    }

    public void agregarTweet(String texto){
        if(Tweet.valido(texto)){
            this.tweets.add(new Tweet(texto));
        }
    }

    public void agregarRetweet(Retweet rt){
        this.retweets.add(rt);
    }

    public void eliminarTweet(Tweet t){
        this.tweets.removeIf(aux-> aux.equals(t));
    }

    public void eliminarRetweet(Retweet rt){
        this.retweets.removeIf(aux-> aux.equals(rt));
    }

    public void eliminarTweets(){
        this.tweets.clear();
    }

    public void eliminarRetweets(){
        this.retweets.clear();
    }

    public String getNickname(){
        return this.nickName;
    }

    public boolean esMiNickname(String nm){
        return this.nickName.equals(nm);
    }

}
