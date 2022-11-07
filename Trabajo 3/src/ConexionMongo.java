/*import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Projections;
import com.mongodb.client.model.Sorts;
import org.bson.conversions.Bson;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.Document;
import com.mongodb.MongoException;

public class ConexionMongo {

    public static void main(String[] args) {
        String uri = "mongodb://localhost:27017";
        try(MongoClient mongoClient = MongoClients.create(uri)){
            MongoDatabase database = mongoClient.getDatabase("prueba");
            MongoCollection<Document> collection = database.getCollection("trin");

            try {
                Bson command = new BsonDocument("ping", new BsonInt64(1));
                Document commandResult = database.runCommand(command);
                System.out.println("Connected successfully to server.");
            } catch (MongoException me) {
                System.err.println("An error occurred while attempting to run a command: " + me);
            }

            // Colection use
            // TODO: Make structure to use this functions from front
            Bson projectionFields = Projections.fields(
                    Projections.include("nombre", "salario"),
                    Projections.excludeId());
            Document doc = collection.find()
                    .projection(projectionFields)
                    .sort(Sorts.descending("salario"))
                    .first();
            if (doc == null) {
                System.out.println("No results found.");
            } else {
                System.out.println(doc.get("nombre"));
                System.out.println(doc.get("salario"));
            }

        }catch (MongoException me) {
            System.err.println("An error occurred while attempting to run a command: " + me);
        }

    }

}
*/