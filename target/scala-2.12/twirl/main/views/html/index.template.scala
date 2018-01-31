
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
/*2.2*/import java.util

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[util.List[User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(tests: util.List[User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.26*/("""

"""),_display_(/*5.2*/main()/*5.8*/ {_display_(Seq[Any](format.raw/*5.10*/("""
    """),format.raw/*6.72*/("""
    """),format.raw/*7.5*/("""<h2>User</h2>

    <form method="post" action=""""),_display_(/*9.34*/routes/*9.40*/.HomeController.save()),format.raw/*9.62*/("""" class="form-inline">
        <div class="form-group">
            <input type="text" class="form-control" placeholder="First Name" name="fname" required>
        </div>
        <div class="form-group">
            <input type="text" class="form-control" placeholder="Last Name" name="lname" required>
        </div>
        <div class="form-group">
            <input type="number" class="form-control" placeholder="Year" name="year">
        </div>
        <div class="form-group">
            <input type="number" class="form-control" placeholder="Month" name="month">
        </div>
        <div class="form-group">
            <input type="number" class="form-control" placeholder="Date" name="date">
        </div>
        <input type="submit" value="Submit" class="btn btn-info" />
    </form>

    <table class="table">

        <thead>
            <tr>
                <th>Firstname</th>
                <th>Lastname</th>
                <th>Birthdate</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
        """),_display_(/*39.10*/for(test <- tests) yield /*39.28*/ {_display_(Seq[Any](format.raw/*39.30*/("""
            """),format.raw/*40.13*/("""<tr>
                <td>"""),_display_(/*41.22*/test/*41.26*/.getFirstName),format.raw/*41.39*/("""</td>
                <td>"""),_display_(/*42.22*/test/*42.26*/.getLastName),format.raw/*42.38*/("""</td>
                <td>"""),_display_(/*43.22*/test/*43.26*/.getBirthDate.format("dd/MM/yyy")),format.raw/*43.59*/("""</td>
                <td>
                    <a href="/update/"""),_display_(/*45.39*/test/*45.43*/.getObjectId),format.raw/*45.55*/("""">Edit</a>
                    <a href="/delete/"""),_display_(/*46.39*/test/*46.43*/.getObjectId),format.raw/*46.55*/("""">Delete</a>
                </td>
            </tr>
        """)))}),format.raw/*49.10*/("""
        """),format.raw/*50.9*/("""</tbody>
    </table>
""")))}),format.raw/*52.2*/("""

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
                  DATE: Wed Jan 31 17:17:43 ICT 2018
                  SOURCE: D:/Play/belajar/play-framework-belajar/app/views/index.scala.html
                  HASH: 1cb374ceae8d2b1ceb81089f565404dd9094f0c6
                  MATRIX: 651->1|679->24|1009->43|1128->67|1158->72|1171->78|1210->80|1243->153|1275->159|1351->209|1365->215|1407->237|2524->1327|2558->1345|2598->1347|2640->1361|2694->1388|2707->1392|2741->1405|2796->1433|2809->1437|2842->1449|2897->1477|2910->1481|2964->1514|3058->1581|3071->1585|3104->1597|3181->1647|3194->1651|3227->1663|3323->1728|3360->1738|3415->1763
                  LINES: 24->1|25->2|30->3|35->3|37->5|37->5|37->5|38->6|39->7|41->9|41->9|41->9|71->39|71->39|71->39|72->40|73->41|73->41|73->41|74->42|74->42|74->42|75->43|75->43|75->43|77->45|77->45|77->45|78->46|78->46|78->46|81->49|82->50|84->52
                  -- GENERATED --
              */
          