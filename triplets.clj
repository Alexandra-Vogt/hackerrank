(defn compareTriplets [a b]
  (reduce
   (fn [acc val]
     (let [as (nth acc 0)
           bs (nth acc 1)
           ap (nth val 0)
           bp (nth val 1)]
       (condp apply [ap bp]
        = acc
        > [(inc as) bs]
        < [as (inc bs)])))
   [0 0]
   (map vector a b)))
