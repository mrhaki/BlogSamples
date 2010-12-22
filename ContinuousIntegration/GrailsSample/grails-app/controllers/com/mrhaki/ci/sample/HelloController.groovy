package com.mrhaki.ci.sample

class HelloController {

    static defaultAction = 'hello'

    def greetingService

    def hello = {
        def name = params.name
        [message: name ? greetingService.hello(name) : greetingService.hello()]
    }
}
