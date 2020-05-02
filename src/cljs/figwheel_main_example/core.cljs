(ns
  ^:figwheel-hooks ;; This enables the :after-load hook to work below.
  figwheel-main-example.core
  (:require
    [figwheel-main-example.pages.home :as pages.home]
    [figwheel-main-example.pages.not-found :as pages.not-found]
    [figwheel-main-example.state.application :as state.application]
    [re-frame.core :as rf]
    [reagent.core :as r]
    ))

;; -----------------------------------------------------------------------------
;; Reagent container

(defn container []
  (let [page (rf/subscribe [:application/page])]
    (fn []
      [:div
       (condp = @page
         :home [pages.home/page]
         [pages.not-found/page])])))

(defn mount-root []
  (r/render-component [container] (js/document.getElementById "app")))

(defn ^:after-load re-render []
  (mount-root))

;; -----------------------------------------------------------------------------
;; Application Start-Up

(defonce start-up
  (do (state.application/initialize-db)
      (mount-root)
      true))
