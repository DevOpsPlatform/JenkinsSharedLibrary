#!/usr/bin/env groovy

def call(body){
    
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()
    
    def buidVersion = config.get("buidVersion")

    node{
      stage("sample"){
          println "sample stage from shared library ${config}"
          
          println "buidVersion: ${buidVersion}"
      }
    }

}
