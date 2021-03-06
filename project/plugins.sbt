addSbtPlugin("com.etsy" % "sbt-checkstyle-plugin" % "3.1.1")
resolvers += Resolver.url("joprice-sbt-plugins", url("http://dl.bintray.com/content/joprice/sbt-plugins"))(Resolver.ivyStylePatterns)
addSbtPlugin("com.github.joprice" % "sbt-jni" % "0.2.0")
addSbtPlugin("com.github.sbt" % "sbt-jacoco" % "3.0.3")
addSbtPlugin("com.github.sbt" % "sbt-findbugs" % "2.0.0")
addSbtPlugin("com.typesafe.sbt" % "sbt-osgi" % "0.9.3")
