(if (= (+ 2 2) 4)
  (println "Maths works!")                                  ; this gets evaluated if 2 + 2 = 4

  (println "UH OH")

  )                                        ; this gets evaluated if 2 + 2 != 4
; => Maths works!
;    nil

(if (= (+ 2 2) 4)
  (do                                                       ; all of this gets evaluated if 2 + 2 = 4
    (println "Maths works!")
    (println "Maths still works!")
    4)
  (do
    (println "UH OH")
    "en sträng")
  )
; => Maths works!
;    Maths still works!
;    nil

(println (cond (and true false)
               "Nope"

               (and true true false)
               "Yes"

               (or false false)
               "Also yes"

               true
               123
               ))

(println "yay")
(def my-var 6.5)
(println my-var)
(+ 1 2)
(+ my-var 4)

(and 1 2 3)

(def testv 76)
(or nil 123)
(or false nil false)

(and  1 2 3)
