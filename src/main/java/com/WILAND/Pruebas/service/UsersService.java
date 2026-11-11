package com.WILAND.Pruebas.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.WILAND.Pruebas.dto.HttpGlobalResponseDTO;
import com.WILAND.Pruebas.dto.RequestDTO;
import com.WILAND.Pruebas.dto.UserDTO;
import com.WILAND.Pruebas.entity.Users;
import com.WILAND.Pruebas.repository.UsersRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor 
public class UsersService {    

    private final UsersRepository usersRepository;

    public HttpGlobalResponseDTO<UserDTO> login(RequestDTO request) {
        HttpGlobalResponseDTO<UserDTO> response = new HttpGlobalResponseDTO<>();
        Optional<Users> userFound = usersRepository.findByName(request.getName());

        if (userFound.isEmpty()) {
            response.setMessage("Nombre de usuario incorrecto.");
            return response;
        }  

        UserDTO userDTO = new UserDTO();
        userDTO.setId(userFound.get().getId());
        userDTO.setName(userFound.get().getName());    

        response.setMessage("Inicio de sesión exitoso. Bienvenido, usuario " + userFound.get().getName() + ".");
        response.setData(userDTO);

        return response;
    }
}
