(ns exercise2)

(defn only-greater-than-five
  "Get a new list of all items greater than five."
  [numberList]
  (filter #(> % 5) numberList))