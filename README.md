# kproclaim-server
A Kotlin/Spring Boot server wrapping SermonAudio's API endpoints (https://api.sermonaudio.com/) into a simple, clean, consistent GraphQL API. Uses [kproclaim](https://github.com/MarkNenadov/kproclaim).

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

* Figure out why supposedly optional request parameter "sourceID" on speakers_for_source endpoint doesn't behave as the documentation at https://api.sermonaudio.com/ indicates. 
* Finish implementation of mutation for create_sermon endpoint
* Implement mutation for upload_audio
