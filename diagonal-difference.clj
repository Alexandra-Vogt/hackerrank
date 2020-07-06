(defn get-diagonal [arr slope]
  (let [len (count arr)]
       (reduce
        (fn [acc idx]
          (+ acc (get-in arr [idx
                              (condp = slope
                                 :pos-slope (- (dec len) idx)
                                 :neg-slope idx)])))
        0
        (range len))))

(defn abs [n] (max n (- n)))

(defn diagonalDifference [arr]
  (abs (- (get-diagonal arr :neg-slope) (get-diagonal arr :pos-slope))))
