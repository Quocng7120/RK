package vti.backend.datalayer;

import vti.entity.Project;
import vti.entity.User;

import java.sql.SQLException;
import java.util.ArrayList;

public interface IProjectRepository {
    Project getProjectById(int id) throws SQLException, ClassNotFoundException;
    ArrayList<Integer> getManagerProject() throws SQLException, ClassNotFoundException;
}
