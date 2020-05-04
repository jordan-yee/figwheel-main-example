# figwheel-main-example

A generic fullstack Clojure/ClojureScript example project using figwheel-main.

## Included Components

### Development
- Figwheel Main
- yogthos/config for environment variables

### Back End
- Ring server
- Compojure routing
- Hiccup pages

### Front End
- Reagent components
- Re-frame state

## Installation

git clone https://github.com/jordan-yee/figwheel-main-example.git

## Usage

### Development Setup

Before starting development processes, clean old builds.
Figwheel may not reload the changes to your files if you don't:

    lein clean

To start the back end development server:

    lein ring server-headless

To start a figwheel development server w/ repl:

    lein fig -- -b dev -r

### Production Setup

To create the production JavaScript build:

    lein build-cljs-prod

To create the production server build, and package everything in a .jar:

    lein uberjar

To run the production server jar:

    java -jar <path-to-jar>

This can be found in ./target/uberjar/figwheel-main-example-<VERSION>-standalone.jar
