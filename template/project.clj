(defproject clojureapp "0.1.0-SNAPSHOT"
    :plugins [[lein-ring "0.9.1"]
			  [lein-environ "1.0.0"]
			  [lein-ancient "0.6.5"]
			  [lein-cljsbuild "1.0.6"]
			  [lein-figwheel "0.3.3"]]
    :dependencies [[org.clojure/clojure "1.7.0"]]
    :main webapp)


