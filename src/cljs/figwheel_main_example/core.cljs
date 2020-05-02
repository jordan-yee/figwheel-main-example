(ns
  ^:figwheel-hooks ;; This enables the :after-load hook to work below.
  figwheel-main-example.core
  (:require
    [figwheel-main-example.pages.home :as home]
    [reagent.core :as r]
    ))

(defn container []
  [home/home-page])

(defn mount-root []
  (r/render-component [container] (js/document.getElementById "app")))

(defn ^:after-load re-render []
  (mount-root))

(defonce start-up (do (mount-root) true))
