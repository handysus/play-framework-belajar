
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Play/belajar/play-framework-belajar/conf/routes
// @DATE:Wed Jan 31 17:33:55 ICT 2018


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
