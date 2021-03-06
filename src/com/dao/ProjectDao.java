package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.bean.ProjectBean;
import com.util.DbConnection;

public class ProjectDao {

	public void insertProject(ProjectBean projectBean) {

		try {
			Connection con = DbConnection.getConnection();
			// insert
			// PreparedStatement ==> db
			PreparedStatement pstmt = con.prepareStatement("insert into project (title,description) values (?,?)");
			pstmt.setString(1, projectBean.getTitle());
			pstmt.setString(2, projectBean.getDescription());

			int record = pstmt.executeUpdate();// execute yr query in db
			// hw many records are affected by your query
			System.out.println(record + " row inserted.....");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public ArrayList<ProjectBean> getAllProjects() {

		ArrayList<ProjectBean> projects = new ArrayList<>();// null
		try {

			Connection con = DbConnection.getConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from project");

			ResultSet rs = pstmt.executeQuery();// 3

			// rs --> ????

//			rs.next(); // true --> jump to the nextRecord --> first
//			rs.next(); // true
//			rs.next();// true
//			rs.next();// false

			while (rs.next()) {
				// 1st record
				// extract
				int projectId = rs.getInt("projectid");
				String title = rs.getString("title");
				String description = rs.getString("description");

				ProjectBean project = new ProjectBean();
				project.setProjectId(projectId);
				project.setTitle(title);
				project.setDescription(description);
				projects.add(project);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return projects;// size -> 0
	}

	public void deleteProject(int projectId) {

		try (Connection con = DbConnection.getConnection();
				PreparedStatement pstmt = con.prepareStatement("delete from project where projectid = ? ");

		) {

			pstmt.setInt(1, projectId);
			int r = pstmt.executeUpdate();
			System.out.println(r + " record deleted....");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public ArrayList<ProjectBean> searchProjec(String searchName) {

		ArrayList<ProjectBean> projects = new ArrayList<>();// null
		try {

			Connection con = DbConnection.getConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from project where title like ?");
			pstmt.setString(1, searchName + "%");

			ResultSet rs = pstmt.executeQuery();// 3

			// rs --> ????

//			rs.next(); // true --> jump to the nextRecord --> first
//			rs.next(); // true
//			rs.next();// true
//			rs.next();// false

			while (rs.next()) {
				// 1st record
				// extract
				int projectId = rs.getInt("projectid");
				String title = rs.getString("title");
				String description = rs.getString("description");

				ProjectBean project = new ProjectBean();
				project.setProjectId(projectId);
				project.setTitle(title);
				project.setDescription(description);
				projects.add(project);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return projects;// size -> 0
	}

	public ProjectBean getProjectById(int projectId) {
		ProjectBean project = new ProjectBean();

		try {

			Connection con = DbConnection.getConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from project where projectid = ? ");
			pstmt.setInt(1, projectId);

			ResultSet rs = pstmt.executeQuery();// 3

			while (rs.next()) {
				// 1st record
				// extract
				String title = rs.getString("title");
				String description = rs.getString("description");

				project.setProjectId(projectId);
				project.setTitle(title);
				project.setDescription(description);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return project;// size -> 0
	}

	public void updateProject(ProjectBean project) {
		try (Connection con = DbConnection.getConnection();
				PreparedStatement pstmt = con
						.prepareStatement("update project set title = ? , description = ? where projectid = ? ");) {

			pstmt.setString(1, project.getTitle());
			pstmt.setString(2, project.getDescription());
			pstmt.setInt(3, project.getProjectId());
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
