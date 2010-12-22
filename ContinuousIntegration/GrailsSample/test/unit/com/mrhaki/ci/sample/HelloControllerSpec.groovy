package com.mrhaki.ci.sample

import grails.plugin.spock.ControllerSpec

class HelloControllerSpec extends ControllerSpec {
    def greetingService

    def setup() {
        greetingService = Mock(GreetingService)
        controller.greetingService = greetingService
    }

    def "hello() must invoke GreetingService with parameters values from request parameters"() {
        when:
            controller.params.name = 'mrhaki'
            controller.hello()
        then:
            1 * greetingService.hello('mrhaki') >> ''
    }

    def "hello() must invoke GreetingService with no argument if no request parameters"() {
        when:
            controller.hello()
        then:
            1 * greetingService.hello() >> ''
    }

    def "hello() must return result from GreetingService in a map with the key 'message'"() {
        given:
            greetingService.hello() >> 'Hello world!'
        expect:
            controller.hello() == [message: 'Hello world!']
    }
}
