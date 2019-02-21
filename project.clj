(defproject euler-clojure "0.1.0-SNAPSHOT"
  :description "Project Euler challenges in Clojure"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot euler-clojure.core
  :target-path "target/%s"
  :plugins [[lein-cljfmt "0.6.4"]]
  :profiles {:uberjar {:aot :all}})
