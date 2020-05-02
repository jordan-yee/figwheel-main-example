(ns figwheel-main-example.pages.home
  "The definition and handler for the home page."
  (:require
    [hiccup.page :refer [html5 include-js]]
    ))

(def home-page
  (html5
    [:body
     [:div#app
      [:h1 "Loading..."]]
     (include-js "/cljs-out/dev-main.js")]))

(defn page-handler [_]
  home-page)
