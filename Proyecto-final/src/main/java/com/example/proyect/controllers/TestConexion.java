package com.example.proyect.controllers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConexion {
	public static void main(String[] args) {
		Conexion conexion = new Conexion();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
		try {
			cn = conexion.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT * FROM clientes");
			
			while(rs.next()) {
				int idClientes = rs.getInt(1);
				String Nombres =  rs.getString(2);
				String Apellidos = rs.getString(3);
				String Telefono = rs.getString(4);
				String Correo = rs.getString(5);
				
				System.out.println(idClientes + " - " + Nombres + " - " + Apellidos + " - " + Telefono + " - " + Correo);
			}
			
		} catch (SQLException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
		finally {
			try {
				
				if(rs != null) {
					rs.close();
				}
				
				if(stm != null) {
					stm.close();
				}
				
				if(cn != null) {
					cn.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
