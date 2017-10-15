package contracts.beer.rest

org.springframework.cloud.contract.spec.Contract.make {
    description("""
Represents a successful scenario of getting a beer

```
given:
\tclient is old enough
when:
\the applies for a beer
then:
\twe'll grant him the beer
```

    """)
    request {
        method POST()
        url "/check"
        body(
                age: 15, name: "dolly"
        )
        headers {
            contentType(applicationJsonUtf8())
        }
    }
    response {
        status(200)
        body("""
            { "status" : "NOT_OK" }
        """)
        headers {
            contentType(applicationJsonUtf8())
        }
    }
}
