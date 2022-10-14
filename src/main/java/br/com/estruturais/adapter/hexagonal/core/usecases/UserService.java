package br.com.estruturais.adapter.hexagonal.core.usecases;

import java.util.List;
import br.com.estruturais.adapter.hexagonal.core.model.User;
import br.com.estruturais.adapter.hexagonal.core.ports.UserRepository;

public class UserService {
    private UserRepository userRepo;

    public UserService(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    public void saveUser(User user) {
        boolean alreadyUsedEmail = userRepo.getAll().stream()
            .anyMatch(userDb -> userDb.getEmail().equalsIgnoreCase(user.getEmail()));
        if (alreadyUsedEmail) {
            throw new RuntimeException("Email address already exists!");
        }
        userRepo.save(user);
    }

    public List<User> getUsers() {
        return userRepo.getAll();
    }

}
