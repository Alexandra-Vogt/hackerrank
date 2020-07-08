(defn sum [nums] (reduce + 0 nums))

(defn miniMaxSum [arr]
  (let [sorted (sort arr)]
    (print (sum (take 4 sorted))
           (sum (take-last 4 sorted)))))

(miniMaxSum [1 2 3 4 342 34 235  6 78 1328 74239 1 1 34 93141 25])
