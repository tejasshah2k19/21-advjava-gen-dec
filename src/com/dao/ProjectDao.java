package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

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
}
