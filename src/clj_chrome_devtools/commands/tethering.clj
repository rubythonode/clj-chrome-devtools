(ns clj-chrome-devtools.commands.tethering
  "The Tethering domain defines methods and events for browser port binding."
  (:require [clj-chrome-devtools.impl.define :refer [define-domain]]))
(define-domain "Tethering")