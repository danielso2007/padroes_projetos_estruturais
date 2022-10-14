package br.com.estruturais.bridge.backend.services;

import br.com.estruturais.bridge.backend.dao.UserDao;
import br.com.estruturais.bridge.backend.model.User;

public class UserRest extends UserService {

    public UserRest(UserDao dao) {
        super(dao);
    }

    @Override
    public void save(User user) {
        System.out.println("Starting a save operation through Rest Protocol!");
        dao.save(user);
    }
}
