package vti.entity;

import java.util.ArrayList;

public class Project {
    private int projectId;
    private int teamSize;
    private int idManager;
    private ArrayList<Integer> idEmployees;


    public Project(int projectId, int teamSize, int idManager, ArrayList<Integer> idEmployees) {
        this.projectId = projectId;
        this.teamSize = teamSize;
        this.idManager = idManager;
        this.idEmployees = idEmployees;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public int getIdManager() {
        return idManager;
    }

    public void setIdManager(int idManager) {
        this.idManager = idManager;
    }

    public ArrayList<Integer> getIdEmployees() {
        return idEmployees;
    }

    public void setIdEmployees(ArrayList<Integer> idEmployees) {
        this.idEmployees = idEmployees;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectId=" + projectId +
                ", teamSize=" + teamSize +
                ", idManager=" + idManager +
                ", idEmployees=" + idEmployees +
                '}';
    }
}
