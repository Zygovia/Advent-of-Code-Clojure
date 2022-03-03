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

(loop [[head & tail] my-list
       prev-value nil
       acc 0]
    (println "index:" index "val:" head)
    (println "prev index:" (- index 1) "val at prev index:" (get my-list (- index 1)))
    (if (< head (get my-list (- index 1)))
      (recur tail (inc index) (inc acc))
      (if (empty? tail)
        (println "total acc:" acc)
        (recur tail (inc index) acc)))
  )
