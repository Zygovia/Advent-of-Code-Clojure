(ns year2021.day2.day2part1
  (:require [clojure.string :as str]))

(def test-input "src/year2021/day2/test-input.txt")
(def input "src/year2021/day2/input.txt")

(defn get-lines [file]
  (str/split-lines (slurp file)))

(def my-list (get-lines input))


; att tänka på, ist för x-pos och y-pos heter de horizontal och depth.
; ointuitivt så är up - och down +
(loop [[head & tail] my-list
       horizontal 0
       depth 0]
  (if head
    ; skulle kunna deconstruct:a head-splitted
    (let [head-splitted (str/split head #" ")
          number (read-string (last head-splitted))]
      (condp = (first head-splitted)
        "forward"
        (recur tail (+ horizontal number) depth)
        "up"
        (recur tail horizontal (- depth number))
        "down"
        (recur tail horizontal (+ depth number))
        )
      )
    (println "horizontal" horizontal ", depth" depth ", SVAR: " (* horizontal depth))
    )
  )