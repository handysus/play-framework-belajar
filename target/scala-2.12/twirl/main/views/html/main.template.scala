
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
            <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
        <title>Play</title>

            <!-- Bootstrap -->
        <link href=""""),_display_(/*12.22*/routes/*12.28*/.Assets.versioned("bower_components/bootstrap/dist/css/bootstrap.min.css")),format.raw/*12.102*/("""" rel="stylesheet">

            <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
            <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
            <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    </head>
    <body>

        <nav class="navbar navbar-default">
            <div class="container-fluid">
                    <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="/">CRUD</a>
                </div>

                    <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="#">Home <span class="sr-only">(current)</span></a></li>
                    </ul>
                </div>
                    <!-- /.navbar-collapse -->
            </div>
                <!-- /.container-fluid -->
        </nav>
        <div class="container">
            """),_display_(/*47.14*/content),format.raw/*47.21*/("""
        """),format.raw/*48.9*/("""</div>
            <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src=""""),_display_(/*50.23*/routes/*50.29*/.Assets.versioned("bower_components/jquery/dist/jquery.min.js")),format.raw/*50.92*/(""""></script>
            <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src=""""),_display_(/*52.23*/routes/*52.29*/.Assets.versioned("bower_components/bootstrap/dist/js/bootstrap.min.js")),format.raw/*52.101*/(""""></script>
    </body>
</html>"""))
      }
    }
  }

  def render(content:Html): play.twirl.api.HtmlFormat.Appendable = apply()(content)

  def f:(() => (Html) => play.twirl.api.HtmlFormat.Appendable) = () => (content) => apply()(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Jan 31 16:48:35 ICT 2018
                  SOURCE: D:/Play/belajar/play-framework-belajar/app/views/main.scala.html
                  HASH: cc2e24d81bba2c2e6aa16c2c20488b716748444f
                  MATRIX: 945->1|1057->18|1085->20|1543->451|1558->457|1654->531|3445->2295|3473->2302|3510->2312|3643->2418|3658->2424|3742->2487|3902->2620|3917->2626|4011->2698
                  LINES: 28->1|33->1|34->2|44->12|44->12|44->12|79->47|79->47|80->48|82->50|82->50|82->50|84->52|84->52|84->52
                  -- GENERATED --
              */
          