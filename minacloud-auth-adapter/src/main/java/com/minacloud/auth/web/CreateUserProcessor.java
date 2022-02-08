/*
 * Copyright © 2021 Laysan (lslvxy@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.minacloud.auth.web;

import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import com.alibaba.cola.exception.Assert;
import com.minacloud.auth.dto.cmd.UserAddCmd;
import com.minacloud.common.base.BaseProcessor;
import com.minacloud.common.processor.Processor;

import java.util.Date;

@Processor(value = "/user/add")
public class CreateUserProcessor extends BaseProcessor<UserAddCmd, Response> {


    @Override
    public void checkParameter(UserAddCmd userAddCmd) {
        Assert.notNull(userAddCmd.getUserCO());
    }

    @Override
    public Response process(UserAddCmd userAddCmd) {
        System.out.println(userAddCmd.getUserCO());
        return SingleResponse.of(new Date());
    }
}
