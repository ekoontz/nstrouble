= Dealing with Clojure namespaces =

<pre>

ekoontz@mac ~/nstrouble $ lein repl
nREPL server started on port 61492
REPL-y 0.2.0
Clojure 1.5.1
    Docs: (doc function-name-here)
          (find-doc "part-of-name-here")
  Source: (source function-name-here)
 Javadoc: (javadoc java-object-or-class-here)
    Exit: Control+D or (exit) or (quit)

user=> (load "nstrouble/foo")
nil
user=> (in-ns 'nstrouble.foo)
#<Namespace nstrouble.foo>
nstrouble.foo=> myval
42
nstrouble.foo=> myval2
43
nstrouble.foo=> Bye for now!ekoontz@mac ~/nstrouble $

</pre>
