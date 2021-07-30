(ns adventofcode.firstday_test
  (:require [clojure.test :refer :all]
            [adventofcode.firstday :refer :all]))


(def advocateExample (list 1721 979 366 299 675 1456))

(def advocateExampleFalse (list 1721 979 366 300 675 1456))

(deftest mustReturn514579
  (testing "Test example of the challenge"
  (let [result (findMyStar advocateExample)]
  (is ( = result 514579)))))

(deftest mustReturnZero
  (testing "Test when there isn't any star"
    (let [result (findMyStar advocateExampleFalse)]
      (is ( = result 0)))))

(deftest mustReturnaList
  (testing "Read a file and must return a list"
    (let [mylist (readFile)]
      (is (list? mylist)))))
