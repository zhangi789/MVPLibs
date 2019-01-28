package com.xmvp.cn.mvp;

/**
 * @author 张海洋
 * @Date on 2019/01/22.
 * @org 上海..科技有限公司
 * @describe
 */

public interface IPresenter<V extends IView> {
    /**
     * 绑定 View
     *
     * @param mView
     */
    void attachView(V mView);

    /**
     * 解绑 View
     */
    void detachView();

}
