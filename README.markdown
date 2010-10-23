# lein-autotest

A Leiningen plugin to start Lazytest's autowatch.

[Leiningen](http://github.com/technomancy/leiningen/)<br />
[Lazytest](http://github.com/stuartsierra/lazytest)

## Usage

Add these lines to your project.clj:

    :dev-dependencies [[com.stuartsierra/lazytest "1.1.2"]
                       [lein-autotest "1.1.0"]]
    :repositories {"stuartsierra-releases" "http://stuartsierra.com/maven2"}

Then run `lein deps`, then `lein autotest`, you should see this:

    ‹ ~/src/clj/ltat-test › ∴ lein autotest
    
    ======================================================================
    At  #<Date Fri Oct 22 23:11:39 MDT 2010>
    Reloading ltat-test.core
    foo
    
    Namespaces (no cases run)
    
    Ran 0 test cases.
    0 failures.
    
    Done.

## Installation

Until this exists on Clojars.org, you can use it by doing a `lein jar`, and
dropping the jar into $PROJECTHOME/lib/dev along with the lazytest jar. Now run
`lein help` and you should see `autotest` as an available command.

<del>This is super-alpha at the moment, since Lazytest hasn't even been released yet.</del>

