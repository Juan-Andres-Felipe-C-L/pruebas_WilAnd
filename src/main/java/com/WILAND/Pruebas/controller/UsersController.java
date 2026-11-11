package com.WILAND.Pruebas.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.WILAND.Pruebas.dto.HttpGlobalResponseDTO;
import com.WILAND.Pruebas.dto.RequestDTO;
import com.WILAND.Pruebas.dto.UserDTO;
import com.WILAND.Pruebas.repository.UsersRepository;
import com.WILAND.Pruebas.service.UsersService;

import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequiredArgsConstructor
@RequestMapping("/users/")
public class UsersController {
    
    private final UsersService usersService;

    @PostMapping("login")
    public ResponseEntity<HttpGlobalResponseDTO<UserDTO>> login(@RequestBody RequestDTO request) {
        try {
            HttpGlobalResponseDTO<UserDTO> response = usersService.login(request);

            if (response.getData() == null) {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(response);
            } else {
                return ResponseEntity.status(HttpStatus.OK).body(response);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }

    
}
