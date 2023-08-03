package com.Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.DAO.DataDAO;
import com.Service.DataService;

public class DataController {

	public void insert() throws Exception {
		DataService ds = new DataService();
		ds.insert();

	}

	public void update() throws Exception {
		DataService ds = new DataService();
		ds.update();
	}

	public void delete() throws Exception {
		DataService ds = new DataService();
		ds.delete();
	}

	public void select() throws Exception {
		DataService ds = new DataService();
		ds.select();
	}

}
