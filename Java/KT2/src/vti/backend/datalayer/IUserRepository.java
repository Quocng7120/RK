package vti.backend.datalayer;

import vti.entity.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserRepository {
    List<User> getListUsers() throws SQLException, ClassNotFoundException;

    User getUserById(int id) throws SQLException, ClassNotFoundException;

    int deleteUser(int id) throws ClassNotFoundException, SQLException;

    boolean isUserIdExits(int id) throws SQLException, ClassNotFoundException;

    User login(String email, String password) throws Exception;

}
