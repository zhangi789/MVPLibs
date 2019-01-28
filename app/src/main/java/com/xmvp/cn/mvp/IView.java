package com.xmvp.cn.mvp;

import com.trello.rxlifecycle2.LifecycleTransformer;

/**
 * @author 张海洋
 * @Date on 2019/01/22.
 * @org 上海..科技有限公司
 * @describe
 */


public interface IView {


    /**
     * 显示信息showLoading 和hideLoading   个人用不到   如果需要自定添加
     * @param mInfo
     */
    void showInfo(String mInfo);
    /**
     * 绑定生命周期
     */
    <T> LifecycleTransformer<T> bindToLife();

}
