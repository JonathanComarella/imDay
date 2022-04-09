package br.com.uol.imday.controller;

import br.com.uol.imday.dto.SolversDaysDTO;
import br.com.uol.imday.dto.UserDTO;
import br.com.uol.imday.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ImDayController {
    @Autowired
    private UserService userService;

    @GetMapping("/im-day")
    private ResponseEntity<List<SolversDaysDTO>> listSolversDays() {
        List<UserDTO> usersList = userService.findAll();
        return ResponseEntity.ok().body(userService.solversDayList(usersList));
    }
}