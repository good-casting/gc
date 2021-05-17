package shop.goodcasting.api.user.login.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import shop.goodcasting.api.user.login.domain.UserDTO;
import shop.goodcasting.api.user.login.domain.UserVO;
import shop.goodcasting.api.user.login.service.UserServiceImpl;

@Log
@RestController
@RequestMapping("/user")
@CrossOrigin("*")
@RequiredArgsConstructor
public class UserController {
    private final UserServiceImpl service;
    private final ModelMapper modelMapper;

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody UserDTO userDTO) {

        return ResponseEntity.ok(service.signup(modelMapper.map(userDTO, UserVO.class)));
    }
}
