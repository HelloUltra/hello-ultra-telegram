package com.ultra.messenger.line;

import com.ultra.base.request.Request;
import com.ultra.base.response.Response;
import com.ultra.messenger.BaseMessenger;
import org.springframework.stereotype.Component;

/**
 * Created by YG-MAC on 2017. 2. 12..
 */
@Component
public class Line extends BaseMessenger<LineRequest, LineResponse>{
    @Override
    public Request receive(LineRequest request) {
        return null;
    }

    @Override
    public LineResponse transmit(Response response) {
        return null;
    }
}
