    (defn cartesian-product
      ([] '(()))
      ([xs & more]
       (mapcat #(map (partial cons %)
                     (apply cartesian-product more))
               xs)))


(cartesian-product '(a b c) [1 2 3])

(def flavors1 ["Vanilla", "Chocolate", "Cherry Ripple"])
(def flavors2 ["Lemon", "Butterscotch", "Licorice Ripple"])

(def all-flavors (concat flavors1 flavors2))

(defn main []
  (println "testing")

  (println
   (filter
    #(= (first %) "Chocolate")
    (cartesian-product flavors1 flavors2)))

  (println "")
  (println "")

  (println
   (filter
    #(or (= (first %) "Chocolate") (= (second %) "Chocolate"))
    (cartesian-product all-flavors all-flavors))))

(main)