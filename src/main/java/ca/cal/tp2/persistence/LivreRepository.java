package ca.cal.tp2.persistence;


import ca.cal.tp2.modele.Livre;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LivreRepository extends DocumentRepositoryJDBC {

//    public void saveLivre(Livre livre) {
//        String sql = "INSERT INTO livre (ISBN, titre, auteur, nombrePages) VALUES (?, ?, ?, ?);";
//        try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
//            preparedStatement.setString(1, livre.getISBN());
//            preparedStatement.setString(2, livre.getAuteur());  // Correction ici
//            preparedStatement.setString(3, livre.getEditeur());
//            preparedStatement.setInt(4, livre.getNombrePages());
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public Livre getLivre(String ISBN) {
//        Livre livre = null;
//        try (PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM LIVRE WHERE ISBN = ?")) {
//            preparedStatement.setString(1, ISBN);
//            ResultSet resultSet = preparedStatement.executeQuery();
//            if (resultSet.next()) {
//                livre = new Livre(
//                        resultSet.getString("ISBN"),
//                        resultSet.getString("titre"),  // Correction ici
//                        resultSet.getString("auteur"),
//                        resultSet.getInt("nombrePages")
//                );
//            }
//            return livre;
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }


}
