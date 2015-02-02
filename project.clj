(defproject analytics-clj "0.3.0-tcc"
  :description "Idiomatic Clojure wrapper for the segment.io Java client"
  :url "http://ardoq.com"
  :repositories {"climate" "http://xdeps.ci.climatedna.net/maven"}
  :license {:name "MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :codox {:src-linenum-anchor-prefix "L"}
  :dependencies [[codox "0.6.6"]
                 [org.clojure/clojure "1.5.1"]
                 [com.github.segmentio/analytics "1.0.4"]]

  :plugins [[com.climate.plugins/tcc-base-project "2014.10.27T23.49.27.ac58238"]
            [com.climate.leiningen/lein-jenkins "000004.e9d2051"]]

  :profiles {:dev {:dependencies [[ch.qos.logback/logback-classic "1.0.13"]
                                  [ch.qos.logback/logback-core "1.0.13"]
                                  [org.slf4j/jcl-over-slf4j "1.7.5"]]}}
  :aliases {"package" ["do" "clean," "jar"]})
