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
