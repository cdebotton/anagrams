(ns anagrams.core
  (require [clojure.string :as str])
  (:gen-class))

(defn sorted-lowercase
  [word]
  (sort (str/lower-case word)))

(defn split-words
  [words]
  (str/split words #"\s|\n"))

(defn find-anagrams
  [words]
  (->> words
       (group-by sorted-lowercase)
       (map (fn [[k vs]] vs))
       (filter (fn [vs] (> (count vs) 1)))))   

(defn -main
  [file]
  (->> (slurp file)
    (split-words)
    (find-anagrams)
    (println)
    (time)))
