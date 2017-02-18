package com.ultra.messenger;

import com.ultra.base.ServiceConnector;
import com.ultra.base.enums.API;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by YG-MAC on 2017. 2. 12..
 */
public abstract class BaseMessenger<T, K> implements Messenger<T, K>{

    public BaseMessenger(API api) {
        this.api = api;
    }

    private API api;

    public API getApi() {
        return api;
    }

    @Autowired
    private ServiceConnector serviceConnector;

    public K proceed(Object request){
        return transmit(
                serviceConnector.start(
                        receive((T) request)
                )
        );
    }
}
