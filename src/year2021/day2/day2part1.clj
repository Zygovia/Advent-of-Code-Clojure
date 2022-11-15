(ns year2021.day2.day2part1
  (:require [clojure.string :as str]))

(def test-input "src/year2021/day2/test-input.txt")
(def input "src/year2021/day2/input.txt")

(defn get-lines [file]
  (str/split-lines (slurp file)))

(def my-list (get-lines input))

(loop [[head & tail] my-list
       x-pos 0
       y-pos 0
       ]
  (->> (str/split head " ")
       (cond identity
             "forward"
             (recur tail (inc x-pos) y-pos)
             "up"
             (recur tail x-pos (inc y-pos))
             "down"
             (recur tail x-pos (dec y-pos))

             )
       )
  )