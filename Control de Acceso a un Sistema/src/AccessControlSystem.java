import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccessControlSystem {

    // Instancia única de la clase AccessControlSystem
    private static AccessControlSystem instance = null;

    // Lista privada de usuarios registrados
    private List<User> registeredUsers;

    // Mapa que almacena el estado de las puertas (abiertas/cerradas)
    private Map<String, Boolean> doorStates;

    // Constructor privado para evitar la creación de instancias directamente
    private AccessControlSystem() {
        registeredUsers = new ArrayList<>();
        doorStates = new HashMap<>();
    }

    // Método estático para obtener la única instancia de la clase AccessControlSystem
    public static AccessControlSystem getInstance() {
        if (instance == null) {
            instance = new AccessControlSystem();
        }
        return instance;
    }

    // Método para agregar usuarios
    public void addUser(User user) {
        registeredUsers.add(user);
    }

    // Método para validar el acceso de un usuario a una puerta
    public boolean validateAccess(User user, String doorId) {
        for (User registeredUser : registeredUsers) {
            if (registeredUser.equals(user)) {
                // Usuario encontrado en la lista de usuarios registrados
                if (doorStates.containsKey(doorId)) {
                    // Puerta encontrada en el mapa de estados de puertas
                    return doorStates.get(doorId); // Devuelve el estado de la puerta
                }
            }
        }
        return false; // Usuario no encontrado o puerta no registrada
    }

    // Método para cambiar el estado de una puerta (abierta/cerrada)
    public void changeDoorState(String doorId, boolean isOpen) {
        doorStates.put(doorId, isOpen);
    }
}


