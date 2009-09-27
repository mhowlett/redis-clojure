(ns redis.client
  (:refer-clojure :exclude [send])
  ;(:require redis.client.default)
  )

(def *client-type* :default)

(defmulti make-client (fn [& _] *client-type*))

(defmulti reply-seq (fn [& _] *client-type*))


(defmulti read (fn [& _] *client-type*))
(defmulti read-line (fn [& _] *client-type*))

(defmulti send (fn [& _] *client-type*))
(defmulti get-reader (fn [& _] *client-type*))
