package br.com.estruturais.bridge.backend.dao;

import br.com.estruturais.bridge.backend.model.User;

public class UserOracleDao implements UserDao {

    @Override
    public void save(User user) {
        System.out.println("Saving the user in the Oracle Database!");
    }
}
