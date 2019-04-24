(ns euler-clojure.problem006)

(defn square [n]
  (* n n))

(defn sum-of-squares [n]
(->> n
  inc
  (range 1)
  (map square)
  (reduce +)))

(defn square-of-sums [n]
  (->> n
    inc
    (range 1)
    (reduce +)
    square))

(defn euler-6 []
  (- (square-of-sums 100) (sum-of-squares 100)))