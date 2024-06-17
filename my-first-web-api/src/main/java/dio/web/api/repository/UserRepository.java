package dio.web.api.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import dio.web.api.model.Usuario;

@Repository
public class UserRepository {
    public void save(Usuario usuario){
        System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }
    public void update(Usuario usuario){
        System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }
    public void remove(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    public List<Usuario> findAll(){
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("ayla","gaga"));
        usuarios.add(new Usuario("natalia","lady"));
        return usuarios;
    }
    public Usuario finById(Integer id){
        System.out.println(String.format("GET/id - Recebendo o id: %d para localizar um usuário", id));
        return new Usuario("ayla","gaga");
    }
    public Usuario findByUsername(String username) {
        // TODO Auto-generated method stub
        System.out.println(String.format("GET/username - Recebendo username para localixar usuario: ", username));
        return new Usuario("ayla", "gaga");
    }

}
