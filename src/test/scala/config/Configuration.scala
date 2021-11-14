package test.scala.config

import com.typesafe.config._


object Configuration{

  val baseUrl: String = "https://api.postcodes.io"
  val users: Int = Integer.getInteger("users", 1).toInt
  val rampup: Int = Integer.getInteger("rampup", 1).toInt

}