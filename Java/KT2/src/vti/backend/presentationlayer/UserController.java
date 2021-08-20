package vti.backend.presentationlayer;


import vti.backend.businesslayer.IUserService;
import vti.backend.businesslayer.UserService;
import vti.entity.User;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class UserController {
    private IUserService userService;
    public UserController() throws ClassNotFoundException, IOException, SQLException {
        userService = new UserService();
    }


    public User login(String email, String password) throws Exception {
        return userService.login(email, password);
    }

    public List<User> getListAllUsersInProject() throws SQLException, IOException, ClassNotFoundException{
        return userService.getListAllUsersInProject();

    }

    public List<User> getListUsersInProject(int projectId) throws SQLException, IOException, ClassNotFoundException {
        return userService.getListUsersInProject(projectId);
    }
}
