(defproject cheshire-cat "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2411"]
                 [cljs-http "0.1.37"]
                 [compojure "1.3.1"]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]
                 [ring/ring-defaults "0.1.2"]
                 [ring/ring-json "0.3.1"]
                 [enfocus "2.1.1"]]
  :plugins [[lein-ring "0.8.13"]
            [lein-cljsbuild "1.0.6"]]
  :ring {:handler cheshire-cat.handler/app}
  :cljsbuild {
              :builds [
                       {
                        :source-paths ["src-cljs"]
                        :compiler {
                                   :output-to "resources/public/main.js"
                                   :optimizations :whitespace
                                   :pretty-print true
                                   }
                        }
                       ]
              }
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring-mock "0.1.5"]]}})
