(defproject anagrams "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://debotton.io"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot anagrams.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}
             :dev {:plugins [[venantius/ultra "0.5.1"]
                             [com.jakemccrary/lein-test-refresh "0.20.0"]]}})
