package com.minacloud.auth.domain.gateway;

import com.minacloud.auth.domain.user.User;

public interface UserGateway {
    void create(User user);

    void update(User user);

    User getByUserId(String userId);
}
