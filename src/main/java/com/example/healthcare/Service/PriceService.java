package com.example.healthcare.Service;

import com.example.healthcare.bean.Price;

public interface PriceService {
    /**
     * 进入不同的功能从而进行选择价格
     * 拿到医生的职称id得到挂号的价格
     * @param DTid
     * @return
     */
    Price getPriceByGuhao(Integer DTid);

    /**
     *得到图文问诊的价格
     * @param DTid
     * @return
     */
    Price getPriceByTuwen(Integer DTid);

    /**
     * 得到聊天的价格
     * @param DTid
     * @return
     */
    Price getPriceByChat(Integer DTid);

    /**
     * 得到快速问诊的价格
     */
    Price getPriceByFast(Integer DTid);
}
