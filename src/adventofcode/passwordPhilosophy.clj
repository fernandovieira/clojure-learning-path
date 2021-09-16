(ns adventofcode.passwordPhilosophy
  (:require [clojure.string :as str])
)

(defn isPasswordValid
  "Password is valid against policies"
  [threshold character password]
  (let [ repetion (get (frequencies password)(.charAt character 0))]
    (let [ thresholds (str/split threshold #"-")]
      (if (and (<= (Integer/parseInt (get thresholds 0)) repetion)
               (>= (Integer/parseInt (get thresholds 1)) repetion)) true false))))

;;(defn transform)
;; ({rule: "1-3" char:"b" password:"bailable"})
(defn generatesPolicies
  "After a inputEntry generate policies map"
  [inputEntry]
  (defstruct Policies :rule :char :passowrd)
  (def splitpolicies (str/split inputEntry #" "))
  (def policies (struct Policies (get splitpolicies 0) (get splitpolicies 1) (get splitpolicies 2)))
  policies)
