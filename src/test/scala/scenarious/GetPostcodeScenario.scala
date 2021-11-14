import io.gatling.core.structure.ScenarioBuilder
import io.gatling.core.Predef.scenario
import test.scala.requests.GetPostcodeRequest


object GetPostcodeScenario {
  val getPostcodeScenario: ScenarioBuilder =
                                            scenario("Get postcodes scenario")
                                            .exec(GetPostcodeRequest.get_postcodes)
}