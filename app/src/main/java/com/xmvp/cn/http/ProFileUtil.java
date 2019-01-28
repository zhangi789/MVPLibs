package com.xmvp.cn.http;

import android.util.Log;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;


/**
 * @author 张海洋
 * @Date on 2018/11/19.
 * @org 上海相舆科技有限公司
 * @describe 日志拦截器
 */

public class ProFileUtil {
    public static String TAG = "----";
    //日志拦截器
    public static HttpLoggingInterceptor setLog() {
        return new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(String message) {
                Log.w(TAG, "log: 日志拦截器 " + message);
            }
        }).setLevel(HttpLoggingInterceptor.Level.BODY);//设置打印数据的级别
    }

    //设置头部拦截
    public static Interceptor setHead() {
        return new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request mRequest = chain.request();
                //在这里你可以做一些想做的事,比如token失效时,重新获取token
                //或者添加header等等,PS我会在下一篇文章总写拦截token方法
                //添加下载进度条操作
                return chain.proceed(mRequest);
            }
        };

    }
    /**
     * OkHttpClient 创建
     */
    public static OkHttpClient initClient() {
        return new OkHttpClient.Builder()
                //日志拦截器
                .addInterceptor(setLog())
                //处理头部拦截器
                .addInterceptor(setHead())
                //连接时间 10秒
                .connectTimeout(20, TimeUnit.SECONDS)
                //超时时间 10秒
                .readTimeout(20, TimeUnit.SECONDS)
                .build();
    }


}
