rootProject.name = "kotlin-extensions"
include(
    "kotlin-extensions-collections",
    "kotlin-extensions-time",
    "kotlin-extensions-strings",
    "kotlin-extensions-standard",
    "kotlin-extensions-bytes",
    "kotlin-extensions-conversions",
    "kotlin-extensions-html",
    "kotlin-extensions-number",
    "kotlin-extensions-preconditions",
    "kotlin-extensions-tuples"
)

// TODO 
//  buildscript {
//      val tutteliPluginsVersion = "0.21.0"
//      repositories {
//          maven { url = uri("https://plugins.gradle.org/m2/") }
//      }
//      dependencies {
//          classpath("ch.tutteli:tutteli-gradle-settings:$tutteliPluginsVersion")
//      }
//  }
//  
//  apply(plugin ="ch.tutteli.settings")
//  
//  configure<SettingsUtilPluginExtension> { 
//      folder("collections", "collection-",  closureOf {
//          prefixed()
//      })
//  }
//  include {
//      
//      collections {
//          array
//          collections
//          map
//      }
//  }
