(ns figwheel-main-example.routes
  "A top-level handler defining the HTTP routes for the server."
  (:require
    [compojure.core :refer [defroutes GET]]
    [compojure.route :as route]
    [figwheel-main-example.pages.home :as home]
    ))

(defroutes routes-handler
  (GET "/" request (home/page-handler request))
  (route/not-found "<h1>Page not found</h1>"))
