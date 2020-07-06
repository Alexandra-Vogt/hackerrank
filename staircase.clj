(require '[clojure.string :as string])

(defn joincolls [& colls]
  (string/join (map string/join colls)))

(defn staircase [n]
  (dotimes [l n]
    (print (joincolls (repeat (- n l 1) " ")
                      (repeat (inc l) "#"))"\n")))
