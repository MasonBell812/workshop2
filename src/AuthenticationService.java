import java.util.ArrayList;

public class AuthenticationService implements IAuthenticationService {
    private ArrayList<User> users;

    // TODO Now: Add a constructor to initialize the users list with the default user
    public AuthenticationService(ArrayList<User> users){
        this.users = users;
        this.users.add(new User("test", "test"));
    }

    // TODO Now: Implement the signUp method to add a new user to the list if the username is not taken and return the user; returns null otherwise
    @Override
    public User signUp(String username, String password) {
        for(int i = 0; i < this.users.size(); i++){
            User u = users.get(i);
            if(u.getUsername().equals(username)){
                return null;
            }
        }
        User newUser = new User(username, password);
        users.add(newUser);
        return newUser;
    }

    // TODO Now: Implement the logIn method to return the user if the username and password match, and null otherwise
    @Override
    public User logIn(String username, String password) {
        for(int i = 0; i < this.users.size(); i++){
            User u = users.get(i);
            if(u.getUsername().equals(username) && u.getPassword().equals(password)){
                return u;
            }
        }
        return null;
    }
}
