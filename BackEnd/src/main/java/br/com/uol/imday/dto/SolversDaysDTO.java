package br.com.uol.imday.dto;

import br.com.uol.imday.entities.User;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class SolversDaysDTO {

    private String nameUser;
    private LocalDate date;

    public SolversDaysDTO() {
    }

    public SolversDaysDTO(String nameUser, LocalDate date) {
        this.nameUser = nameUser;
        this.date = date;
    }

    public SolversDaysDTO(User entity) {
        this.nameUser = entity.getName();
    }
}
