
def call(pipelineParams){

    
    def buidVersion = ${pipelineParams.buidVersion}

    node{
      stage("sample"){
          println "sample stage from shared library" pipelineParams.buidVersion
          
          println "buidVersion: " pipelineParams.buidVersion
      }
    }

}
