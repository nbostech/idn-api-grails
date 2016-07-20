package com.nbos.grails.capi

import com.nbos.capi.api.v0.InMemoryApiContext

class GrailsApiContext extends InMemoryApiContext {

    def grailsApplication

    public GrailsApiContext(Map map) {
        super(map.name)
        this.grailsApplication=map.grailsApplication
    }
    public GrailsApiContext(String name) {
        super(name)
    }

    @Override
    public void init() {
        setClientCredentials([client_id:idnConfig."${name}".clientId, client_secret:idnConfig."${name}".clientSecret]);
    }

    @Override
    public String getHost(String moduleName) {
        idnConfig."module.${moduleName}.host" ?: "http://api.qa1.nbos.in/";
    }

    def Map getIdnConfig() {
        grailsApplication.config.idn
    }

}
