import ru.sapteh.dao.Dao;
import ru.sapteh.dao.auto.dao.UserDaoIml;
import ru.sapteh.model.User;
import ru.sapteh.utils.Connector;

import java.sql.Connection;

public class Test {
    public static void main(String[] args) {
        Connection connection = Connector.getInstance();
        Dao<User, Integer> userDao = new UserDaoIml(connection);

        //findById
        System.out.println(userDao.findById(1));

        //findAll
        userDao.findAll().forEach(System.out::println);

        //save
//        userDao.save(new User("Vladimir", "Putin"));

        //update
//        User userUpdater = userDao.findById(1);
//        userUpdater.setFirstName("Arnold");
//        userUpdater.setLastName("Schwarzenegger");
//        userDao.update(userUpdater);

        //delete
//        userDao.deleteById(2);

        Connector.close(connection);
    }
}
