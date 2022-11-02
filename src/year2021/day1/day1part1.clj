(ns year2021.day1.day1part1
  (:require [clojure.string :as str]))

;; Definierar två med paths till filerna
(def test-input "src/year2021/day1/test-input.txt")
(def input "src/year2021/day1/input.txt")

;; Definierar funktion som heter get-lines,
;; som tar emot ett arg file,
;; och som anropar str/split-lines med resultatet
;; av slurp file
(defn get-lines [file]
  (str/split-lines (slurp file)))

;; Skapar variabel my-list med test-input
;; Skapar variabel num-list, som mappar
(def my-list (get-lines test-input))
(def num-list (map read-string my-list))

(println my-list)
(println (type my-list))

(println num-list)

(loop [[head & tail] num-list
       prev-value nil
       acc 0]
  (if (nil? head)
    (println "total acc:" acc)
    (if (nil? prev-value)
      (recur tail head acc)
      (if (> head prev-value)
       (recur tail head (inc acc))
       (recur tail head acc)
      )
    )
  ))

;; till del 2: ta delta, så för 1 2 3 4 5 6 så vill du droppa deltat och jämföra:
;; 1 2 3 4 5 6 7 8
;; 4 5 6 7

(def delta-list (drop 3 num-list))
(println delta-list)


;(loop [[head & tail] num-list
;       prev-value nil
;       acc 0]
;  (let [compare-with-this-number nil]
;  (if (nil? compare-with-this-number)
;    (println "total acc:" acc)
;
;    (if (nil? prev-value)
;      (recur tail head acc)
;
;      (if (> compare-with-this-number prev-value)
;        (recur tail head (inc acc))
;        (recur tail head acc)
;        )
;      )
;    )))