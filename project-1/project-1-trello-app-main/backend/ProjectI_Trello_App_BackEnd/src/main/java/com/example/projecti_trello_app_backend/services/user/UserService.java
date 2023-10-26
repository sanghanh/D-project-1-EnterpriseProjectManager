package com.example.projecti_trello_app_backend.services.user;

import com.example.projecti_trello_app_backend.dto.UserDTO;
import com.example.projecti_trello_app_backend.entities.user.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Optional;

@Service
public interface UserService {

    List<User> findAll();

    Optional<User> findByUserId(int userId);

    Optional<User> findByUserName(String userName);

    Optional<User> findByEmail(String email);

    Optional<User> findByUsernameOrEmail(String userName, String email);

    int existsByUsernameOrEmail(String userName, String email);

    int existedUserNameOrEmail(String userName, String email);

    Optional<?> update(UserDTO userDTO);

    Optional<User> changePassWord(User user);

    Optional<User> resetPassword(UserDTO userDTO,String token);

}
