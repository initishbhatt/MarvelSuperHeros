package com.initishbhatt.marvelsuperheros.api

import com.initishbhatt.marvelsuperheros.BuildConfig
import okhttp3.Interceptor
import okhttp3.Response

/**
 * @author nitishbhatt
 */
internal class ApiKeyInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val originalRequest = chain.request()
        val originalUrl = originalRequest.url()
        val url = originalUrl.newBuilder()
                .addQueryParameter("apikey", BuildConfig.PUBLIC_KEY)
                .build()

        val requestBuilder = originalRequest.newBuilder().url(url)
        val request = requestBuilder.build()
        return chain.proceed(request)
    }
}