(if (= (+ 2 2) 4)
  (println "Maths works!")                                  ; this gets evaluated if 2 + 2 = 4
  (println "UH OH"))                                        ; this gets evaluated if 2 + 2 != 4
; => Maths works!
;    nil

(if (= (+ 2 2) 4)
  (do                                                       ; all of this gets evaluated if 2 + 2 = 4
    (println "Maths works!")
    (println "Maths still works!"))
  (println "UH OH"))
; => Maths works!
;    Maths still works!
;    nil

(println (cond (and true false)
               "Nope"
               (and true true)
               "Yes"
               (or true false)
               "Also yes"
               ))