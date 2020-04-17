
def call(pipelineParams){

    node{
      stage("sample"){
          println "Sample stage from shared library $pipelineParams.buidVersion "
      }
    }

}
