(ns leiningen.autotest
  (:require [lazytest.watch :as lt]))

(defn autotest
  [project]
  (lt/start ["src" "test"])) 
