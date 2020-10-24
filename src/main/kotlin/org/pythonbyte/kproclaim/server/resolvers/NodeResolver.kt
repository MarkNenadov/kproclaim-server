package org.pythonbyte.kproclaim.server.resolvers

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.pythonbyte.kproclaim.sermonaudio.service.NodeServiceImpl
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
class NodeResolver : NodeServiceImpl(), GraphQLQueryResolver {
    @Value("\${sermonaudio.apiKey}")
    override val apiKey = ""

    @Value("\${sermonaudio.language}")
    override val language = ""
}
