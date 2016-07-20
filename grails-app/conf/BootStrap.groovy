import com.nbos.capi.api.v0.IdnSDK
import com.nbos.capi.api.v0.InMemoryApiContext
import com.nbos.grails.capi.GrailsApiContext;

class BootStrap {

    def grailsApplication

    def init = { servletContext ->

        try {
            Class.forName("com.nbos.capi.modules.oauth.v0.OAuthIdsRegistry");
        } catch(Exception e) {
            System.out.println("unable to load");
        }

        IdnSDK.init(new GrailsApiContext([name:'app',grailsApplication:grailsApplication]));
        IdnSDK.init(new GrailsApiContext([name:'api',grailsApplication:grailsApplication]));
    }
    def destroy = {
    }
}
