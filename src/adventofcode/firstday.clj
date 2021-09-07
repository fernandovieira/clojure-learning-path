(ns adventofcode.firstday
  (:require [clojure.string :as str])
  (:require [clojure.java.io :as input-out]))

(defn solveProblem
  "Find all my fifty star"
  [expenses acumulator]
  (loop [remaning-expenses expenses]
    (let [[first_elem & remainder] remaning-expenses]
      (if (empty? remaning-expenses) 0
          (let [result (reduce (fn[x y]
                                 (if (= (+ x y acumulator) 2020) (reduced (* (if (= acumulator 0) 1 acumulator) x y))  first_elem)) first_elem remainder)]
            (if (= result first_elem) (recur remainder) result))))))

(defn readFileToList
  "Read a file with entries and return a list"
  []
  (def entries (str/split (slurp (input-out/resource "entries.txt")) #" "))
  (apply list (map #(Integer/parseInt (str/trim %)) entries)))

(defn solveFirstProblem
  "Now resolving the problem"
  []
  (def entries (readFileToList))
  (let [result (solveProblem entries 0)] result))

(defn solveSecondProblem
  "Now resolving the problem"
  []
  (def entries (readFileToList))
  (let [result (solveProblem entries 0)] result))

(defn problemWith3variables
  "Now three elements that sum it is equal 2020"
  [expenses]
  (loop [left_expenses expenses]
    (if (not= nil left_expenses)
      (let [[firstItem & reminder] left_expenses]
        (let [result (solveProblem reminder firstItem)]
          (if (not= 0 result) result (recur reminder)))))))
