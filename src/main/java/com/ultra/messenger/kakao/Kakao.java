package com.ultra.messenger.kakao;

import com.ultra.messenger.BaseMessenger;
import com.ultra.base.request.Request;
import com.ultra.base.response.Response;
import org.springframework.stereotype.Component;

/**
 * Created by YG-MAC on 2017. 2. 12..
 */
@Component
public class Kakao extends BaseMessenger<KakaoRequest, KakaoResponse>{
    @Override
    public Request receive(KakaoRequest request) {
        return null;
    }

    @Override
    public KakaoResponse transmit(Response response) {
        return null;
    }
}
