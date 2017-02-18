package com.ultra.messenger.kakao;

import com.ultra.base.enums.API;
import com.ultra.messenger.BaseMessenger;
import com.ultra.base.request.Request;
import com.ultra.base.response.Response;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by YG-MAC on 2017. 2. 12..
 */
@Component
public class Kakao extends BaseMessenger<KakaoRequest, KakaoResponse>{
    public Kakao() {
        super(API.KAKAO);
    }

    @Override
    public Request receive(KakaoRequest request) {
        return null;
    }

    @Override
    public KakaoResponse transmit(Response response) {
        return null;
    }
}
