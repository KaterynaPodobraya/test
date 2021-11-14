import io.gatling.core.Predef._
import test.scala.config.Configuration._
import scala.concurrent.duration._

class GetPostcodesSimulation extends Simulation{

  private val getPostCodesRampExec = GetPostcodeScenario.getPostcodeScenario
                                                        .inject(rampUsers(users) during(rampup seconds))


  setUp(getPostCodesRampExec)
    .assertions(global.responseTime.max.lt(10000))
}