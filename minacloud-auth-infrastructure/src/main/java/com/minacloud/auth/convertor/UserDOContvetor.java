package com.minacloud.auth.convertor;

import com.minacloud.auth.domain.user.User;
import com.minacloud.auth.gateway.dataobject.UserDO;
import com.minacloud.common.base.BaseConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserDOContvetor extends BaseConvertor<UserDO, User> {

}
