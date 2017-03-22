package twitter


import com.typesafe.config.ConfigFactory
import twitter4j.conf.ConfigurationBuilder

/**
  * Created by najus on 3/22/17.
  */
object TweetEval {
  val config = ConfigFactory.load()

  def main(args: Array[String]): Unit = {
    val conn = new ConfigurationBuilder
    conn.setDebugEnabled(true).setOAuthConsumerKey(config.getString("consumerKey"))
      .setOAuthConsumerSecret(config.getString("consumerSecret"))
      .setOAuthAccessToken(config.getString("accessToken"))
      .setOAuthAccessTokenSecret(config.getString("accessTokenSecret"))
  }
}
