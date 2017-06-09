(ns jordan-b-peterson-biblical-series-1.core)


(def feelings-words-actions
  {:im-starving
   {:feeling :gumbling-of-the-belly
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
   :feeling #{}
   :unknown #{}})

(defn in-sync? [experienced-reality1 experience-quanta]
  "Is all dimensions of experience in sync with the named experience-quanta
   Worded in a different way. Do the words, actions, and feelings all line up to what is expected?"
  (every?
   true?
   (map
    #(contains? (experienced-reality1 (first %)) (second %))
    experience-quanta)))

