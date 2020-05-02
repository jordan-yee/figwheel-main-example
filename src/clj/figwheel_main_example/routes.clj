(ns figwheel-main-example.routes
  "A top-level handler defining the HTTP routes for the server."
  (:require
    [compojure.core :refer [defroutes GET]]
    [compojure.route :as route]
    ))

(defn page-handler [_]
  "<h1>Hello World</h1>")

(defroutes routes-handler
  (GET "/" request (page-handler request))
  (route/not-found "<h1>Page not found</h1>"))
