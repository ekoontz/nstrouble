(ns nstrouble.foo
  (:refer-clojure :exclude [get-in])
  (:require [nstrouble.core :refer :all]
            [clojure.core :as core]))

(def myval (get-in 'a 'b 'c))

(def myval2 (core/get-in '{:a 43} [:a]))











