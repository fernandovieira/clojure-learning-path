(ns factorial.function
  (:gen-class))

(defn -main
  "This is my first function"
  []
  (println "Println sucks in Clojure")
  )

(def increment (fn[x] (* x 2) ))

(defn increment_set
  []
  (map increment [1 2 3])
  )
   