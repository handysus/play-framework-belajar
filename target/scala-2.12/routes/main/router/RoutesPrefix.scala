
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Play/belajar/play-framework-belajar/conf/routes
// @DATE:Mon Jan 29 06:07:11 ICT 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
