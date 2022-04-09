package br.com.uol.imday.dto;

import br.com.uol.imday.entities.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {

    private Long id;
    private String name;

    public UserDTO() {
    }

    public UserDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public UserDTO(User entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }
}
