package Entities;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.util.Date;

@Entity("User")
public class User {

    @Id
    private ObjectId objectId;

    private String firstName;

    private String lastName;

    private Date birthDate;

    private Boolean hasPremiumAccess;

    public User(){}

    public User(String firstName, String lastName, Date birthDate,
                boolean hasPremiumAccess) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hasPremiumAccess = hasPremiumAccess;
    }

    public ObjectId getObjectId() {
        return objectId;
    }

    public void setObjectId(ObjectId objectId) {
        this.objectId = objectId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Boolean getHasPremiumAccess() {
        return hasPremiumAccess;
    }

    public void setHasPremiumAccess(Boolean hasPremiumAccess) {
        this.hasPremiumAccess = hasPremiumAccess;
    }
}
