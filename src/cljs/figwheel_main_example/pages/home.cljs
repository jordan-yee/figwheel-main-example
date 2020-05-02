(ns figwheel-main-example.pages.home
  "The application home page."
  (:require
    #_[reagent.core :as r]
    ))

(defn page []
  [:div
   [:h1
    {:style {:text-align "center"}}
    "Home"]
   [:hr]
   [:p "This is the home page of the application!"]])
