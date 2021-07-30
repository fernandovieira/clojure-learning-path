(ns factorial.core-test
  (:require [clojure.test :refer :all]
            [factorial.factorial :refer :all]))

(deftest success
  (testing "Testing factorial function"
    (let [ f (with-in-str "5"  (-main) )]
           (println f)
           (is ( = 124 f)))))
