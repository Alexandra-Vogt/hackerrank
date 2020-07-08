(defn birthdayCakeCandles [ar]
  (let [max-val (apply max ar)]
    (->> ar
         (filter #{max-val})
         (count))))
