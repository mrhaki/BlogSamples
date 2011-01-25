package com.mrhaki.app.services

import spock.lang.Specification

class UserServiceImplSpec extends Specification {
    
    UserServiceImpl userService = new UserServiceImpl();
    
    def "Search for existing name must return correct username"() {
        expect:
            userService.findUsername("Hubert A. Klein Ikkink") == 'mrhaki'
    }
    
    def "Search for non-existing name must return an empty String"() {
        expect:
            userService.findUsername('non-existing name') == ''
    }
    
    def "Search with null value for name must return an empty String"() {
        expect:
            userService.findUsername(null) == ''
    }
    
}