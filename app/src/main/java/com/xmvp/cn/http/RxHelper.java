package com.xmvp.cn.http;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.xmvp.cn.api.ApiService;
import com.xmvp.cn.util.BaseConstant;


import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;
/**
 * @author 张海洋
 * @Date on 2018/11/19.
 * @org 上海相舆科技有限公司
 * @describe
 */
public class RxHelper {
    private static ApiService mApiService = null;
    /**
     * 单例模式
     *
     * @return
     */
    public static ApiService init() {
        if (mApiService == null) {
            synchronized (RxHelper.class) {
                Gson gson = new GsonBuilder().setLenient().create();/////这
                mApiService = new Retrofit.Builder()
                        .baseUrl(BaseConstant.BASE_API)
                        //与Gson结合

                        .addConverterFactory(ScalarsConverterFactory.create())

                        .addConverterFactory(GsonConverterFactory.create(gson))
                        //添加rxjava转换器
                        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                        // OKhttp3的配置
                        .client(ProFileUtil.initClient())
                        .build()
                        .create(ApiService.class);
            }
        }
        return mApiService;
    }


}
