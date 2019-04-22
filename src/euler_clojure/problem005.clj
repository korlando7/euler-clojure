(ns euler-clojure.problem005)

(defn gcd [a b]
  (if (zero? b)
    a
    (recur b (mod a b))))

(defn lcm [a b]
  (/ (* a b) (gcd a b)))

(defn euler-5 []
  (reduce lcm (range 11 21)))