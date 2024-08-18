package com.tantt.chatmall.common.websocket.domain.vo.res;

/**
 * @Author: tantingjia
 * @Date: 2024/8/18 11:11
 **/
public class WSBaseRes<T> {
    /**
     * @see com.tantt.chatmall.common.websocket.domain.enums.WSResTypeEnum
     */
    private Integer type;
    private T data;
}
