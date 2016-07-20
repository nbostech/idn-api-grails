package com.nbos.capi.modules.oauth.v0;


import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PATCH;
import retrofit2.http.Path;

public interface OAuthRemoteApi {
    @GET("/api/oauth/v0/tokens/{tokenId}")
    Call<ResponseBody> isValid(@Header("Authorization") String apiToken, @Path("tokenId") String userToken);

}
