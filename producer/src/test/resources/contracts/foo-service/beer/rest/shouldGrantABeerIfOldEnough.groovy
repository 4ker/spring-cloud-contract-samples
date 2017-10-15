org.springframework.cloud.contract.spec.Contract.make {
    description("""
        some interesting description
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
            { "status" : "OK" }
        """)
        headers {
            contentType(applicationJsonUtf8())
        }
    }
}