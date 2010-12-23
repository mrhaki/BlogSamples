import groovy.xml.MarkupBuilder

eventTestPhasesStart = {
    println "Starting TEST phase."
    println "Coverage enabled: ${isCoverageEnabled()}"
}

eventStatusFinal = {
    def writer = new FileWriter('../../teamcity-info.xml')
    def info = new MarkupBuilder(writer)
    info.build {
        statisticValue(key: 'CodeCoverageB', value: 100)
        statisticValue(key: 'CodeCoverageL', value: 21)
        statisticValue(key: 'CodeCoverageAbsLCovered', value: 5)
        statisticValue(key: 'CodeCoverageAbsLTotal', value: 5)
    }
}

boolean isCoverageEnabled() {
    if (argsMap.containsKey('nocoverage')) {
        return false
    } else if (argsMap.containsKey('coverage')) {
        return true
    } else {
        return buildConfig.coverage.enabledByDefault
    }
}