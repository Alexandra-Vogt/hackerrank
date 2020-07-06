(defn plusMinus [arr]
  (let [len (count arr)]
    (->> arr
        (reduce (fn [acc val] (conj acc
                                    (cond (< 0 val) {:pos (inc (:pos acc))}
                                          (> 0 val) {:neg (inc (:neg acc))}
                                          :else     {:zero (inc (:zero acc))})))
                {:pos 0.0
                 :neg 0.0
                 :zero 0.0})
        ((fn [acc] (print (/ (:pos acc) len) "\n"
                         (/ (:neg acc) len) "\n"
                         (/ (:zero acc) len) "\n"))))))
