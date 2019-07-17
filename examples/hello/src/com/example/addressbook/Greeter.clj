;;;----------------------------------------------------------------------------------
;;; Generated by protoc-gen-clojure.  DO NOT EDIT
;;;
;;; GRPC com.example.addressbook.Greeter Service Implementation
;;;----------------------------------------------------------------------------------
(ns com.example.addressbook.Greeter
  (:require [protojure.protobuf.serdes :refer :all]
            [clojure.core.async :refer [<!! >!! <! >! go go-loop] :as async]
            [protojure.grpc.client.api :as grpc]
            [protojure.grpc.client.utils :refer [send-unary-params invoke-unary]]
            [com.example.addressbook]
            [promesa.core :as p]
            [protojure.grpc.server.core :as grpc-server]
             [io.pedestal.interceptor.helpers :refer [handler]]
             [com.example.addressbook :refer :all]))

;;----------------------------------------------------------------------------------
;;----------------------------------------------------------------------------------
;; GRPC Server Implementation
;;----------------------------------------------------------------------------------
;;----------------------------------------------------------------------------------

;-----------------------------------------------------------------------------
; GRPC Greeter
;-----------------------------------------------------------------------------
(defprotocol Greeter
  (Hello [this param]))

(defn- Hello-dispatch
  [ctx request]
  (Hello ctx request))

(def ^:const Greeter-Descriptors
  [{:pkg "com.example.addressbook" :service "Greeter" :method "Hello" :method-fn Hello-dispatch :server-streaming false :client-streaming false :input pb->Person :output new-HelloResponse}])

