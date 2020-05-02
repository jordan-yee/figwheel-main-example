(defproject figwheel-main-example "0.1.0-SNAPSHOT"
  :description "A generic fullstack Clojure/ClojureScript example project for figwheel-main."
  :url "https://github.com/jordan-yee/figwheel-main-example.git"

  :dependencies [;; Clojure
                 [org.clojure/clojure "1.10.0"]

                 ;; CLJ Libraries
                 [compojure "1.6.1"]
                 [ring/ring-core "1.8.1"]
                 [ring/ring-devel "1.8.1"]
                 [ring/ring-jetty-adapter "1.8.1"]]

  :plugins [[lein-ring "0.12.5"]]

  ;; lein-ring development setup
  ;; See https://github.com/ring-clojure/ring/wiki/Setup-for-development#setup-using-the-lein-ring-plugin
  :ring {:handler figwheel-main-example.core/app}

  :main ^:skip-aot figwheel-main-example.core
  :source-paths ["src/clj" "src/cljs"]
  :target-path "target/%s"

  :aliases {;; Use figwheel.main.api connection instead for Vim integration
            "fig" ["trampoline" "run" "-m" "figwheel.main"]
            "build-cljs-prod" ["trampoline" "run" "-m" "figwheel.main" "-bo" "prod"]}

  :profiles {:dev {:dependencies [;; ClojureScript
                                  [org.clojure/clojurescript "1.10.516"]

                                  ;; CLJS Libraries
                                  [com.bhauman/figwheel-main "0.2.4"]
                                  [reagent "0.8.1"]]

                   ;; The following 2 keys are for figwheel.main:
                   :resource-paths ["target"]
                   :clean-targets ^{:protect false} ["target"]}
             :uberjar {:aot :all}})
