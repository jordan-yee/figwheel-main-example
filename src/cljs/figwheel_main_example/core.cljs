(ns
  ^:figwheel-hooks ;; This enables the :after-load hook to work below.
  figwheel-main-example.core
  (:require
    [reagent.core :as r]
    ))

(defn hello-world []
  [:div "Hello, World!"])

(defn mount-root []
  (r/render-component [hello-world] (js/document.getElementById "app")))

(defn ^:after-load re-render []
  (mount-root))

(defonce start-up (do (mount-root) true))
