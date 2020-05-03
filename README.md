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

To start the back end development server:

    lein ring server-headless

To start a figwheel development server w/ repl:

    lein fig -- -b dev -r

### Production Setup

To create a production JavaScript build:

    lein build-cljs-prod
