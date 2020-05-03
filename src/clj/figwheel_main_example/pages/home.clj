(ns figwheel-main-example.pages.home
  "The definition and handler for the home page."
  (:require
    [config.core :refer [env]]
    [hiccup.page :refer [html5 include-js]]
    ))

(def app-js (if (= (:environment env) "dev")
              "/cljs-out/dev-main.js"
              "/js/figwheel_main_example.js"))

(def home-page
  (html5
    [:body
     [:div#app
      [:h1 "Loading..."]]
     (include-js app-js)]))

(defn page-handler [_]
  home-page)
