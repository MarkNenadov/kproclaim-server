package org.pythonbyte.kproclaim.server.resolvers

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.pythonbyte.krux.json.JsonObject
import khttp.responses.Response
import org.pythonbyte.kproclaim.sermonaudio.domain.Recording
import org.pythonbyte.kproclaim.sermonaudio.domain.Speaker
import org.pythonbyte.kproclaim.sermonaudio.service.NodeServiceImpl
import org.pythonbyte.kproclaim.sermonaudio.service.transport.SermonAudioHttp
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import java.net.URLEncoder

@Component
class NodeResolver : NodeServiceImpl(), GraphQLQueryResolver {
    @Value("\${sermonaudio.apiKey}")
    override val apiKey = ""

    @Value("\${sermonaudio.language}")
    override val language = ""
}