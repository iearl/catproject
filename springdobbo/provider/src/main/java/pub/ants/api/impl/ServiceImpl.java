package pub.ants.api.impl;

import pub.ants.api.Service;


/**
 * @author magw
 * @version 1.0
 * @date 2020/3/7 下午11:14
 * @description: No Description
 */
public class ServiceImpl implements Service {
    @Override
    public String sendMessage(String message) {
        return "provider-message=" + message;
    }
}
