(ns jordan-b-peterson-biblical-series-1.core)


(def feelings-words-actions
  {:im-starving
   {:feeling :grumbling-of-the-belly
    :words "I'm starving"
    :action nil}
  :i-love-you
   {:words "I love you"
    :feeling :warmness-in-heart
    :action :empathy}
  :desire-to-get-fit
   {:words "I am going to work out every day and eat healthy"
    :action :work-out-and-eat-healthy
    :feeling :determination-and-committment}})

(def experienced-reality1
  {:action #{:eat}
   :words #{"I'm starving"}
   :feeling #{}})

(defn in-sync? [experienced-reality1 experience-quanta]
  "Is all dimensions of experience in sync with the named experience-quanta
   Worded in a different way. Do the words, actions, and feelings all line up to what is expected?"
  (every?
   true?
   (map
    #(contains? (experienced-reality1 (first %)) (second %))
    experience-quanta)))



(def are-you-actuall-starving? (in-sync? experienced-reality1
                                         (feelings-words-actions :im-starving)))

;; The way we behave contains more information than we know.
(defn psycho-analyze [experienced-reality]
  (if (and
       (contains? (experienced-reality :action) :eat)
       (contains? (experienced-reality :words) "I'm starving")
       (not (contains? (experienced-reality :feeling) :grumbling-of-the-belly))
       )
    "You are eating out of depression. You aren't actually starving, but you are filling a void with food."
    "You seem normal"))

(def analysis (psycho-analize experienced-reality1))
