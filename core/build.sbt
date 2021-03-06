name := "nordpol-core"

// Do not append Scala versions to the generated artifacts
crossPaths := false

// Prevents the scala stdlib from beeing included automatically
autoScalaLibrary := false

javacOptions in (Compile, compile) ++= Seq("-source", "1.6", "-target", "1.6", "-Xlint:unchecked", "-Xlint:deprecation")
