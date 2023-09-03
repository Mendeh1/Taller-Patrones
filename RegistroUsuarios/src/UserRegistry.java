import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class UserRegistry {

    // Instancia única de la clase UserRegistry
    private static UserRegistry instance = null;

    // Lista privada para almacenar objetos de tipo User
    private List<User> userList;

    // Constructor privado para evitar la creación de instancias directamente
    private UserRegistry() {
        userList = new ArrayList<>();
    }

    // Método estático para obtener la única instancia de la clase UserRegistry
    public static UserRegistry getInstance() {
        if (instance == null) {
            instance = new UserRegistry();
        }
        return instance;
    }

    // Método para agregar un usuario a la lista
    public void addUser(User user) {
        userList.add(user);
    }

    // Método para obtener la lista completa de usuarios
    public List<User> getUsers() {
        return userList;
    }

    // Método para buscar un usuario por su nombre de usuario
    public User getUserByUsername(String username) {
        for (User user : userList) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null; // Devolver null si no se encuentra el usuario
    }
}


