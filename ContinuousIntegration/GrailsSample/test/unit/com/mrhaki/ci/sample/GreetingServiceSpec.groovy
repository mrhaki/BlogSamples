package com.mrhaki.ci.sample

import grails.plugin.spock.UnitSpec
import spock.lang.Shared

class GreetingServiceSpec extends UnitSpec {
    @Shared
    def greetingService = new GreetingService()

    def "hello() must return 'Hello mrhaki!' if parameter value is 'mrhaki'"() {
        expect:
            greetingService.hello('mrhaki') == 'Hello mrhaki!'
    }

    def "hello() must return 'Hello world!' if parameter is empty"() {
        expect:
            greetingService.hello() == 'Hello world!'
    }
}
