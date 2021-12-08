(ns year2021.day1.day1part1
  (:require [clojure.string :as str]))

(def test-input "src/year2021/day1/test-input.txt")
(def input "src/year2021/day1/input.txt")

(defn get-lines [file]
  (str/split-lines (slurp file)))

(def my-list (get-lines test-input))
(def num-list (map read-string my-list))



(println my-list)
(println (type my-list))

(println num-list)

(loop [[head & tail] num-list
       acc 0]
  (println head)
  (if (empty? tail)
    (println acc)
    (recur tail (inc acc))
    )
  )
