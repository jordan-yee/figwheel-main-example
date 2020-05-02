(ns figwheel-main-example.middleware
  "Custom middleware is defined here.
  See https://github.com/ring-clojure/ring/wiki/Concepts#middleware")

;; -----------------------------------------------------------------------------
;; wrap-content-type
;; This middleware is here as an example implementation, and not actually used.

(defn content-type-response [response content-type]
  (assoc-in response [:headers "Content-Type"] content-type))

(defn wrap-content-type [handler content-type]
  (fn
    ;; Synchronous handler
    ([request]
     (-> (handler request) (content-type-response content-type)))
    ;; Asynchronous handler
    ([request respond raise]
     (handler request #(respond (content-type-response % content-type)) raise))))
