(ns adventofcode.passwordPhilosophiTest
  (:require [clojure.test :refer :all]
            [adventofcode.passwordPhilosophy :refer :all]))


(deftest mustReturnPasswordValid
  (testing "Function validate a password against password policies"
   (let [result (isPasswordValid "1-3" "b" "bbbade")]
     (is (= result true)))))

(deftest mustReturnPasswordInValid
  (testing "Function validate a password against password policies"
    (let [result (isPasswordValid "1-3" "b" "bbbbbade")]
      (is (= result false)))))

(deftest mustReturnThreshHoldCharacterPassword
  (testing "Function which separate thresholds character and password ")
  (def inputEntry "1-3 b: abcde")
  (def policy (generatesPolicies inputEntry))
  (is (= (:rule policy) "1-3")))
