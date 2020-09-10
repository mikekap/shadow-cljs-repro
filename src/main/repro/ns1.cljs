(ns repro.ns1)

(defonce throwit
         (fn throwit [e]
           (when (zero? (rand-int 1))
             (throw e))))

(defn i-am-an-fn
  []
  (println "running-fn")
  (throwit (ex-info "i-am-an-fn" {})))

(defn i-am-an-fn-2
  []
  (println "running-fn-2")
  (throwit (ex-info "i-am-an-fn-2" {})))
