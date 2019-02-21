(ns euler-clojure.problem001)

; multiples of 3 and 5
(defn euler-1 [n]
  (let [mults (fn [x] (or (zero? (mod x 3)) (zero? (mod x 5))))]
    (->> (range n) (filter mults) (reduce +))))