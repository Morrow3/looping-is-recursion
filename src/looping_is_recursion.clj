(ns looping-is-recursion)

(defn power [base exp]
  (let [helper (fn [n k]
                 (cond
                 (zero? n) 0
                 (zero? k) 1
                 (not(> k 1)) n
                  :else(recur(* base n)(dec k))))]
    (helper base exp)))

;(power 2 2)  ;=> 4
;(power 5 3)  ;=> 125
;(power 7 0)  ;=> 1
;(power 0 10) ;=> 0


(defn last-element [a-seq]
  (let [ helper (fn [seq]
                  (cond
                   (empty? seq) nil
                   (= (count seq)1) (first seq)
                   :else (recur (rest seq))


                   ))]
    (helper a-seq)))

;(last-element [])      ;=> nil
;(last-element [1 2 3]) ;=> 3
;(last-element [2 5])   ;=> 5

(defn seq= [seq1 seq2]
  (let [helper (fn [seq1 seq2]
                 (cond
                  (and (empty? seq1)(empty? seq2)) true
                  (and (not(empty? seq2)) (empty? seq1) ) false
                  (and (not(empty? seq1)) (empty? seq2)) false
                  (= (first seq1) (first seq2)) (recur (rest seq1) (rest seq2))
                  :else false

                  ))]
    (helper seq1 seq2)))

;(seq= [1 2 4] '(1 2 4))  ;=> true
 ; (seq= [] [])             ;=> true
  ;(seq= [1 2 nil] [1 2])   ;=> false
  ;(seq= [1 4 2] [1 2 4])   ;=> false
  ;(seq= [1 2 3] [1 2 3 4]) ;=> false
  ;(seq= [1 3 5] [])        ;=> false)


(defn find-first-index [pred a-seq]
  ":(")

(defn avg [a-seq]
  -1)

(defn parity [a-seq]
  ":(")

(defn fast-fibo [n]
  ":(")

(defn cut-at-repetition [a-seq]
  [":("])

