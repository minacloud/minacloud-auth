package com.minacloud.auth.dto.cmd;

import com.alibaba.cola.dto.Command;
import com.minacloud.auth.dto.clientobject.UserCO;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class UserUpdateCmd extends Command {
    private UserCO userCO;
}
