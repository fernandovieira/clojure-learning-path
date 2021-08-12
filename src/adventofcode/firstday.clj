(ns adventofcode.firstday
  (:require [clojure.string :as str])
  (:require [clojure.java.io :as input-out]))

(defn findMyStar
  "Find all my fifty star"
  [expenses]
  (loop [remaning-expenses expenses]
    (let [[first_elem & remainder] remaning-expenses]
      (if (empty? remaning-expenses) 0
          (let [result (reduce (fn[x y]
                                 (if (= (+ x y) 2020) (reduced (* x y))  first_elem)) first_elem remainder)]
            (if (= result first_elem) (recur remainder) result)))))
            ;;#dbg ^{:break/when (=  result first_elem)}
)

(defn readFileToList
  "Read a file with entries and return a list"
  []
  (def entries (str/split (slurp (input-out/resource "entries.txt")) #" "))
  (apply list (map #(Integer/parseInt (str/trim %)) entries)))

(defn resolveProblem
  "Now resolving the problem"
  []
  (def entries (readFileToList))
  (let [result (findMyStar entries)]
    result))
