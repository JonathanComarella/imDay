package br.com.uol.imday.services;

import br.com.uol.imday.dto.SolversDaysDTO;
import br.com.uol.imday.dto.UserDTO;
import br.com.uol.imday.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserDTO> findAll() {
        return userRepository.findAll().stream().map(x -> new UserDTO(x)).toList();
    }

    public List<SolversDaysDTO> solversDayList(List<UserDTO> usersList) {
        List<SolversDaysDTO> userDaysList = new ArrayList<>();
        LocalDate date = LocalDate.now().minusDays(1);


        int userCounter = 0;
        for (int i = 1; i <= 11; i++) {
            SolversDaysDTO userDay = new SolversDaysDTO();
            if (!isWeekend(date)) {
                UserDTO user = usersList.get(userCounter);
                userDay.setNameUser(user.getName());
                userCounter = userCounter + 1;
            } else {
                userDay.setNameUser("Sem Resolvedor");
            }

            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            userDay.setDate(date.format(dateFormatter));
            userDaysList.add(userDay);
            date = date.plusDays(1);
            if (userCounter >= usersList.size()) {
                userCounter = 0;
            }
        }
        return userDaysList;
    }

    private boolean isWeekend(LocalDate date) {
        DayOfWeek day = date.getDayOfWeek();
        return day.equals(DayOfWeek.SATURDAY) || day.equals(DayOfWeek.SUNDAY);
    }
}
