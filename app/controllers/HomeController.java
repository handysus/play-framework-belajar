package controllers;

import Entities.User;
import dao.UserDAO;
import dao.UserDAOImpl;
import org.bson.types.ObjectId;
import org.mongodb.morphia.query.Query;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.*;
import services.MorphiaService;
import views.html.index;
import views.html.update;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    private MorphiaService morphiaService;
    private UserDAO userDAO;

    @Inject
    private FormFactory formFactory;

    public HomeController(){
        this.morphiaService = new MorphiaService();
        this.userDAO = new UserDAOImpl(User.class, morphiaService.getDatastore());
    }

    private void saveEntityExample(){
        User user1 = new User("Alex", "Foo", new Date(1978, 10, 10 ), true);
        User user2 = new User("Sacha", "Foo", new Date(1989, 2, 23), false);
        User user3 = new User("Alex", "Bar", new Date(1966, 5, 2), false);
        userDAO.save(user1);
        userDAO.save(user2);
        userDAO.save(user3);
    }

    private void saveByRequest(String fName, String lName, int year, int month, int date, Boolean isPremium){
        User user = new User(fName, lName, new Date(year, month, date ), isPremium);
        userDAO.save(user);
    }

    private List<User> retrieveByFirstName(String fName){
        try {
            return userDAO.getByFirstName(fName);
        }
        catch (Exception e){
            return new ArrayList<>();
        }
    }

    private List<User> retrieveAll(){
        try {
            return userDAO.getAll();
        }
        catch (Exception e){
            return new ArrayList<>();
        }
    }

    private User getByObjId(String objId){
        try {
            return userDAO.getByObjectId(objId);
        }
        catch (Exception e){
            return null;
        }
    }

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be c    alled when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
//        HomeController homeController = new HomeController();
        List<User> test =  retrieveAll();
        return ok(index.render(test));
    }

    public Result searchByFirstName(String fName){
        System.out.println(fName);
        List<User> test2 = retrieveByFirstName(fName);
        return ok(Json.toJson(test2));
    }

    public Result update(String objId) {
        User test = getByObjId(objId);
        return ok(update.render(test));
    }

    public Result delete(String objId) {
        ObjectId objectId = new ObjectId(objId);
        Query<User> query = morphiaService.getDatastore().createQuery(User.class).field("_id").equal(objectId);
        morphiaService.getDatastore().delete(query);
        return redirect("/");
    }

    public Result save() {
        DynamicForm dynamicForm = formFactory.form().bindFromRequest();
        String firstname = dynamicForm.get("fname");
        System.out.println(firstname);
        String lastname = dynamicForm.get("lname");
        System.out.println(lastname);
        String strYear = dynamicForm.get("year");
        String strMonth = dynamicForm.get("month");
        String strDate = dynamicForm.get("date");
        Integer year = Integer.valueOf(strYear);
        Integer month = Integer.valueOf(strMonth);
        Integer date = Integer.valueOf(strDate);

//        HomeController homeController = new HomeController(firstname, lastname, year, month, date);
//        homeController.saveEntityExample();
        saveByRequest(firstname, lastname, year, month, date, true);
//        return ok("saved");
        return redirect("/");
    }
}

/**
 private List<User> retrieveEntityExample(){
 //        this.morphiaService = new MorphiaService();
 //        this.userDAO = new UserDAOImpl(User.class, morphiaService.getDatastore());
 try {

 User fetchedUser = userDAO.getByFirstNameLastName("Alex", "Bar");

 System.out.println("firstName " + fetchedUser.getFirstName());
 System.out.println("lastName " + fetchedUser.getLastName());
 System.out.println("birthDate " + fetchedUser.getBirthDate().toGMTString());
 System.out.println("hasPremiumAccess " + fetchedUser.getHasPremiumAccess());

 System.out.println();


 System.out.println("Retrive list of users by firstName ");

 List<User> alexs = userDAO.getByFirstName("Alex");
 System.out.println(alexs);
 for (User user : alexs) {
 System.out.println("firstName " + user.getFirstName());
 System.out.println("lastName " + user.getLastName());
 System.out.println("birthDate " + user.getBirthDate().toGMTString());
 System.out.println("hasPremiumAccess " + user.getHasPremiumAccess());
 System.out.println("-------");
 }
 return alexs;
 }
 catch(Exception e){
 return new ArrayList<>();
 }
 }
 */