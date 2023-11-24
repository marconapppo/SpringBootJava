package Controllers;

import Entities.User;
import Infra.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController
{
    @Autowired
    private IUserRepository repository;

    @GetMapping
    public List<User> FindAll()
    {
        return repository.findAll();
    }
}
