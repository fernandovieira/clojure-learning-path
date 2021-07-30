(ns factorial.factorial)

(defn do-math
  "Calculate factorial of number"
  [n, accumulator]
  (if (= 1 n) accumulator (do-math (dec n) (* n accumulator)))
  )

(defn -main
  "Read from Stdin"
  []
  (println "Calculate factorial of :")
  (let  [n (Integer/parseInt (read-line))] (do-math n 1)))

