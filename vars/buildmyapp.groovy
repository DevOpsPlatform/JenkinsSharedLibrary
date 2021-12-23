
def call(props){

    node{
      stage("call method"){
          println "Sample stage from shared library, pritnting project version:  $props.buidVersion "
          
          println "Sample stage from shared library, pritnting project name: $props.myprojectName "
          
      }
    }

}


def build(props){

    node{
      stage("build method"){
          println "Sample stage from shared library $props.buidVersion "
      }
    }

}
