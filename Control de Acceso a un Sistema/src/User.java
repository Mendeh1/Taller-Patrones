public class User {
    private String username;
    private String accessLevel;

    public User(String username, String accessLevel) {
        this.username = username;
        this.accessLevel = accessLevel;
    }

    // Implementa los métodos equals() y hashCode() para comparar usuarios
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return username.equals(user.username) && accessLevel.equals(user.accessLevel);
    }

    @Override
    public int hashCode() {
        return username.hashCode() + accessLevel.hashCode();
    }
}