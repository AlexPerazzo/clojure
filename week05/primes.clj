




(defn decode_prime_list [elements, x]
  (cond
    (= (first elements) 1) (println x))
  (if (empty? (rest elements))
    (println "It's empty")
    (if (= (first elements) 0)
      (recur (rest elements) (+ x 1))
      (recur (rest elements) (+ x (first elements))))))


(decode_prime_list [1, 1, 0, 1, 0, 1, 3, 1, 0, 1, 3, 1, 0, 1, 3, 1, 5, 1, 0, 1, 5, 1, 3, 1, 0, 1, 3, 1, 5, 1, 5, 1, 0, 1, 5, 1, 3, 1, 0, 1, 5, 1, 3, 1, 5, 1, 7, 1, 3], 2)
(decode_prime_list [1,0,1,1], 2)
