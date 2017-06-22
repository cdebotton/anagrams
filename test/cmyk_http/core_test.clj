(ns anagrams.core-test
  (:require [clojure.test :refer :all]
            [anagrams.core :refer :all]))

(deftest can-group-anagrams-from-list
  (testing "Given a list of words, it will group them by words that are anagrams")
  (is (= (find-anagrams ["pinkish" "fender" "bender" "dog" "cat" "enlist" "kinship" "silent" "listen" "doggo" "inlets" "drizzly" "tac"])
         [["pinkish" "kinship"] ["cat" "tac"] ["enlist" "silent" "listen" "inlets"]])))
