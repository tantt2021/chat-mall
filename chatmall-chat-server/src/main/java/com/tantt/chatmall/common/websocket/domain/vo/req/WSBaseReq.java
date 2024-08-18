package com.tantt.chatmall.common.websocket.domain.vo.req;

import lombok.Data;

/**
 * @Author: tantingjia
 * @Date: 2024/8/18 11:03
 **/
@Data
public class WSBaseReq {
    /**
     * @see com.tantt.chatmall.common.websocket.domain.enums.WSReqTypeEnum
     */
    private Integer type;
    private String data;
}
