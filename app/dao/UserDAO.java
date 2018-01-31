package dao;

import Entities.User;
import org.bson.types.ObjectId;
import org.mongodb.morphia.dao.DAO;

import java.util.List;

public interface UserDAO extends DAO<User, ObjectId>{
    User getByFirstNameLastName(String firstName, String lastName);
    List<User> getByFirstName(String firstName);
    User getByObjectId(String obId);
    List<User> getAll();
}
