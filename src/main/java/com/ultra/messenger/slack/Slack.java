package com.ultra.messenger.slack;

import com.ultra.messenger.BaseMessenger;
import com.ultra.base.request.Request;
import com.ultra.base.response.Response;
import org.springframework.stereotype.Component;

/**
 * Created by YG-MAC on 2017. 2. 12..
 */
@Component
public class Slack extends BaseMessenger<SlackRequest, SlackResponse>{
    @Override
    public Request receive(SlackRequest request) {
        return null;
    }

    @Override
    public SlackResponse transmit(Response response) {
        return null;
    }
}
