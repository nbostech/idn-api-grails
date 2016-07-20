package com.nbos.capi.modules.oauth.v0;

import com.nbos.capi.api.v0.NetworkApi;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;


public class OAuthApi extends NetworkApi {
    public boolean isValid(String userToken) {
        OAuthRemoteApi oAuthRemoteApi = getRemoteApi();
        String apiToken = apiContext.getClientToken().getAccess_token();
        Call<ResponseBody> call = oAuthRemoteApi.isValid(apiToken,apiToken);
        try{
            Response<ResponseBody> response = call.execute();
            String resp = response.body().string();
            System.out.println(resp);
        }catch(IOException x) {
            System.out.println("Unable to get client token");
            return false;
        }
        return true;
//        Call<TokenApiModel> call = remoteApi.getToken(clientId,secret,"client_credentials");
//        try {
//            Response<TokenApiModel> response = call.execute();
//            TokenApiModel tokenApiModel = response.body();
//            System.out.println ( "token:" + tokenApiModel.getAccess_token());
//            apiContext.setClientToken(tokenApiModel);
//            return tokenApiModel;
//        } catch( IOException x ) {
//            System.out.println("Unable to get client token");
//            return null;
//        }
//        return false;
    }
}
