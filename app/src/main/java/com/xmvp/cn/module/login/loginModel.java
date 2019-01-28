package com.xmvp.cn.module.login;

import com.xmvp.cn.bean.LoginBean;
import com.xmvp.cn.http.RxHelper;
import com.xmvp.cn.mvp.BaseModel;

import java.util.Map;

import io.reactivex.Observable;

/**
 * @author 张海洋
 * @Date on 2019/01/22.
 * @org 上海..科技有限公司
 * @describe
 */


public class loginModel extends BaseModel implements LoginContract.Model {
    @Override
    public Observable<LoginBean> getLogin(Map<String, Object> mapsLogin) {
        return RxHelper.init().getLogin(mapsLogin);
    }
}
