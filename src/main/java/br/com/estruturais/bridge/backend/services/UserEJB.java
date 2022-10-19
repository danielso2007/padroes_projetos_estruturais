package br.com.estruturais.bridge.backend.services;

import static java.lang.System.*;

import br.com.estruturais.bridge.backend.dao.UserDao;
import br.com.estruturais.bridge.backend.model.User;
public class UserEJB extends UserService {

    public UserEJB(UserDao dao) {
        super(dao);
    }

    @Override
    public void save(User user) {
        out.println("Starting a save operation through EJB Protocol!");
        dao.save(user);
    }
}
