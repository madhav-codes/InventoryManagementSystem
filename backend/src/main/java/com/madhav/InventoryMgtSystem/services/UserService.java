package com.madhav.InventoryMgtSystem.services;

import com.madhav.InventoryMgtSystem.dtos.LoginRequest;
import com.madhav.InventoryMgtSystem.dtos.RegisterRequest;
import com.madhav.InventoryMgtSystem.dtos.Response;
import com.madhav.InventoryMgtSystem.dtos.UserDTO;
import com.madhav.InventoryMgtSystem.models.User;

public interface UserService {
    Response registerUser(RegisterRequest registerRequest);

    Response loginUser(LoginRequest loginRequest);

    Response getAllUsers();

    User getCurrentLoggedInUser();

    Response getUserById(Long id);

    Response updateUser(Long id, UserDTO userDTO);

    Response deleteUser(Long id);

    Response getUserTransactions(Long id);
}
