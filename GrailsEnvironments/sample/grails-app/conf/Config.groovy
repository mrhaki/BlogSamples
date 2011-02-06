def CONFIG_LOCATION_SYS_PROPERTY = 'sample.app.config.file'
if (System.properties[CONFIG_LOCATION_SYS_PROPERTY]) {
    grails.config.locations = ["file:" + System.properties[CONFIG_LOCATION_SYS_PROPERTY]]
}

grails.project.groupId = sample // change this to alter the default package name and Maven publishing destination
grails.mime.file.extensions = true // enables the parsing of file extensions from URLs into the request format
grails.mime.use.accept.header = false
grails.mime.types = [ html: ['text/html','application/xhtml+xml'],
                      xml: ['text/xml', 'application/xml'],
                      text: 'text/plain',
                      js: 'text/javascript',
                      rss: 'application/rss+xml',
                      atom: 'application/atom+xml',
                      css: 'text/css',
                      csv: 'text/csv',
                      all: '*/*',
                      json: ['application/json','text/json'],
                      form: 'application/x-www-form-urlencoded',
                      multipartForm: 'multipart/form-data'
                    ]

grails.views.default.codec = "none" // none, html, base64
grails.views.gsp.encoding = "UTF-8"
grails.converters.encoding = "UTF-8"
grails.views.gsp.sitemesh.preprocess = true
grails.scaffolding.templates.domainSuffix = 'Instance'

grails.json.legacy.builder = false
grails.enable.native2ascii = true
grails.logging.jul.usebridge = true
grails.spring.bean.packages = []

environments {
    production {
        runningMode = 'LIVE'
    }
    development {
        runningMode = 'DEV'
    }
    test {
        runningMode = 'INTEGRATION TEST'
    }
    systemTest {
        runningMode = 'SYSTEM TEST'
    }
    userAcceptanceTest {
        runningMode = 'USER ACCEPTANCE TEST'
    }
}
