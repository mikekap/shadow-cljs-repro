(ns repro.main
  (:require [repro.ns1 :as ns1]))

(enable-console-print!)

;; defonce isn't optimized, so this should be in the output
(defonce bounce
         (fn bounce [f]
           (f)))

(defn run
  []
  (js/setInterval
    (fn []
      (if (zero? (rand-int 2))
        (bounce ns1/i-am-an-fn)
        (bounce ns1/i-am-an-fn-2)))
    5000))
