package com.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.DAO.DataDAO;

public class DataService {

	public void insert() throws Exception {
		DataDAO ss=new DataDAO();
		ss.insert();
	}

	public void update() throws Exception {
		DataDAO ss=new DataDAO();
		ss.update();
	}

	public void delete() throws Exception {
		DataDAO ss=new DataDAO();
		ss.delete();
	}

	public void select() throws Exception {
		DataDAO ss=new DataDAO();
		ss.select();
	}

}
