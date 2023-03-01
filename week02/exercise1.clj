;; testing function shown in video
(defn greetings [name] (println "Hello" name))
(greetings "teacher")

(defn exercise-math [x y z]
  (println (+ x y z))
  (println (* x y z))
  (println (/ x y z))
  (println (+ (* x x) (* 3 y) z))
  (println (+ (int (Math/pow z x)) (int (Math/pow x z))))
  (println (+ (/ z y) x))
  (println (+ (* x y z) 1))
  (println (- (* x y z) 1)))

(exercise-math 1 2 3)
def int 5



(defn exercise-logic [a b c]
  (println (> a b))
  (println (> b a))
  (println (< a b))
  (println (< b c))
  (println (>= c c))
  (println (= a c))
  (println (<= a b))
  (println (and (< a b) (> b c)))
  (println (or (< a b) (> b c))))

(exercise-logic 1 2 3)

