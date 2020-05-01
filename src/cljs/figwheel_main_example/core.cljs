(ns figwheel-main-example.core
  (:require
    [reagent.core :as r]
    ))

(defn hello-world []
  [:div "Hello, World!"])

(defn mount-root []
  (r/render-component [hello-world] (js/document.getElementById "app")))

(mount-root)
