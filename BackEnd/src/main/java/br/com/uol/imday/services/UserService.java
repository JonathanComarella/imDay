package br.com.uol.imday.services;

import br.com.uol.imday.dto.UserDTO;
import br.com.uol.imday.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserDTO> findAll() {
        return userRepository.findAll().stream().map(x -> new UserDTO(x)).toList();
    }
}
