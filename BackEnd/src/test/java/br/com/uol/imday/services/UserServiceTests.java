package br.com.uol.imday.services;

import br.com.uol.imday.dto.SolversDaysDTO;
import br.com.uol.imday.dto.UserDTO;
import br.com.uol.imday.repositories.UserRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(SpringExtension.class)
public class UserServiceTests {

    @InjectMocks
    private UserService userService;

    @Mock
    private UserRepository repository;

    private List<UserDTO> allUsers;

    @BeforeEach
    public void initUserList() {
        allUsers = new ArrayList<>();
        allUsers.add(new UserDTO(1L, "João"));
        allUsers.add(new UserDTO(2L, "Maria"));
        allUsers.add(new UserDTO(3L, "Zeca"));
        allUsers.add(new UserDTO(4L, "Mario"));
        allUsers.add(new UserDTO(5L, "Gustavo"));
        allUsers.add(new UserDTO(6L, "Camila"));
        allUsers.add(new UserDTO(7L, "Pedro"));
        allUsers.add(new UserDTO(7L, "Juliana"));
        allUsers.add(new UserDTO(7L, "Gisele"));
    }

    @AfterEach
    public void setNullUserList() {
        allUsers = null;
    }

    @Test
    public void solversDaysListShouldReturnElevenResults() {
        List<SolversDaysDTO> solversDayList = userService.solversDayList(allUsers);
        Assertions.assertTrue(solversDayList.size() == 11);
        Assertions.assertFalse(solversDayList.isEmpty());
    }
}
