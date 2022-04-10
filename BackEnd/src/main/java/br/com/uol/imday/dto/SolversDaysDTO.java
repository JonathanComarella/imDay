package br.com.uol.imday.dto;

import br.com.uol.imday.entities.User;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class SolversDaysDTO {

    private String date;
    private String nameUser;

    public SolversDaysDTO() {
    }

    public SolversDaysDTO(String date, String nameUser) {
        this.date = date;
        this.nameUser = nameUser;
    }

    public SolversDaysDTO(User entity) {
        this.nameUser = entity.getName();
    }
}
