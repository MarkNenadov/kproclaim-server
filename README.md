# kproclaim-server
A Kotlin/Spring Boot server wrapping SermonAudio's API endpoints (https://api.sermonaudio.com/) into a simple, clean, consistent GraphQL API.

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
