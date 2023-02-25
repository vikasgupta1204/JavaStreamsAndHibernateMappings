package SupplierInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapCollectExample {
    public static void main(String[] args) {

        List<User> users=new ArrayList<User>();
        users.add(new User(1,"Ganesh","Rathore","ganesh@gmail.com"));
        users.add(new User(2,"Rahul","Dravid","rahul@gmail.com"));

        users.add(new User(3,"Praveen","kumar","praveen@gmail.com"));

        users.add(new User(4,"Suresh","Raina","suresh@gmail.com"));

        users.add(new User(5,"Venktesh","Prasad","ventkesh@gmail.com"));

        users.add(new User(6,"Anil","kumble","anil@gmail.com"));

        List<UserDTO> userDTOS = users.stream().map((User user)->new UserDTO(user.getId(),user.getUserName(),user.getEmail())).collect(Collectors.toList());
        userDTOS.forEach(System.out::println);

    }
}

class UserDTO{
private int id;
private String userName;
private String email;

    @Override
    public String toString() {
        return "UserDTO{" + "id=" + id + ", userName='" + userName + '\'' + ", email='" + email + '\'' + '}';
    }

    public UserDTO(int id, String userName, String email) {
        this.id = id;
        this.userName = userName;
        this.email = email;
    }
}
