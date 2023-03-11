(defn gcd [a b]
  (if (= b 0)
    a
    (recur b (rem a b))))


(gcd 480 1001)


