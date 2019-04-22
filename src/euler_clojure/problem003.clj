(ns euler-clojure.problem003)

(defn divide-by
  "divides n by i until it has a remainder"
  [n i]
  (loop [num n]
    (if (zero? (mod num i))
      (recur (/ num i))
      num)))

(defn get-largest
  "gets largest prime factor of n"
  [n]
  (let [limit (->> n Math/sqrt Math/round)]
    (loop [i 3
           largest 2
           num n]
      (if (< i limit)
        (let [divisible (zero? (mod num i))]
          (recur
           (+ i 2)
           (if divisible i largest)
           (if divisible (divide-by num i) num)))
        largest))))

; largest prime factor
(defn euler-3 [n]
  (let [n' (divide-by n 2)]
    (get-largest n')))