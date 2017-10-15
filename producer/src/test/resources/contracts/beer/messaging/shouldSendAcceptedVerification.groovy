package contracts.beer.messaging

org.springframework.cloud.contract.spec.Contract.make {
    description("""
Sends a positive verification message when person is eligible to get the beer

```
given:
\tclient is old enough
when:
\the applies for a beer
then:
\twe'll send a message with a positive verification
```

""")
    // HTTP communication is synchronous - you send a request and you get a
    // response. With messaging the situation is different - a consumer
    // suddenly might get a message. In the consumer tests the consumer needs a
    // mean to trigger that message. That hook is called a label in Spring
    // Cloud Contract. Let’s call our label accepted_verification. To define it
    // in the contract just call the label method like this label
    // 'accepted_verification'
    label "accepted_verification"
    outputMessage {
        // send to verifications channel
        sendTo "verifications"
        // send a json file
        body(eligible: true)
        headers {
            // header("contentType", applicationJsonUtf8())
            contentType(applicationJsonUtf8())
        }
    }
    request {
        method()
        url()
        body()
        headers {

        }
    }
    response {
        method()
        url()
        body()
        headers {

        }
    }
}
