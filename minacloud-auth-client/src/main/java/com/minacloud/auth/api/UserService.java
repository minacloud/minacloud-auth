package com.minacloud.auth.api;

import com.alibaba.cola.dto.Response;
import com.minacloud.auth.dto.cmd.UserAddCmd;
import com.minacloud.auth.dto.cmd.UserUpdateCmd;
import com.minacloud.auth.dto.cmd.UserDeleteCmd;

public interface UserService {
    Response addUser(UserAddCmd cmd);

    Response updateUser(UserUpdateCmd cmd);

    Response deleteUser(UserDeleteCmd cmd);

}
