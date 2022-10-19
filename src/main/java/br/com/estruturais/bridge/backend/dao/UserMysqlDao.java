package br.com.estruturais.bridge.backend.dao;

import static java.lang.System.*;
import br.com.estruturais.bridge.backend.model.User;

public class UserMysqlDao implements UserDao {

    @Override
    public void save(User user) {
        out.println("Saving the user in the Mysql Database!");
    }
}
