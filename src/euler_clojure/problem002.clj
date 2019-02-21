(ns euler-clojure.problem002)

(defn euler-2 [limit]
    (loop [a 0
           b 1
           sum 0]
      (if-not (>= b limit)
        (recur
         b
         (+ a b)
         (if (= 0 (mod b 2)) (+ sum b) sum))
        sum)))
  