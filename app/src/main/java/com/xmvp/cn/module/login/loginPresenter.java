package com.xmvp.cn.module.login;

import com.xmvp.cn.bean.LoginBean;
import com.xmvp.cn.mvp.BasePresenter;

import java.util.Map;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * @author 张海洋
 * @Date on 2019/01/22.
 * @org 上海..科技有限公司
 * @describe
 */


public class loginPresenter extends BasePresenter<LoginContract.Model, LoginContract.View> implements LoginContract.Presenter {
    @Override
    public void getLogin(Map<String, Object> mapsLogin) {

        getModel().getLogin(mapsLogin).subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .compose(getView().<LoginBean>bindToLife())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<LoginBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(LoginBean s) {
                        getView().showData(s);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    @Override
    protected LoginContract.Model createModel() {
        return new loginModel();
    }
}
