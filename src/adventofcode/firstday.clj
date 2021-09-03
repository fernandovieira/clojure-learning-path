(ns adventofcode.firstday
  (:require [clojure.string :as str])
  (:require [clojure.java.io :as input-out]))

(defn solvePartI
  "Find all my fifty star"
  [expenses]
  (loop [remaning-expenses expenses]
    (let [[first_elem & remainder] remaning-expenses]
      (if (empty? remaning-expenses) 0
          (let [result (reduce (fn[x y]
                                 (if (= (+ x y) 2020) (reduced (* x y))  first_elem)) first_elem remainder)]
            (if (= result first_elem) (recur remainder) result))))))

(defn readFileToList
  "Read a file with entries and return a list"
  []
  (def entries (str/split (slurp (input-out/resource "entries.txt")) #" "))
  (apply list (map #(Integer/parseInt (str/trim %)) entries)))

(defn resolveProblem
  "Now resolving the problem"
  []
  (def entries (readFileToList))
  (let [result (solvePartI entries)] result))

(defn produceTheAnswer
  "Multiplying them together must produce the answer"
  [myList]
  (def answer (reduce + myList))
  (if (= answer 2020) (reduce * myList) nil))

(defn runThroughList
  "Run through a list sum"
  [firstElement expense]
  (loop [my_list expense]
    (if (not= nil my_list)
      (let [[firstItem & reminder] my_list]
      (let [ result (produceTheAnswer (list firstElement firstItem (first reminder)))])
      (if (not= nil result) result (recur reminder)))))

 (defn solvePartII
  "Now three elements that sum it is equal 2020"
  []
  (def my_test '(1 3 4 2001 18 234 2))
  (loop [my_list my_test]
    (if (not= nil my_list)
      (let [[firstItem & reminder] my_list]
        (let [result (runThroughList firstItem reminder)])
        (if (not= nil result) result (recur reminder)))))
