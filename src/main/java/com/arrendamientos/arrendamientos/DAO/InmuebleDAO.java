package com.arrendamientos.arrendamientos.DAO;

import com.arrendamientos.arrendamientos.model.Inmueble;
import com.arrendamientos.arrendamientos.util.DBConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class InmuebleDAO {
    private static final String SELECT_ALL_Inmuebles = "SELECT * FROM inmuebles";
    private static final String INSERT_Inmueble = "INSERT INTO inmuebles()";

    public List<Inmueble> getAllInmuebles(){
        List<Inmueble> inmuebles = new ArrayList<>();

        try (Connection connection = DBConnectionUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_Inmuebles);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while(resultSet.next()){
                int idInmueble = resultSet.getInt("idInmueble");
                String direccion = resultSet.getString("direccion");
                String tipo= resultSet.getString("tipo");
                Double precio= resultSet.getDouble("precio");
                double area= resultSet.getDouble("area");
                int habitaciones= resultSet.getInt("habitaciones");
                int banos = resultSet.getInt("banos");
                String descripcion= resultSet.getString("descricion");
                String fotoURL= resultSet.getString("fotoURL");

                Inmueble inmueble = new Inmueble(tipo,descripcion,area,precio,direccion,habitaciones,banos,fotoURL);
            }

        } catch (SQLException e){
            e.printStackTrace();
        }
        return inmuebles;
    }

    public void agregarInmueble(Inmueble inmueble){
        try(Connection connection = DBConnectionUtil.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_Inmueble)){

            preparedStatement.setInt(1,inmueble.getIdInmueble());
            preparedStatement.setString(2,inmueble.getDireccion());
            preparedStatement.setString(3, inmueble.getTipo());
            preparedStatement.setDouble(4,inmueble.getPrecio());
            preparedStatement.setDouble(5,inmueble.getArea());
            preparedStatement.setInt(6,inmueble.getHabitaciones());
            preparedStatement.setInt(7,inmueble.getBanos());
            preparedStatement.setString(8, inmueble.getDescripcion());
            preparedStatement.setString(9, inmueble.getFotoURL());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void actualizarInmueble(Inmueble inmueble) {
        String UPDATE_INMUEBLE = "UPDATE inmuebles SET direccion = ?, tipo = ?, precio = ?, area = ?, habitaciones = ?, banos = ?, descripcion = ?, fotoURL = ? WHERE idInmueble = ?";

        try (Connection connection = DBConnectionUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_INMUEBLE)) {

            preparedStatement.setInt(1, inmueble.getIdInmueble());
            preparedStatement.setString(2, inmueble.getDireccion());
            preparedStatement.setString(3, inmueble.getTipo());
            preparedStatement.setDouble(4, inmueble.getPrecio());
            preparedStatement.setDouble(5, inmueble.getArea());
            preparedStatement.setInt(6, inmueble.getHabitaciones());
            preparedStatement.setInt(7, inmueble.getBanos());
            preparedStatement.setString(8, inmueble.getDescripcion());
            preparedStatement.setString(9, inmueble.getFotoURL());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminarInmueble(int idInmueble) {
        String DELETE_INMUEBLE = "DELETE FROM inmuebles WHERE idInmueble = ?";

        try (Connection connection = DBConnectionUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_INMUEBLE)) {

            preparedStatement.setInt(1, idInmueble);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



}
