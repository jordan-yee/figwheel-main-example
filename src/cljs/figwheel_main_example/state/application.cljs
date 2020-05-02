(ns figwheel-main-example.state.application
  "Application-level state."
  (:require
    [re-frame.core :as rf]
    ))

(rf/reg-sub
  :application/page
  (fn [db _]
    (:page db)))

(rf/reg-event-db
  :application/initialize-db
  (fn [_ _]
    {:page :home}))

(defn initialize-db []
  (rf/dispatch-sync [:application/initialize-db]))
