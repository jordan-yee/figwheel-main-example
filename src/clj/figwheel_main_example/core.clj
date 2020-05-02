(ns figwheel-main-example.core
  (:require
    [figwheel-main-example.routes :as routes]
    [ring.adapter.jetty :as jetty]
    [ring.middleware.content-type :refer [wrap-content-type]]
    [ring.middleware.not-modified :refer [wrap-not-modified]]
    [ring.middleware.params :refer [wrap-params]]
    [ring.middleware.resource :refer [wrap-resource]]
    )
  (:gen-class))

(defn handler [request]
  (routes/routes-handler request))

(def app
  (-> handler
      (wrap-resource "public")
      (wrap-content-type)
      (wrap-not-modified)
      (wrap-params)))

(defn -main
  "Start the application web server."
  [& args]
  (jetty/run-jetty app {:port 3000}))
