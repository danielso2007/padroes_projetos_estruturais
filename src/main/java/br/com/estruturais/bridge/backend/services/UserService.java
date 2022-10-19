package br.com.estruturais.bridge.backend.services;

import br.com.estruturais.bridge.backend.dao.UserDao;
import br.com.estruturais.bridge.backend.model.User;

public abstract class UserService {
    protected UserDao dao;

    protected UserService(UserDao dao) {
        this.dao = dao;
    }

    public abstract void save(User user);
}
