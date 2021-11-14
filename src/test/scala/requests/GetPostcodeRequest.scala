package test.scala.requests

import io.gatling.http.request.builder.HttpRequestBuilder
import io.gatling.http.Predef._
import io.gatling.core.Predef._
import test.scala.config.Configuration.baseUrl

object GetPostcodeRequest {

  var get_postcodes: HttpRequestBuilder = http("Get postcodes")
    .post(baseUrl + "/postcodes")
    .body(RawFileBody("./src/test/resources/bodies/GetPostcodes.json")).asJson
    .header("content0type", "application/json")
    .check(status is 200)
}