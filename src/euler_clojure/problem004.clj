(ns euler-clojure.problem004)

(defn reverse-num [n]
  (->> n str reverse clojure.string/join Integer/parseInt))

(defn is-palindrome [n]
  (= n (reverse-num n)))

(defn nums []
  (for [i (range 100 1000)
        j (range 100 1000)]
    (* i j)))

(defn euler-4 []
  (->> (nums) (filter is-palindrome) (apply max)))