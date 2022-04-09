package br.com.uol.imday.dto;

import br.com.uol.imday.entities.User;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class UserDTO {

    private String name;
    private LocalDate date;

    public UserDTO() {
    }

    public UserDTO(String name, LocalDate date) {
        this.name = name;
        this.date = date;
    }

    public UserDTO(User entity) {
        this.name = entity.getName();
    }
}
