(ns adventofcode.firstday_test
  (:require [clojure.test :refer :all]
            [adventofcode.firstday :refer :all]))


 (def advocateExample (list 979 1721 366 299 675 1456))

(def advocateExampleFalse (list 1721 979 366 300 675 1456))

(deftest mustReturn514579
  (testing "Test example of the challenge"
  (let [result (solvePartI advocateExample)]
  (is ( = result 514579)))))

(deftest mustReturnZero
  (testing "Test when there isn't any star"
    (let [result (solvePartI advocateExampleFalse)]
       (is ( = result 0)))))

(deftest mustReturnaList
  (testing "Read a file and must return a list"
    (let [mylist (readFileToList)]
      (let [[first & rem] mylist])
      (is (list? mylist)))))

(deftest mustReturn1006176
  (testing "This is solve the advent of code day 1"
   (let [result (resolveProblem)]
     (is (= 1006176 result)))))

(deftest mustReturn241861950
  (testing "Test example of the challenge"
    (let [result (sumThreeElements advocateExample)]
      (is ( = result 241861950)))))
