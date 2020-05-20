package demo

import grails.compiler.GrailsCompileStatic
import grails.util.Environment

@GrailsCompileStatic
class BootStrap {

    def init = { servletContext ->

        if ( Environment.current == Environment.DEVELOPMENT ) {
        }
    }

    def destroy = {
    }

}
