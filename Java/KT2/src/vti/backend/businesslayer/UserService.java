package vti.backend.businesslayer;


import vti.backend.datalayer.IUserRepository;
import vti.backend.datalayer.ProjectRepository;
import vti.backend.datalayer.UserRepository;
import vti.entity.Project;
import vti.entity.User;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserService implements IUserService {

	private IUserRepository userRepository;

	public UserService() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		userRepository = new UserRepository();
	}

	@Override
	public List<User> getListUsers() throws SQLException, ClassNotFoundException {
		return userRepository.getListUsers();
	}

	@Override
	public User getUserById(int id) throws SQLException, ClassNotFoundException {
		return userRepository.getUserById(id);
	}

	@Override
	public int deleteUser(int id) throws ClassNotFoundException, SQLException {
		return userRepository.deleteUser(id);
	}

	@Override
	public boolean isUserIdExits(int id) throws SQLException, ClassNotFoundException {
		return userRepository.isUserIdExits(id);
	}

	@Override
	public List<User> getListUsersInProject(int projectId) throws SQLException, IOException, ClassNotFoundException {
		List<User> listUser = new ArrayList<>();
		ProjectRepository projectRepository = new ProjectRepository();
		UserRepository userRepository = new UserRepository();

		Project project = projectRepository.getProjectById(projectId);

		listUser.add(userRepository.getUserById(project.getIdManager()));
		for (Integer userId : project.getIdEmployees()){
			listUser.add(userRepository.getUserById(userId));
		}
		listUser.remove(0);
		return listUser;
	}

	@Override
	public List<User> getListAllUsersInProject() throws SQLException, IOException, ClassNotFoundException {
		List<User> listUser = new ArrayList<>();
		ProjectRepository projectRepository = new ProjectRepository();
		UserRepository userRepository = new UserRepository();

		for (Integer userId : projectRepository.getManagerProject()){
			listUser.add(userRepository.getUserById(userId));
		}
		return listUser;
	}


	@Override
	public User login(String email, String password) throws Exception {
		return userRepository.login(email, password);
	}



}
