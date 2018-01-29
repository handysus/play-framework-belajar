
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(tests: List[User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.21*/("""

"""),_display_(/*4.2*/main()/*4.8*/ {_display_(Seq[Any](format.raw/*4.10*/("""
    """),format.raw/*5.5*/("""<form method="post">
        User:
        <input type="text" placeholder="First Name" name="fname" value="">
        <input type="text" placeholder="Last Name" name="lname" value="">
        <input type="number" placeholder="Year" name="year" value="">
        <input type="number" placeholder="Month" name="month" value="">
        <input type="number" placeholder="Date" name="date" value="">
    </form>
    <ul>
    """),_display_(/*14.6*/for(test <- tests) yield /*14.24*/ {_display_(Seq[Any](format.raw/*14.26*/("""
        """),format.raw/*15.9*/("""<li>"""),_display_(/*15.14*/test/*15.18*/.getFirstName),format.raw/*15.31*/(""" """),_display_(/*15.33*/test/*15.37*/.getLastName),format.raw/*15.49*/(""" """),format.raw/*15.50*/("""<a href="#">x</a></li>
    """)))}),format.raw/*16.6*/("""
    """),format.raw/*17.5*/("""</ul>
""")))}),format.raw/*18.2*/("""
"""))
      }
    }
  }

  def render(tests:List[User]): play.twirl.api.HtmlFormat.Appendable = apply(tests)

  def f:((List[User]) => play.twirl.api.HtmlFormat.Appendable) = (tests) => apply(tests)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Jan 29 06:39:46 ICT 2018
                  SOURCE: D:/Play/belajar/play-framework-belajar/app/views/index.scala.html
                  HASH: ead56952343080878c754db43dde2ab87023d929
                  MATRIX: 651->1|980->24|1094->43|1124->48|1137->54|1176->56|1208->62|1665->493|1699->511|1739->513|1776->523|1808->528|1821->532|1855->545|1884->547|1897->551|1930->563|1959->564|2018->593|2051->599|2089->607
                  LINES: 24->1|29->2|34->2|36->4|36->4|36->4|37->5|46->14|46->14|46->14|47->15|47->15|47->15|47->15|47->15|47->15|47->15|47->15|48->16|49->17|50->18
                  -- GENERATED --
              */
          