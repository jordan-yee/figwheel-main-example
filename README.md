# figwheel-main-example

A generic fullstack Clojure/ClojureScript example project for figwheel-main.

## Included Features

### Development
- Figwheel Main

### Back End
- Ring-based web server

### Front End
- Reagent

## Installation

git clone https://github.com/jordan-yee/figwheel-main-example.git

## Usage

To start the back end development server:

    lein ring server-headless

To start a figwheel development server w/ repl:

    lein fig -- -b dev -r

To create a production JavaScript build:

    lein build-cljs-prod
