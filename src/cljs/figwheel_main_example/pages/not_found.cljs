(ns figwheel-main-example.pages.not-found
  "The not-found page."
  (:require
    #_[reagent.core :as r]
    [re-frame.core :as rf]
    ))

(defn page []
  [:div
   [:h1 "Page Not Found"]
   [:a
    {:href "#"
     :on-click #(rf/dispatch [:application/set-page :home])}
    "Home Page"]])
