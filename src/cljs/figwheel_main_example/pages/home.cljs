(ns figwheel-main-example.pages.home
  "The application home page."
  (:require
    #_[reagent.core :as r]
    [re-frame.core :as rf]
    ))

(defn page []
  [:div
   [:h1
    {:style {:text-align "center"}}
    ;; Try editing this heading text to see it updated in the browser.
    "Home"]
   [:hr]
   [:div
    [:a
     {:href "#"
      :on-click #(rf/dispatch [:application/set-page :foo])}
     "Set non-existent page"]]
   [:p "This is the home page of the application!"]])
