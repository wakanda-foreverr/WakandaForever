package com.wakandaforever.wakandaforever.services.users;

import com.wakandaforever.wakandaforever.dtos.UserDto;
import com.wakandaforever.wakandaforever.models.User;

import java.util.List;

public interface UserService {

    User save(UserDto user);
    List<User> findAll();
    void delete(long id);
    User findOne(String username);

    User findById(Long id);
}
