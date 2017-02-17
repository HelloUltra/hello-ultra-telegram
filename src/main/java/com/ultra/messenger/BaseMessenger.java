package com.ultra.messenger;

import com.ultra.base.ServiceConnector;

/**
 * Created by YG-MAC on 2017. 2. 12..
 */
public abstract class BaseMessenger<T, K> implements Messenger<T, K>{

    private static ServiceConnector serviceConnector = new ServiceConnector();

    public K proceed(Object request){
        return transmit(
                serviceConnector.start(
                        receive((T) request)
                )
        );
    }
}
