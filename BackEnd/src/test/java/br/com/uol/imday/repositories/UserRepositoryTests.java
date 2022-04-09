package br.com.uol.imday.repositories;

import br.com.uol.imday.dto.UserDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@DataJpaTest
public class UserRepositoryTests {

    @Autowired
    private UserRepository userRepository;

    private final static int totalUsers = 9;

    @Test
    public void findAllShouldReturnListOfUsers(){
        List<UserDTO> usersList = userRepository.findAll().stream().map(x -> new UserDTO(x)).toList();
        Assertions.assertFalse(usersList.isEmpty());
        Assertions.assertEquals(usersList.size(), totalUsers);
    }
}
