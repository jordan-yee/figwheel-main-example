(ns
  ^:figwheel-hooks ;; This enables the :after-load hook to work below.
  figwheel-main-example.core
  (:require
    [figwheel-main-example.pages.home :as home]
    [figwheel-main-example.pages.not-found :as not-found]
    [re-frame.core :as rf]
    [reagent.core :as r]
    ))

;; -----------------------------------------------------------------------------
;; Re-frame state

(rf/reg-sub
  :page
  (fn [db _]
    (:page db)))

(rf/reg-event-db
  :initialize-db
  (fn [_ _]
    {:page :home}))

(defn initialize-db []
  (rf/dispatch-sync [:initialize-db]))

;; -----------------------------------------------------------------------------
;; Reagent page container

(defn not-found-page []
  [:h1 "Page Not Found"])

(defn container []
  (let [page @(rf/subscribe [:page])]
    (case page
      :home [home/page]
      [not-found/page])))

(defn mount-root []
  (r/render-component [container] (js/document.getElementById "app")))

(defn ^:after-load re-render []
  (mount-root))

;; -----------------------------------------------------------------------------
;; Application Start-Up

(defonce start-up
  (do (initialize-db)
      (mount-root)
      true))
