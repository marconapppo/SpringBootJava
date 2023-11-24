package Controllers;

import Entities.User;
import Infra.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(value = "/{id}")
    public User FindById(@PathVariable Long id)
    {
        return repository.findById(id).get();
    }

    @PostMapping
    public User Insert(@RequestBody User user)
    {
        return repository.save(user);
    }
}
