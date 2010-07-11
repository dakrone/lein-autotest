# lein-autotest

A Leiningen plugin to start Lazytest's autowatch.

Leiningen: http://github.com/technomancy/leiningen/
Lazytest : http://github.com/stuartsierra/lazytest

## Usage

Add this line to your project.clj:

    :dev-dependencies [[com.staurtsierra/lazytest "1.0.0-SNAPSHOT"]
                       [lein-autotest "1.0.0"]]

Then run `lein deps`, then `lein autotest`, you should see this:

    ‹ ~/src/clj/ltat-test › ∴ lein autotest
    
    Reloading ltat-test.core
    Running examples at #<Date Sat Jul 10 23:04:08 MDT 2010>
    
    
    Ran 0 examples.
    0 failures, 0 errors, 0 pending

## Installation

Until this exists on Clojars.org, you can use it by doing a `lein jar`, and
dropping the jar into $PROJECTHOME/lib/dev along with the lazytest jar. Now run
`lein help` and you should see `autotest` as an available command.

This is super-alpha at the moment, since Lazytest hasn't even been released yet.

