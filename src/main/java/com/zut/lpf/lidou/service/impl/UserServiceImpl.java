package com.zut.lpf.lidou.service.impl;

import com.zut.lpf.lidou.service.UserService;
import com.zut.lpf.lidou.util.BaseResponse;
import com.zut.lpf.lidou.util.StatusCode;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {




    @Override
    public BaseResponse add(String msg, int id) {
        return new BaseResponse<String>(StatusCode.Success,id+msg);
    }

    @Override
    public BaseResponse delete(String msg) {
        return new BaseResponse<String>(StatusCode.Success,msg);
    }
}
