(ns figwheel-main-example.state.application
  "Application-level state."
  (:require
    [re-frame.core :as rf]
    ))

;; -------------------------------------
;; application

(rf/reg-sub
  :application
  (fn [db _]
    (:application db)))

;; -------------------------------------
;; page

(rf/reg-sub
  :application/page
  :<- [:application]
  (fn [application _]
    (:page application)))

(defn set-page-query  [db page]
  (assoc-in db [:application :page] page))

(rf/reg-event-db
  :application/set-page
  (fn [db [_ page]]
    (set-page-query db page)))

;; -----------------------------------------------------------------------------
;; Initialization

(rf/reg-event-db
  :application/initialize-db
  (fn [_ _]
    {:application {:page :home}}))

(defn initialize-db []
  (rf/dispatch-sync [:application/initialize-db]))
