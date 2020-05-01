(defproject figwheel-main-example "0.1.0-SNAPSHOT"
  :description "A generic fullstack Clojure/ClojureScript example project for figwheel-main."
  :url "https://github.com/jordan-yee/figwheel-main-example.git"

  :dependencies [[org.clojure/clojure "1.10.0"]]

  :main ^:skip-aot figwheel-main-example.core
  :source-paths ["src/clj" "src/cljs"]
  :target-path "target/%s"

  :aliases {;; Use figwheel.main.api connection instead for Vim integration
            "fig" ["trampoline" "run" "-m" "figwheel.main"]}

  :profiles {:dev {:dependencies [[org.clojure/clojurescript "1.10.516"]
                                  [com.bhauman/figwheel-main "0.2.0"]]

                   ;; The following 2 keys are for figwheel.main:
                   :resource-paths ["target"]
                   :clean-targets ^{:protect false} ["target"]}
             :uberjar {:aot :all}})
