(ns adventofcode.firstday)


(defn findMyStar
  "Find all my fifty star"
  [expenses]
  (loop [remaning-expenses expenses]
       (let [[first_elem & remainder] remaning-expenses]
         (if (empty? remaning-expenses) 0
         (let [result (reduce (fn[x y]
                                (if (= (+ x y) 2020) (reduced  (* x y))  first_elem)) first_elem remainder)]
          (if (= result first_elem) (recur remainder) result)))))
)


(defn readFile
  "Read a file with entries"
  []
  (def entries (list 1 2 3 )))
