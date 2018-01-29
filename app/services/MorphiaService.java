package services;

import com.mongodb.MongoClient;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

public class MorphiaService {
    private Morphia morphia;
    private Datastore datastore;

    public MorphiaService() {
        MongoClient mongoClient = new MongoClient("127.0.0.1:27017");
        this.morphia = new Morphia();

        String databaseName = "learning";
        this.datastore = morphia.createDatastore(mongoClient, databaseName);
    }

    public Morphia getMorphia() {
        return morphia;
    }

    public void setMorphia(Morphia morphia) {
        this.morphia = morphia;
    }

    public Datastore getDatastore() {
        return datastore;
    }

    public void setDatastore(Datastore datastore) {
        this.datastore = datastore;
    }
}
