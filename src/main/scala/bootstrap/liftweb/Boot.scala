package bootstrap.liftweb

import net.liftweb._
import util._
import Helpers._

import common._
import http._
import sitemap._
import Loc._
import com.lrsi_status.db.DB

class Boot{
  def boot{
	DB.setup

	LiftRules.addToPackages("com.lrsi_status")

	def sitemap() = SiteMap(
	  Menu("Main") / "index" >> Hidden
	)

	LiftRules.setSiteMapFunc(() => sitemap())

	LiftRules.useXhtmlMimeType = false

	LiftRules.ajaxPostTimeout = Int.MaxValue
	LiftRules.ajaxRetryCount = Full(0)
        LiftRules.htmlProperties.default.set((r: Req) => new XHtmlInHtml5OutProperties(r.userAgent))
  }
}
