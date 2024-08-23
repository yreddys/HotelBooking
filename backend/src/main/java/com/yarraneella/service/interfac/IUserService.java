package com.yarraneella.service.interfac;

import com.yarraneella.dto.LoginRequest;
import com.yarraneella.dto.Response;
import com.yarraneella.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}
