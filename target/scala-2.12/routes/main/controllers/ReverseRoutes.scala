
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Play/belajar/play-framework-belajar/conf/routes
// @DATE:Wed Jan 31 17:33:55 ICT 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def searchByFirstName(fName:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("fName", fName)))
    }
  
    // @LINE:11
    def delete(objId:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("objId", objId)))
    }
  
    // @LINE:10
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "save")
    }
  
    // @LINE:9
    def updating(objId:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updating/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("objId", objId)))
    }
  
    // @LINE:7
    def update(objId:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "update/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("objId", objId)))
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:15
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
