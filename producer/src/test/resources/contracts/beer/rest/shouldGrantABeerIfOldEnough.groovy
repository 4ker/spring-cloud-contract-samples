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
        body (
                age: 22, name: "marcin"
        )
        headers {
            contentType(applicationJsonUtf8())
        }
    }
    response {
        status(200)
        body("""
            { 
                "status" : "OK" 
            }
        """)
        headers {
            contentType(applicationJsonUtf8())
        }
    }
}