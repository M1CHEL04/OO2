import java.util.ArrayList;
import java.util.List;

public class Twitter {
    //Se podria usar un Set
    public List<Usuario> usuarios;

    public Twitter(){
        this.usuarios = new ArrayList<Usuario>();
    }

    public void agregarUsuario(Usuario u){
        if(this.usuarios.stream()
                .anyMatch(user -> user.esMiNickname(u.getNickname()))){
            this.usuarios.add(u);
        }
    }

    //Suponiendo que el usuario existe en el sitema
    public void eliminarUsuario(Usuario u){
        u.eliminarTweets(); u.eliminarRetweets();
        this.usuarios.removeIf(aux -> aux.equals(u));
    }
}
