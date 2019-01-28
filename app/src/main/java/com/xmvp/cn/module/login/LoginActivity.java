package com.xmvp.cn.module.login;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import com.xmvp.cn.R;
import com.xmvp.cn.base.BaseMvpActivity;
import com.xmvp.cn.bean.LoginBean;

import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author 张海洋
 * @Date on 2019/01/22.
 * @org 上海..科技有限公司
 * @describe
 */


public class LoginActivity extends BaseMvpActivity<loginPresenter> implements LoginContract.View {
    @BindView(R.id.btn)
    Button btn;

    @Override
    public void showInfo(String mInfo) {

    }
    @Override
    protected loginPresenter createPresenter() {
        return new loginPresenter();
    }

    @Override
    protected void initMvpView() {
        Map<String, Object> mapsLogin = new HashMap<>();
        mapsLogin.put("account", "13681929794");
        mapsLogin.put("password", "123456");
        mPresenter.getLogin(mapsLogin);
    }


    @Override
    public void showData(LoginBean result) {
        Log.i("GGG", result.getMsg() + " " + result.getCode());
    }

    @Override
    protected void getIntent(Intent intent) {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    protected void initData() {


    }

    @Override
    protected void initListener() {

    }

    @OnClick(R.id.btn)
    public void onViewClicked() {
    }
}
