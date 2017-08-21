(ns exercise3)

(defn fibonacci
  [n]
  (cond
    (= n 0) 0
    (= n 1) 1
    :else (+ (fibonacci (dec n)) (fibonacci (- n 2)))))