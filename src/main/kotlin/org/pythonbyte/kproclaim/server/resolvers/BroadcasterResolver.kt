package org.pythonbyte.kproclaim.server.resolvers

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import org.pythonbyte.kproclaim.sermonaudio.service.BroadcasterServiceImpl
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
class BroadcasterResolver: BroadcasterServiceImpl(), GraphQLMutationResolver {
    @Value("\${sermonaudio.apiKey}")
    override val apiKey = ""
}