package com.xmvp.cn.api;


import com.xmvp.cn.bean.LoginBean;

import java.util.Map;

import io.reactivex.Observable;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * @author 张海洋
 * @Date on 2018/11/19.
 * @org 上海相舆科技有限公司
 * @describe
 */
public interface ApiService {
    /**
     * 登陆   表单请求
     */
    @FormUrlEncoded
    @POST("user/login")
    Observable<LoginBean> getLogin(@FieldMap Map<String, Object> mapsLogin);




}
