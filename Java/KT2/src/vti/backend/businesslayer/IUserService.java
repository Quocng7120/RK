package vti.backend.businesslayer;


import vti.entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface IUserService {
	List<User> getListUsers() throws SQLException, ClassNotFoundException;

	User getUserById(int id) throws SQLException, ClassNotFoundException;

	int deleteUser(int id) throws ClassNotFoundException, SQLException;

	boolean isUserIdExits(int id) throws SQLException, ClassNotFoundException;

	List<User> getListUsersInProject(int projectId) throws SQLException, IOException, ClassNotFoundException;
	List<User> getListAllUsersInProject() throws SQLException, IOException, ClassNotFoundException;

	User login(String email, String password) throws Exception;
}
