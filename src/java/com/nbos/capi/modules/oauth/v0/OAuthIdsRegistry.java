package com.nbos.capi.modules.oauth.v0;

import com.nbos.capi.modules.ids.v0.IDS;

public class OAuthIdsRegistry {
    static {
        IDS.register("oauth", OAuthApi.class);
    }
}
