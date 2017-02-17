package com.ultra.messenger;

import com.ultra.base.request.Request;
import com.ultra.base.response.Response;

/**
 * Created by YG-MAC on 2017. 2. 12..
 */
public interface Messenger<T, K> {
    Request receive(T request);
    K transmit(Response response);
}
