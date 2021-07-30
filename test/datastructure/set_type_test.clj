(ns datastructure.set_type_test
  (:require [clojure.test :refer :all])
  (:require [datastructure.setType :refer :all]))

(def mySet #{4 6})

(deftest sum
  (testing "Sum all elements from a set")
  (is (= 100 (sumSet mySet))))

