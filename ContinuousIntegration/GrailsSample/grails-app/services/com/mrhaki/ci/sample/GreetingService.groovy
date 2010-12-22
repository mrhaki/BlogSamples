package com.mrhaki.ci.sample

class GreetingService {

    static transactional = true

    def hello(name = 'world') {
        "Hello $name!"
    }
}
