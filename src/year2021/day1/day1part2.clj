(ns year2021.day1.day1part2
  (:require [clojure.string :as str]))

;; till del 2: ta delta, så för 1 2 3 4 5 6 så vill du droppa deltat och jämföra:
;; 1 2 3 4 5 6 7 8
;; 4 5 6 7

(def test-input "src/year2021/day1/test-input.txt")
(def input "src/year2021/day1/input.txt")

(defn get-lines [file]
  (str/split-lines (slurp file)))

(def my-list (get-lines input))
(def num-list (map read-string my-list))

(def delta-list (drop 3 num-list))

(def result
  (->> (map < num-list delta-list)
       (filter identity)
       (count)))

(println result)