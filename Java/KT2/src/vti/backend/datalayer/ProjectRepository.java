package vti.backend.datalayer;

import vti.entity.Project;
import vti.utils.JdbcUtils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProjectRepository implements IProjectRepository{
    private JdbcUtils jdbcUltils;
    private Connection connection;

    public ProjectRepository() throws SQLException, IOException, ClassNotFoundException {
        jdbcUltils = new JdbcUtils();
    }

    @Override
    public Project getProjectById(int id) throws SQLException, ClassNotFoundException {
        connection = jdbcUltils.connect();
        String sql = " SELECT * " + " FROM `project` " + " WHERE id = ? ";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);

        ResultSet resultSet = preparedStatement.executeQuery();

        int projectId = 0;
        int teamSize = 0;
        while (resultSet.next()) {
            projectId = resultSet.getInt("id");
            teamSize = resultSet.getInt("teamSize");
        }

        String sql1 = " SELECT * " + " FROM `projectanduser` " + " WHERE projectId = ? ";
        PreparedStatement preparedStatement1 = connection.prepareStatement(sql1);
        preparedStatement1.setInt(1, id);

        ResultSet resultSet1 = preparedStatement1.executeQuery();

        int idManager = 0;
        ArrayList<Integer> idEmployees = new ArrayList<>();
        while (resultSet1.next()) {
            String role = resultSet1.getString("Role");
            if (role == "MANAGER"){
                idManager = resultSet1.getInt("uerId");

            }
            else {
                idEmployees.add(resultSet1.getInt("userId"));

            }
        }

        Project project = new Project(projectId, teamSize, idManager, idEmployees);
        connection.close();
        return project;

    }

    @Override
    public ArrayList<Integer> getManagerProject() throws SQLException, ClassNotFoundException {
        connection = jdbcUltils.connect();
        String sql1 = " SELECT * FROM `projectanduser`";
        PreparedStatement preparedStatement1 = connection.prepareStatement(sql1);

        ResultSet resultSet1 = preparedStatement1.executeQuery();

        ArrayList<Integer> idManagers = new ArrayList<>();
        while (resultSet1.next()) {
            String role = resultSet1.getString(3);
            if (role.equals("MANAGER")){
                idManagers.add(resultSet1.getInt(2));

            }
        }

        connection.close();
        return idManagers;
    }


}
