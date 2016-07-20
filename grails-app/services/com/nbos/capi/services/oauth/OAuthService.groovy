package com.nbos.capi.services.oauth

import com.nbos.capi.modules.ids.v0.IDS
import com.nbos.capi.modules.oauth.v0.OAuthApi
import grails.transaction.Transactional

@Transactional
class OAuthService {

    def verifyToken(String token) {
        OAuthApi oAuthApi = IDS.getModuleApi("oauth","api")

    }
}
