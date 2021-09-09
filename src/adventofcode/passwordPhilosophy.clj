(ns adventofcode.passwordPhilosophy
  (:require [clojure.string :as str])
)

(defn isPasswordValid
  "Password is valid against policies"
  [threshold character password]
  (let [ repetion (get (frequencies password)(.charAt character 0))]
    (let [ thresholds (str/split threshold #"-")]
      (if (and (<= (Integer/parseInt (get thresholds 0)) repetion)
               (>= (Integer/parseInt (get thresholds 1)) repetion)) true false)
  ))
)
