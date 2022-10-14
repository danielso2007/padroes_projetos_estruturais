package br.com.estruturais.bridge.backend;

import br.com.estruturais.bridge.backend.dao.UserMongoDao;
import br.com.estruturais.bridge.backend.dao.UserMysqlDao;
import br.com.estruturais.bridge.backend.dao.UserOracleDao;
import br.com.estruturais.bridge.backend.dao.UserPostgresDao;
import br.com.estruturais.bridge.backend.model.User;
import br.com.estruturais.bridge.backend.services.UserEJB;
import br.com.estruturais.bridge.backend.services.UserRest;
import br.com.estruturais.bridge.backend.services.UserService;
import br.com.estruturais.bridge.backend.services.UserSoap;

public class Client {

    public static void main(String[] args) {
        User user = new User("user", "user@email.com", "passwd");

        UserService userRestOracleService = new UserRest(new UserOracleDao());
        userRestOracleService.save(user);

        UserService userEJBMongoService = new UserEJB(new UserMongoDao());
        userEJBMongoService.save(user);

        UserService userSoapPostgresService = new UserSoap(new UserPostgresDao());
        userSoapPostgresService.save(user);

        // .......

        UserService userRestMysqlService = new UserRest(new UserMysqlDao());
        userRestMysqlService.save(user);

    }
}
