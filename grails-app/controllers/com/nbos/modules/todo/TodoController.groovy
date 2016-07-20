package com.nbos.modules.todo

import com.nbos.capi.modules.ids.v0.IDS

class TodoController {
    def beforeInterceptor = {
        IDS.getModuleApi("oauth")
    }

    def index() {

    }
}
