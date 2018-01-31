
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._
/*1.2*/import Entities.User
/*2.2*/import helper._
/*3.2*/import java.util

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[util.List[User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(tests: util.List[User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.26*/("""

"""),_display_(/*6.2*/main()/*6.8*/ {_display_(Seq[Any](format.raw/*6.10*/("""
    """),format.raw/*7.5*/("""<form method="post" action=""""),_display_(/*7.34*/routes/*7.40*/.HomeController.save()),format.raw/*7.62*/("""">
        User:
        <input type="text" placeholder="First Name" name="fname">
        <input type="text" placeholder="Last Name" name="lname">
        <input type="number" placeholder="Year" name="year">
        <input type="number" placeholder="Month" name="month">
        <input type="number" placeholder="Date" name="date">

        <input type="submit" value="Submit" />
    </form>
    <ul>

    """),_display_(/*19.6*/for(test <- tests) yield /*19.24*/ {_display_(Seq[Any](format.raw/*19.26*/("""
        """),format.raw/*20.9*/("""<li>"""),_display_(/*20.14*/test/*20.18*/.getFirstName),format.raw/*20.31*/(""" """),_display_(/*20.33*/test/*20.37*/.getLastName),format.raw/*20.49*/(""" """),format.raw/*20.50*/("""<a href="#">x</a></li>
    """)))}),format.raw/*21.6*/("""
    """),format.raw/*22.5*/("""</ul>
""")))}),format.raw/*23.2*/("""
"""))
      }
    }
  }

  def render(tests:util.List[User]): play.twirl.api.HtmlFormat.Appendable = apply(tests)

  def f:((util.List[User]) => play.twirl.api.HtmlFormat.Appendable) = (tests) => apply(tests)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Jan 31 09:53:22 ICT 2018
                  SOURCE: D:/Play/belajar/play-framework-belajar/app/views/index.scala.html
                  HASH: e33df36d08c43c2ee5ac89f3c12bd3998f3e08ea
                  MATRIX: 651->1|679->24|702->42|1032->61|1151->85|1181->90|1194->96|1233->98|1265->104|1320->133|1334->139|1376->161|1822->581|1856->599|1896->601|1933->611|1965->616|1978->620|2012->633|2041->635|2054->639|2087->651|2116->652|2175->681|2208->687|2246->695
                  LINES: 24->1|25->2|26->3|31->4|36->4|38->6|38->6|38->6|39->7|39->7|39->7|39->7|51->19|51->19|51->19|52->20|52->20|52->20|52->20|52->20|52->20|52->20|52->20|53->21|54->22|55->23
                  -- GENERATED --
              */
          