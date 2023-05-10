# kproclaim-server
A Kotlin/Spring Boot server wrapping SermonAudio's API v2 endpoints (https://api.sermonaudio.com/) into a simple, clean, consistent GraphQL API. Uses [kproclaim](https://github.com/MarkNenadov/kproclaim).

### Introduction ###

The server is accessible at: http://localhost:8080/graphql/

To experiment with the API, [GraphQL Playground](https://github.com/prisma/graphql-playground/releases) is recommended.

### GraphQL Queries ###

    recording(sermonId: String!): Recording

    recordingsBySpeaker(speakerName: String!): [Recording]

    allRecordings: [Recording]

    speakers(sourceId: String!): [Speaker]


### GraphQL Mutations ###
    
    createRecording( recording: RecordingInput! ): Boolean
    
### TODO ###
* Update graphql dependencies (they are very ancient and inconsistently sprawled across kickstart and non kickstart deps). This will require some major reworking of graphql code.
* Now that kproclaim 1.1 gives a more descriptive exception on bad api key, make graphql error response make sense (right now its just Internal server error)
* Finish implementation of mutation for create_sermon endpoint
* Implement mutation for upload_audio
