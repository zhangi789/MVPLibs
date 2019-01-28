package com.xmvp.cn.module.login;

import com.trello.rxlifecycle2.LifecycleProvider;
import com.trello.rxlifecycle2.android.ActivityEvent;
import com.xmvp.cn.bean.LoginBean;
import com.xmvp.cn.mvp.IModel;
import com.xmvp.cn.mvp.IPresenter;
import com.xmvp.cn.mvp.IView;

import java.util.Map;

import io.reactivex.Observable;

/**
 * @author 张海洋
 * @Date on 2019/01/22.
 * @org 上海..科技有限公司
 * @describe
 */


public interface LoginContract {

    interface View extends IView {
        void showData(LoginBean result);
    }


    interface Presenter extends IPresenter<View> {
        void getLogin(Map<String, Object> mapsLogin);
    }

    interface Model extends IModel {
        //   登陆
        Observable<LoginBean> getLogin(Map<String, Object> mapsLogin);
    }






}
