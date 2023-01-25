(ns year2021.day3.day3part1
  (:require [clojure.string :as str]))

(def test-input "src/year2021/day3/test-input.txt")
(def input "src/year2021/day3/input.txt")

(defn get-lines [file]
  (str/split-lines (slurp file)))

(def my-list (get-lines input))

