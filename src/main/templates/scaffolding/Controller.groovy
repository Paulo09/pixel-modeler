<%=packageName ? "package ${packageName}" : ''%>

import com.wordnik.swagger.annotations.Api
import grails.rest.RestfulController

@Api(value = '${propertyName}', description = '${className} Pixell  API')
class ${className}Controller extends RestfulController {
    static responseFormats = ['json', 'xml']
    ${className}Controller() {
        super(${className})
    }
}