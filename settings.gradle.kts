rootProject.name = "kotlin-extensions"
include("kotlin-extensions-collections", "kotlin-extensions-time")

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
