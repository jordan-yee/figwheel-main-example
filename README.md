# figwheel-main-example

A generic fullstack Clojure/ClojureScript example project that uses figwheel-main.

Figwheel-main is a ClojureScript development tool whose primary function is to facilitate
hot reloading of your ClojureScript web application. When you save a ClojureScript file, it's
automatically recompiled into JavaScript and injected into your application while its
running in the browser.

To test it, follow the development setup steps below, and after the application home page
is loaded in your browser, update the page heading text in the home.cljs file. This file
can be found in the project at:

    ./src/cljs/figwheel_main_example/pages/home.cljs

## Installation

git clone https://github.com/jordan-yee/figwheel-main-example.git

## Included Components

### Development
- Figwheel Main - ClojureScript compilation and hot reloading
- yogthos/config - read project config and/or environment variables

### Back End
- Ring - to write a web server in Clojure
- Compojure - define routes for a Ring server
- Hiccup - write HTML using a MUCH better syntax

### Front End
- Reagent - a React wrapper for ClojureScript
- Re-frame - efficiently manage state for Reagent components

## Not Included Components
- Database
- Authentication/Authorization
- Client-side routing that updates the URL/browser history
- A library such as Component to manage system reloading
  (Though lein ring does reload server side code)

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
