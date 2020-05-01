(defproject figwheel-main-example "0.1.0-SNAPSHOT"
  :description "A generic fullstack Clojure/ClojureScript example project for figwheel-main."
  :url "https://github.com/jordan-yee/figwheel-main-example.git"
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :main ^:skip-aot figwheel-main-example.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
