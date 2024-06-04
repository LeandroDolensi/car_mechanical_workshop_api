package com.mechanical.carWorkshop.controller;

import com.mechanical.carWorkshop.dto.AuthDto;
import com.mechanical.carWorkshop.dto.TokenJWTDto;
import com.mechanical.carWorkshop.model.UsuarioModel;
import com.mechanical.carWorkshop.service.TokenService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AuthController {

    @Autowired
    private AuthenticationManager manager;

    @Autowired
    private TokenService tokenService;

    @PostMapping
    public ResponseEntity logIn(@RequestBody @Valid AuthDto authDataDto) {

        var token = new UsernamePasswordAuthenticationToken(authDataDto.login(), authDataDto.senha());

        var authentication = manager.authenticate(token);

        var tokenJWT = tokenService.gerarToken((UsuarioModel) authentication.getPrincipal());

        return ResponseEntity.ok(new TokenJWTDto(tokenJWT));
    }

}
